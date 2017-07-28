package com.siriuscom.exception;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionLogic {

	public void methodThrowingException() {
		//it needs try catch or throws
		try {
			throw new IOException();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public ExceptionLogic(){
		
	}
	
	public void giveMeEnumerator() {
		
		boolean tryAgain = true;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		while(tryAgain) {
			try {
				System.out.println("Give me a numerator");
				String input = scan.nextLine();
				if(!input.startsWith("Q") && !input.startsWith("q")) {
					int numerator = Integer.parseInt(input);
					System.out.println("Give me a denominator");
					int divisor = Integer.parseInt(scan.nextLine());
					System.out.println(numerator/divisor);
				}
				tryAgain = false;
			}
			catch(Exception e) {
				System.out.println("There was a problem with your input try again.");
			}
			finally {
				if(!tryAgain) {
					System.out.println("Thank you for using the application!");
				}
			}
		}
	}
	
	/*
	 * 4. Write a program to take care of Number Format Exception if users enters values other that integer for calculating average of marks ten students. 
	 * Do not allow program to terminate but again continue with program after giving respective messgae to User. 
	 * In the same program wrte your own exception classes to tale care of 
	 * Negative values and values out of range i.e other than in the range of 0-100 and do not allow program to terminate to terminate.
	 * 
	 * */
	
	public void numFormatExceptionMethod() {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Type in 10 students marks.");
		int[] nums = new int[10];
		int counter = 0;
		while(counter < 10) {
			try {
				String input = scan.nextLine();
				int grade = Integer.parseInt(input);
				System.out.println(grade);

				if(grade < 0) {
					throw new NegativeException("Mark can't be less than 0: " + grade);
				}
				if(grade > 100) {
					throw new OutOfGradeRangeException("Grade is too high: " + grade);
				}
				nums[counter] = grade;
				counter++;
				System.out.println(counter);
			}
			catch(NumberFormatException e) {
				System.out.println("Bad stuff");
			} catch (NegativeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (OutOfGradeRangeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch(Exception e) {
				System.out.println("Bad stuff");
			}
		}
		int length = nums.length;
		int total = 0;
		for(int i = 0; i < length; i++) {
			total += nums[i];
		}
		System.out.println("Average is: " + (total/length));
	}
}
