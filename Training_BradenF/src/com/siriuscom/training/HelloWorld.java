package com.siriuscom.training;




public class HelloWorld {
	
	String msg;
	
	static int numOfMsg = 0;
	
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		System.out.println(numOfMsg++);

		System.out.println(numOfMsg++);
		
		System.out.println( 10<9 ?  "true":"false");
		
//		switch (key) {
//		case value:
//			
//			break;
//
//		default:
//			break;
//		}
	}
}
