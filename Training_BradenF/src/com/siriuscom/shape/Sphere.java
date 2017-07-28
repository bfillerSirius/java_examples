package com.siriuscom.shape;

public class Sphere<T> implements Shape3D<T>{
	
	double radius;
	
	public Sphere(double radius) {
		this.radius = radius;
	}

	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		return (4/3) * Math.PI * Math.pow(radius, 3);
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 4 * Math.PI * Math.pow(radius, 4);
	}

}
