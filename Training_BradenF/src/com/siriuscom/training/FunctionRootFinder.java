package com.siriuscom.training;

public class FunctionRootFinder {

	//14. Write a program to find the roots of  equation specified by the user Ax*x + B*x + c = 0; Fn
	
	//gets x of positive quadratic
	
	public FunctionRootFinder() {
		
	}
	
//	public double positiveQuadratic(double a, double b, double c) {
//		
//		double innerSqrRoot = Math.pow(b, 2) - 4 * a * c;
//		double numerator = -b + Math.sqrt(innerSqrRoot);
//		return numerator/ (2*a);
//	}
	
//	get x of negative quadratic
//	public double negativeQuadratic(double a, double b, double c) {
//		
//		double innerSqrRoot = Math.pow(b, 2) - 4 * a * c;
//		double numerator = -b - Math.sqrt(innerSqrRoot);
//		return numerator/ (2*a);
//	}
	
	public double quadraticFunction(double a, double b, double c, int i) {
		double innerSqrRoot = Math.pow(b, 2) - 4 * a * c;
		double numerator = -b + (i * Math.sqrt(innerSqrRoot));
		return numerator/ (2*a);
	}
	//prints out value
	public void positiveAndNegativeQuadratic(double a, double b, double c) {
		System.out.println("x=" + quadraticFunction(a, b, c, 1));
		System.out.println("x=" + quadraticFunction(a, b, c, -1));
	}
}
