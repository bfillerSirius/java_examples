package com.siriuscom.exception;

import java.io.IOException;

public class Driver {
	public static void main(String[] args) {
		ExceptionLogic el = new ExceptionLogic();
//		el.giveMeNumerator();
		try {
			el.methodThrowingException();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		el.numFormatExceptionMethod();
	}
}
