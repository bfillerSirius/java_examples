package com.siriuscom.generics;

public class Cuboid<T extends Number> {

//	1. Create a generic class called Cuboid that will store three dimension of a cuboid. Add methods to set and get the length, breadth and Height. 
//	Add a method public String toString that will return all the dimensions. 
//	The type of the dimensions will be decided at construction of cuboid instance.
	
//	2. Modify the Generic class Cubiod  so that it only accepts Numbers. Add a method with the following definition and complete its body.
//
//	public double getVolume(){
//	    
//	}
	
	private T length;
	private T breadth;
	private T width;
	
	public Cuboid() {
		
	}
	
	public Cuboid(T length, T breadth, T width) {
		this.length = length;
		this.breadth = breadth;
		this.width = width;
	}

	public T getLength() {
		return length;
	}

	public void setLength(T length) {
		this.length = length;
	}

	public T getBreadth() {
		return breadth;
	}

	public void setBreadth(T breadth) {
		this.breadth = breadth;
	}

	public T getWidth() {
		return width;
	}

	public void setWidth(T width) {
		this.width = width;
	}
	
	public double getVolume() {
		//long float int double byt
//		if(length instanceof Double) {
//		}
//		if(length instanceof Integer) {
//			return length.intValue() * breadth.intValue() * width.intValue();
//		}
//		if(length instanceof Long) {
//			return length.longValue() * breadth.longValue() * width.longValue();
//		}
//		if(length instanceof Float) {
//			return length.floatValue() * breadth.floatValue() * width.floatValue();
//		}
//		else {
//			return length.byteValue() * breadth.byteValue() * width.byteValue();
//		}
		return length.doubleValue() * breadth.doubleValue() * width.doubleValue();

	}
	
	@Override
	public String toString() {
		return length + " x " + breadth + " x " + width;
	}
	
	
}
