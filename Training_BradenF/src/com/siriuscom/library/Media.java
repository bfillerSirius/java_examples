package com.siriuscom.library;

public class Media {

	
	private String name;
	private MediaType type;
	public Media(String name, MediaType type) {
		this.name = name;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public MediaType getType() {
		return type;
	}
	
	@Override
	public String toString() {
		return "Name: " + name + "\n Type: " + type;
	}
	
	
}
