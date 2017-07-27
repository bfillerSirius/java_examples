package com.siriuscom.generics;

import java.util.ArrayList;
import java.util.List;

public class Driver {

	public static <T> void main(String[] args) {
//		GenericArray ga = new GenericArray<>();
//		
//		
//		Integer[] nums = new Integer[] {5, 6, 2, 1, 7};
//		System.out.println(ga.compareObjects(nums, 3));
		
		
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
		
		SailorExercise se = new SailorExercise();
		List<Sailor> sailors = se.sailorSelection(se.sailorGeneration(), 15);
		se.menuOutput(se.foodRetrieval(sailors));
		
		Cuboid<Integer> c = new Cuboid<>();
		c.setBreadth(5);
		c.setLength(30);
		c.setWidth(9);
		System.out.println(c.toString());
		
		Map map = new Map("year", "Car");
		System.out.println(map.toString());
		
		map = new Map(1989, "GT-R");
		System.out.println(map.toString());
		
		map = new Map(1969, "Capri");
		System.out.println(map.toString());
		
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
