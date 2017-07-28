package com.siriuscom.exception;

public class Driver {
	public static void main(String[] args) {
		ExceptionLogic el = new ExceptionLogic();
		el.giveMeNumerator();
//		el.methodThrowingException();
		el.numFormatExceptionMethod();
	}
}
