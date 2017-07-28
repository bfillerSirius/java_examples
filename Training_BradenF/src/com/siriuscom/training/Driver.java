package com.siriuscom.training;

public class Driver {
	
	
	/*
	 * 1. Write a method that counts the number of elements in an array T[] that are greater than a specified element elem? We dont know the type of element or type of array
2. Write a generic method to count the number of elements in a collection that have a specific property (for example, odd integers, prime numbers, palindromes).
3. Write a program that prints its arguments in random order. Do not make a copy of the argument array. Demonstrate how to print out the elements using both streams and the traditional enhanced for statement.


[11:37] 
4. Consider the four core interfaces, Set, List, Queue, and Map. For each of the following four assignments, specify which of the four core interfaces is best-suited, and explain how to use it to implement the assignment.
Whimsical Toys Inc (WTI) needs to record the names of all its employees. Every month, an employee will be chosen at random from these records to receive a free toy.
WTI has decided that each new product will be named after an employee but only first names will be used, and each name will be used only once. Prepare a list of unique first names.
WTI decides that it only wants to use the most popular names for its toys. Count up the number of employees who have each first name.
WTI acquires season tickets for the local lacrosse team, to be shared by employees. Create a waiting list for this popular sport.
	 * 
	 * 
	 * 
	 * */

	public static void main(String[] args) {
		TrainingExercises te = new TrainingExercises();
		
//		int[][] temp = te.createArray(3);
//		int[][] transposed = te.transposeArray(temp);
//		System.out.println(temp);
//		System.out.println(temp.length);
//		System.out.println(transposed);
		
//		te.examPoints();
//		te.dayOfWeek(17, 2, 2010);
		
		//wednesdays
		te.dayOfWeek(21, 2, 2007);
		te.dayOfWeek(17, 2, 2010);
		te.dayOfWeek(1, 3, 2006);
		
		//sundays
		te.dayOfWeek(4, 4, 2010);
		te.dayOfWeek(23, 3, 1916);
		te.dayOfWeek(8, 4, 2007);
		
//		printedMultiplicationTable(10, 10);
//		smallestDistanceArray(new int[]{4, 8, 6, 1, 2, 9, 4});
//		System.out.println(te.calcSumOfCharchar(new char[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}));
//		te.clw();
//		te.checkerBoard(7);
		

//		te.fibonacciLength(20);
		//"parliament" is an anagram of "partial men,
//		AnagramExercise ae = new AnagramExercise();
//		ae.AnagramCheck("some one is ! skldj? sdklfd.", "");
//		boolean tmp = ae.AnagramCheck("parliament", "partial men");
//		System.out.println(tmp);
//		FunctionRootFinder frf = new FunctionRootFinder();
//		frf.positiveAndNegativeQuadratic(1, 3, -4);
		PatternPrinter pattPrint = new PatternPrinter();
		pattPrint.square();
		pattPrint.backwardsZ();
		pattPrint.printZ();
		pattPrint.printX();
		pattPrint.printXBoxed();
//		ByteAsIntValue baiv = new ByteAsIntValue();
//		baiv.getBytes(20);
//		System.out.println(baiv.getBytes(20));
//		System.out.println(baiv.getBytes(223432430));
//		System.out.println(baiv.getBytes(232230));
//		System.out.println(baiv.getBytes(2320));
//		System.out.println(baiv.getBytes(2147483000));

	}
}
