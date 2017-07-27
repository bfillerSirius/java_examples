package com.siriuscom.generics;

public class KeyValuePair<T> {

	private T key;
	private T value;
	public KeyValuePair(T key, T value) {
		this.key = key;
		this.value = value;
	}
	public T getKey() {
		return key;
	}
	public T getValue() {
		return value;
	}
	
}
