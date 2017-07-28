package com.siriuscom.generics;

import java.util.ArrayList;
import java.util.List;

public class Driver {

	@SuppressWarnings("unchecked")
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
		
		RandomStream<T> rs = new RandomStream<>();
		rs.printOutUsingFor((T[]) temp.toArray());

		NameExercise ne = new NameExercise();

		ne.nameTesting("Peter Parker", "Pete Parkley");
		ne.nameTesting("Tim Drake", "Pete Parkley");

		

		

		SailorExercise se = new SailorExercise();
		se.CaptainSelection();
//		Cuboid<Integer> c = new Cuboid<>();
//		c.setBreadth(5);
//		c.setLength(30);
//		c.setWidth(9);
//		System.out.println(c.toString());

//		Map map = new Map();
//		map.put("Year", "Car");
//		map.put(1989, "GT-R");
//		map.put(1969, "Capri");
//		System.out.println(map.toString());
		
		
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
	
	/*
2. Write a generic method to count the number of elements in a collection that have a specific property
 (for example, odd integers, prime numbers, palindromes).


3. Write a program that prints its arguments in random order. Do not make a copy of the argument array. 
	Demonstrate how to print out the elements using both streams and the traditional enhanced for statement.
	 * */
	
	
	
	
}
