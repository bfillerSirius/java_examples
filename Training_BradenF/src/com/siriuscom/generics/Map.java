package com.siriuscom.generics;

import java.util.ArrayList;
import java.util.List;

public class Map<T> {

	
//	3. Create a generic class that stores a Key and a Value and call it a Map. 
//	This will have one method called toString that will return a strign thats hows the key and the value. 
//			Teh Key and the value can be of any type.
//			test your calls by adding the following three years and an associcated iconic car to  to a seperate instance of each. 
//			You woll end up with three instances of Map storing the following data:
	
	
	private List<KeyValuePair<T>> backingList = new ArrayList<>();
	
	public Map() {
		
	}
	
	public String put(T key, T value) {
		backingList.add(new KeyValuePair<T>(key, value));
		return key + "";
	}
	
	@Override
	public String toString() {
		String output = "";
		for(KeyValuePair<T> kvp : backingList) {
			output += "|| " + kvp.getKey() + " || " + kvp.getValue() + " || \n";
		}
		return output;
	}
}
