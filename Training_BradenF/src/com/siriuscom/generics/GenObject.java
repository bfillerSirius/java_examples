package com.siriuscom.generics;

public class GenObject<T extends Comparable<T>> {
	
	private String name;
	private int age;
	
	public GenObject(String name, int age) {
		this.name = name;
		this.age = age;
	}

}
