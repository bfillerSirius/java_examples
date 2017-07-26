package com.siriuscom.generics;

public class GenericArray<T extends Comparable<T>> {
//counts the number of elems in an array that are greater than a certain array
	

	
	public int compareObjects(T[] array, T object) {
		
		//sort array and get all objects after it would be a more efficient way.
		int counter = 0;
		int length = array.length;
		for(int i = 0; i < length; i++) {
			if(object.compareTo(array[i]) < 0) {
				counter++;
			}
		}
		return counter;
	}
	
	public T getMaximumElement(T[] array) {
		T object = array[0];
		int length = array.length;

		for(int i = 0; i < length; i++) {
			if(object.compareTo(array[i]) < 0) {
				object = array[i];
			}
		}
		return object;
	}
	
}
