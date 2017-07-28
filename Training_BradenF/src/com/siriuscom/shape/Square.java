package com.siriuscom.shape;

public class Square<T> implements Shape<T>{
	
	int side;
	
	public Square(int side) {
		this.side = side;
	}



	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return side*side;
	}

}
