package com.siriuscom.generics;

import java.util.ArrayList;
import java.util.List;

public class Driver {

	public static <T> void main(String[] args) {
		GenericArray ga = new GenericArray<>();
		
		
		Integer[] nums = new Integer[] {5, 6, 2, 1, 7};
		System.out.println(ga.compareObjects(nums, 3));
		
		
		List<String> temp = new ArrayList<>();
		temp.add("bob");
		temp.add("Will");
		temp.add("Cherie");
		temp.add("Chris");
		temp.add("Scout");
		temp.add("Jen");

		NameExercise ne = new NameExercise();


		System.out.println(3/2);
		System.out.println(5/2);

		ne.nameTesting("Peter Parker", "Pete Parkley");
		ne.nameTesting("Tim Drake", "Pete Parkley");

		
//		RandomStream<T> rs = new RandomStream<>();
//		rs.randomizer(temp.toArray());
		List<String> list = new ArrayList<>();
		
		SailorExercise se = new SailorExercise();
		List<Sailor> sailors = se.sailorSelection(se.sailorGeneration(), 15);
		se.menuOutput(se.foodRetrieval(sailors));
	}
	
//	public <T extends Number> int count(Collection<T> items, int value) {
//		int count = 0;
//		for(T item : items) {
//			if(item.intValue() % value == 0) {
//				count++;
//			}
//		}
//		return count;
//	}
}
