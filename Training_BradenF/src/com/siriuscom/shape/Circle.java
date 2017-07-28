package com.siriuscom.shape;

public class Circle<T> implements Shape<T> {
	
	double radius;
	public Circle(double radius) {
		this.radius = radius;
	}


	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * (radius*radius);
	}

}
