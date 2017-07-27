package com.siriuscom.generics;

public class NameExercise {

	private boolean monotonous(String name) {
		String[] arrayOfNames = name.toLowerCase().split(" ");
		char c = arrayOfNames[0].charAt(0);
		boolean isMonotonous = true;
		for(int i = 1; i < arrayOfNames.length && isMonotonous; i++) {
			if(c != arrayOfNames[i].charAt(0)) {
				isMonotonous = false;
			}
		}
		return isMonotonous;
	}
	
	private boolean palonomic(String name) {
		
		String[] arrayOfNames = name.toLowerCase().split(" ");
		int length = arrayOfNames.length;
		int divLength = length / 2;
		boolean isPalinomic = true;
		for(int i = 0, j = length-1; i < divLength && isPalinomic && j > divLength; i++, j--) {
			if(arrayOfNames[i].charAt(0) != arrayOfNames[j].charAt(0)) {
				isPalinomic=false;
			}
		}
		return isPalinomic;
	}
	
	private boolean twins(String name, String name1) {
		
		boolean isTwins = false;
		String[] arrayOfNames1 = name.toLowerCase().split(" ");
		String[] arrayOfNames2 = name1.toLowerCase().split(" ");
		
		if(arrayOfNames1.length > 0 && arrayOfNames1.length == arrayOfNames2.length) {
			//do logic
			int length = arrayOfNames1.length;
			boolean equalChars = true;
			for(int i = 0; i < length && equalChars; i++) {
				if(arrayOfNames1[i].charAt(0) != arrayOfNames2[i].charAt(0)) {
					equalChars = false;
				}
			}
			isTwins = equalChars;
		}
		
		return isTwins;
	}
	
	//returns initials from name input;
	public String getInitials(String input) {
		String[] inputs = input.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < inputs.length; i++) {
			sb.append(inputs[i].charAt(0));
		}
		return sb.toString();
	}
	
	
	public void nameTesting(String input, String input1) {
		

		String[] inputArray = input.split("\"\"");
		String[] input1Array = input1.split("\"\"");
		String initials = getInitials(input);
		String initials1 = getInitials(input1);

		input = inputArray[0];
		input1 = input1Array[0];
		
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder();
		StringBuilder twinBuilder = new StringBuilder();
		boolean inputMono = monotonous(input);
		boolean input1Mono = monotonous(input1);
		boolean inputPalo = palonomic(input);
		boolean input1Palo = palonomic(input1);
		sb.append(initials + "." + input + " is ");
		sb1.append(initials1 + "." + input1 + " is ");
		if(inputMono) {
			sb.append("Monotonous");
		}
		
		if(input1Mono) {
			sb1.append("Monotonous");
		}
		if(inputPalo) {
			sb.append("Palonomic");
		}
		
		if(input1Palo) {
			sb1.append("Palonomic");
		}
		if(sb.length() == 0) {
			sb.append("No-One");
		}
		if(sb1.length() == 0) {
			sb1.append("No-One");
		}
		
		if(twins(input, input1)) {
			twinBuilder.append(sb.toString() + " and " + sb1.toString() + ". They are ");
			if(inputMono == input1Mono) {
				twinBuilder.append("Monotonous-");
			}
			if(inputPalo == input1Palo) {
				twinBuilder.append("Palonomic-");
			}
			twinBuilder.append("Twins.");
		}
		
		System.out.println(sb.toString());
		System.out.println(sb1.toString());
		System.out.println(twinBuilder.toString());
	}
}
