package com.siriuscom.generics;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

public class SailorExercise {

	
	/*
	 * 
	 * A Captain with 35
How does The Captain choose value of ’N’??
For every date that is prime, N = date
For every date that is even, N = date/2 
For every other date, N = (date+1)/2
	 * 
	 * 
	 * */
	//get N
	Date date = new Date();
	Calendar cal = Calendar.getInstance();
	
	public List<Sailor> sailorGeneration(){
		List<Sailor> sailors = new ArrayList<>();
		
		for(int i = 0; i < 35; i++) {
			sailors.add(new Sailor(i, false));
		}
		
		return sailors;
	}
	
	public List<Sailor> sailorSelection(List<Sailor> sailors, int n) {
//		List<Sailor> taskedSailors = new ArrayList<>();
		int quota = 0;
		Random rand = new Random();
		int length = sailors.size();
		while(quota < n) {
			int index = rand.nextInt(length);
			if(!sailors.get(index).isPickingFruit()) {
				quota++;
				sailors.get(index).setPickingFruit(true);
			}
			
		}
		return sailors;
		
	}
	
	public Map<String, Integer> foodRetrieval(List<Sailor> sailors) {
		Map<String, Integer> totalCountOfFood = new HashMap<>();
		Random rand = new Random();
		String[] fruits = {"apples", "bananas", "oranges", "watermelons"};
		int length = sailors.size();
		for(int i = 0; i < length; i++) {
			if(sailors.get(i).isPickingFruit()) {
				int fruitCount = rand.nextInt(6)+1;
				int randomFruit = rand.nextInt(fruits.length);
				System.out.println("Sailor " + sailors.get(i).getId() + ") has gethered " + fruitCount + " " + fruits[randomFruit]);
				if(totalCountOfFood.containsKey(fruits[randomFruit])) {
					int count = totalCountOfFood.get(fruits[randomFruit]) + fruitCount;
					totalCountOfFood.put(fruits[randomFruit], count);
				}
				else {
					totalCountOfFood.put(fruits[randomFruit], fruitCount);
				}
			}
			else {
				int fishCount = rand.nextInt(5);
				System.out.println("Sailor " + sailors.get(i).getId() + ") has gethered " + fishCount + " fish.");
				if(totalCountOfFood.containsKey("fish")) {
					int count = totalCountOfFood.get("fish") + fishCount;
					totalCountOfFood.put("fish", count);
				}
				else {
					totalCountOfFood.put("fish", fishCount);
				}
			}
		}
		return totalCountOfFood;
	}
	
	public void menuOutput(Map<String, Integer> countOfFood) {
		System.out.println("The menu is: ");
		for(Entry<String, Integer> kvp : countOfFood.entrySet()) {
			System.out.println(kvp.getValue() + " " + kvp.getKey());
		}
	}
	
	public int sailorSelectionCount(Date date) {
		int temp = cal.get(Calendar.DAY_OF_MONTH);
		int n = 0;
		if(isPrime(temp)) {
			n = temp;
		}
		else if(temp % 2 == 0) {
			n = temp/2;
		}
		else {
			n = (temp + 1)/2;
		}
		return n;
	}
	
	private boolean isPrime(int i) {
		if(i % 2 == 0) {
			return false;
		}
		if(i % 3 == 0) {
			return false;
		}
		if(i % 5 == 0) {
			return false;
		}
		if(i % 7 == 0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	
}
