package com.siriuscom.generics;

import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class RandomStream<T> {
	ObjectOutputStream oos;
	
	
	public void printOutUsingFor(T[] array) {
		StringBuilder sb = new StringBuilder();
		StringBuffer strbuf = new StringBuffer();
		for(T t: array) {
			sb.append(t);
		}
		for(T t: array) {
			strbuf.append(t);
		}
		System.out.println(sb.toString());
		System.out.println(strbuf.toString());
	}
	
	public Collection<T> randomizer(Collection<T> coll) {
		Collections.shuffle((List<?>) coll);
		return coll;
	}

}
