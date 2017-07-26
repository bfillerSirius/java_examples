package com.siriuscom.training;

public class TrainingExercises {

	public int[][] createArray(int n) {
		
		int[][] tempArray = new int[n][n]; 
		int counter = 1;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				tempArray[i][j] = counter;
				counter++;
			}
		}
		return tempArray;
	}
	
	public int[][] transposeArray(int[][] inputArray) {
		int length = inputArray.length;
		int[][] tempArray = new int[length][length]; 
		for(int i = 0; i < length; i++) {
			for(int j = 0; j < length; j++) {
				tempArray[j][i] = inputArray[i][j];
			}
		}
		return tempArray;
	}
	
	public void printArray(int[][] inputArray) {
		
	}
	

	
	public double examPointsConditions(double i){
		double grade = 0;
		if(i <= 49.5) {
			grade = 5.0;
			return grade;
		}
		else if(i < 60 && i >= 50) {
			grade = 4.7;
			return grade;
		}
		else if(i < 65 && i >= 60) {
			grade = 4.0;
			return grade;
		}
		else if(i < 70 && i >= 65) {
			grade = 3.7;
			return grade;
		}
		else if(i < 75 && i >= 70) {
			grade = 3.3;
			return grade;
		}
		else if(i < 80 && i >= 75) {
			grade = 3.0;
			return grade;
		}
		else if(i < 85 && i >= 80) {
			grade = 2.7;
			return grade;
		}
		else if(i < 90 && i >= 85) {
			grade = 2.3;
			return grade;
		}
		else if(i < 95 && i >= 90) {
			grade = 2.0;
			return grade;
		}
		else if(i < 100 && i >= 95) {
			grade = 1.7;
			return grade;
		}
		else if(i < 105 && i >= 100) {
			grade = 1.3;
			return grade;
		}
		else if(i <= 120 && i >= 105) {
			grade = 1.0;
			return grade;
		}
		return grade;
	}
	
	//grade exercise
	public void examPoints() {
		for(double i = 0; i <= 120; i+=.5) {
//			System.out.println(i);

			System.out.println(examPointsConditions(i));
		}
	}

	public void dayOfWeek(int day, int month, int year) {
		int days = (year - 1900) * 365;
		int leapYears = (year - 1900)/4;
		
		if(year % 4 == 0 && (month == 1 || month == 2)){
			leapYears -= 1;
		}
		days += leapYears;
		int division = days % 7;
		System.out.println(division);
	}

	public void printedMultiplicationTable(int num, int num1) {
		String temp = "";
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= num; j++) {
				temp += (i*j) + " ";
			}
			System.out.println(temp);
			temp = "";
		}
	}
	
	public void smallestDistanceArray(int[] inputArray) {
		int length = inputArray.length;
		int compare = Integer.MAX_VALUE;
		int firstVal = 0;
		int secondVal = 0;
		int index = 0;
		for(int i = 0; i < length-1; i++) {
			firstVal = inputArray[i];
			secondVal = inputArray[i+1];
			int temp = Math.abs(firstVal - secondVal);
			if(temp < compare && temp > 0){
				index = i;
				compare = temp;
			}
		}
		System.out.println(index);
	}
	
	public long calcSumOfCharchar(char[] inputArray) {
		long result = 0;
		int length = inputArray.length;
		for(int i = 0; i < length; i++) {
			result += inputArray[i];
		}
		return result;
	}
	
	public void anagramChecker(String input, String input1) {
		String reducedInput = input.toLowerCase().replace(" ", "");
		String reducedInput1 = input.toLowerCase().replace(" ", "");

		//create an array of counters for each letter then
	}
	
	public void clw() {
		for(int i = 1; i <= 110; i++) {
			if(i == 35) {
				System.out.println();
			}
			String replacement = "";
			if(i % 3 == 0) {
				replacement += "Coza";
			}
			else if(i % 5 == 0) {
				replacement += "Loza";

			}
			else if( i % 7 == 0) {
				replacement += "Moza";
			}
			else {
				replacement += i + " ";
			}
			System.out.println(replacement);
			replacement = "";
		}
	}
	
//	(k)  Write a program called CheckerBoard that displays the following n×n (n=7) checkerboard pattern using two nested for-loops.
//	# # # # # # #
//	 # # # # # # #
//	# # # # # # # 
//	 # # # # # ## 
//	# # # # # # # 
//	(l) Print each of the followings patterns using nested loops.

	public void checkerBoard(int n) {
		for(int i = 0; i < n; i++) {
			String temp = "";
			if((i+1) % 2 == 0) {
				temp = " ";
			}
			for(int j = 0; j < n; j++) {
				temp += "# ";
			}
			System.out.println(temp);
		}
	}
	
	/*
	 * j) Write a program called Fibonacci to display the first 20 Fibonacci numbers F(n), where F(n)=F(n–1) + F(n–2) and F(1)=F(2)=1. Also compute their average. The output shall look like:
The first 20 Fibonacci numbers are:1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765The average is 885.5

	 */
	 public int fibonacci(int n) {
		 if(n > 1) {
			 return fibonacci(n-1) + fibonacci(n-2);
		 }
		 
		 return n;
	 }
	 
	 public void fibonacciLength(int limit) {
		 String temp = "";
		 double combinedNums = 0;
		 for(int i = 1; i <= limit; i++) {
			 int num = fibonacci(i);
			 temp += num + " ";
			 combinedNums += num;
		 }
		 System.out.println(temp);
		 System.out.println("Average is " + (combinedNums/limit));
	 }
	 
	
}
