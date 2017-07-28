package com.siriuscom.generics;

import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomStream<T> {
	ObjectOutputStream oos;
	
	
	public RandomStream() {
		
	}
	
	public void printOutUsingFor(T[] array) {
		StringBuilder sb = new StringBuilder();
//		StringBuffer strbuf = new StringBuffer();

		
		List<T> collection = randomizer(array);
		
		
		for(T t: collection) {
			sb.append(t + ", ");
		}
//		for(T t: collection) {
//			strbuf.append(t + ", ");
//		}
		sb.delete(sb.length()-2, sb.length()-1);

		System.out.println(sb.toString());
	}
	
	public List<T> randomizer(T[] coll) {
		Random rand = new Random();
		int length = coll.length;
		
		List<Integer> checkedNums = new ArrayList<>();
		List<T> objects = new ArrayList<>();
		while(checkedNums.size() < length) {
			int i = rand.nextInt(length);			
			
			if(!checkedNums.contains(i)) {
				checkedNums.add(i);
				objects.add(coll[i]);
			}
		}
		
		return objects;
	}

}
