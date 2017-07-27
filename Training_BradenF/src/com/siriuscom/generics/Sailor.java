package com.siriuscom.generics;

public class Sailor {

	private boolean isPickingFruit;
	private int id;
	
	public Sailor(int id, boolean isPickingFruit) {
		this.isPickingFruit = isPickingFruit;
		this.id = id;
	}

	public boolean isPickingFruit() {
		return isPickingFruit;
	}

	public int getId() {
		return id;
	}

	public void setPickingFruit(boolean isPickingFruit) {
		this.isPickingFruit = isPickingFruit;
	}
	
}
