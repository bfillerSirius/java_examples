package com.siriuscom.generics;

import java.util.ArrayList;
import java.util.List;

public class CustomHashTable<T>{

	List<KeyValuePair<T>> list = new ArrayList<>();
	
	public CustomHashTable(){
		
	}
	
	public String get(T key) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getKey().equals(key)) {
				return (String) key;
			}
		}
		return null;
	}
	
	public String put(T key, T value) {
		list.add(new KeyValuePair<T>(key, value));
		return (String) key;
	}
	
	public String remove(T key) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getKey().equals(key)) {
				KeyValuePair<?> kvp = list.remove(i);
				return kvp.toString();
			}
		}
		return null;
	}
	
	public boolean containsKey(T key) {
		return list.contains(key);
	}
	
	public int size() {
		return list.size();
	}
	
}
