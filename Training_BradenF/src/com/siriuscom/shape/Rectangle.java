package com.siriuscom.shape;

public class Rectangle<T> implements Shape<T>{
	
	private int length;
	private int width;
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}



	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length * width;
	}

}
