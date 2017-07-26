package com.siriuscom.training;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class AnagramExercise {

	public void AnagramCheck(String input, String testStr) {
		
		String str = "[ \\!\\?\\.@]";
		
		input = input.replaceAll(str, "");
		System.out.println(input);
		
		Map<String, Integer> mapOfLetters = new HashMap<>();
		Map<String, Integer> mapOfLettersTestStr = new HashMap<>();
		
		String[] inputArray = input.split("");
		String[] testStrArray = testStr.split("");
		int length = inputArray.length;
		for(int i = 0; i < length; i++) {
			String mapKey = inputArray[i];
			
			if(!mapOfLetters.containsKey(mapKey)) {
				mapOfLetters.put(mapKey, 1);
			}
			else {
				int val = mapOfLetters.get(mapKey);
				mapOfLetters.put(mapKey, val+1);
			}
		}
		length = testStrArray.length;
		for(int i = 0; i < length; i++) {
			String mapKey = testStrArray[i];
			
			if(!mapOfLettersTestStr.containsKey(mapKey)) {
				mapOfLettersTestStr.put(mapKey, 1);
			}
			else {
				int val = mapOfLettersTestStr.get(mapKey);
				mapOfLettersTestStr.put(mapKey, val+1);
			}
		}
		
		System.out.println(isAnagram(mapOfLetters, mapOfLettersTestStr));
		
	}
	
	public boolean isAnagram(Map<String, Integer> map, Map<String, Integer> compareMap) {
		boolean isAnagram = true;
		if(map.size() == compareMap.size()) {
			for(Entry<String, Integer> kvp : map.entrySet()) {
				if(!kvp.getValue().equals(compareMap.get(kvp.getKey()))) {
					isAnagram = false;
				}
			}
		}
		return isAnagram;
	}
}
