package com.siriuscom.training;

public class PatternPrinter {

	
	public void square() {
		for(int i = 0; i < 7; i++) {
			String str = "";
			for(int j = 0; j < 13; j++) {
				if((i == 0 || i == 6)) {
					if(j % 2 == 0) {
						str+="#";
					}
					else {
						str+=" ";
					}
				}
				
				else if(j == 0 || j == 12) {
					str+="#";
				}
				else {
					str+= " ";
				}
			}
			System.out.println(str);
		}
	}
	
	public void backwardsZ() {
		int counter = 1;
		for(int i = 0; i < 7; i++) {
			String str = "";
			boolean nextRow = true;
			for(int j = 0; j < 13; j++) {
				if((i == 0 || i == 6)) {
					if(j % 2 == 0) {
						str+="#";
					}
					
					else {
						str+=" ";
					}
				}
				else if((j-i) == counter && nextRow) {
					nextRow = false;
					counter += 1;
					str += "#";
				}
				else {
					str += " ";
				}
			}
			System.out.println(str);
		}
	}
	
	public void printZ() {
		int counter = 2;
		for(int i = 0; i < 7; i++) {
			String str = "";
			boolean nextRow = true;
			for(int j = 13; j > 0; j--) {
				if((i == 0 || i == 6)) {
					if(j % 2 == 0) {
						str+=" ";
					}
					
					else {
						str+="#";
					}
				}
				else if((j-i) == counter && nextRow) {
					nextRow = false;
					counter += 1;
					str += "#";
				}
				else {
					str += " ";
				}
			}
			System.out.println(str);
		}
	}
	
	public void printX() {
		int counter = 1;
		int secondaryCounter = 10;
		for(int i = 0; i < 7; i++) {
			String str = "";
			boolean nextRow = true;
			for(int j = 0; j < 13; j++) {
				if((i == 0 || i == 6)) {
					if(j % 2 == 0) {
						str+="#";
					}
					else {
						str+=" ";
					}
				}
				else {
					if((j-i) == counter && nextRow) {
						nextRow = false;
						counter += 1;
						str += "#";
						if(j == 13/2) {
							secondaryCounter -= 2;
						}
					}

					else if(j == secondaryCounter){
						secondaryCounter -= 2;
						str += "#";
					}
					else {
						str += " ";
					}

				}
			}
			System.out.println(str);
		}
	}
	
	public void printXBoxed() {
		int counter = 1;
		int secondaryCounter = 10;
		for(int i = 0; i < 7; i++) {
			String str = "";
			boolean nextRow = true;
			for(int j = 0; j < 13; j++) {
				if((i == 0 || i == 6)) {
					if(j % 2 == 0) {
						str+="#";
					}
					else {
						str+=" ";
					}
				}

				else {
					if(j==0 || j==12) {
						str+="#";
					}
					else {
						if((j-i) == counter && nextRow) {
							nextRow = false;
							counter += 1;
							str += "#";
							if(j == 13/2) {
								secondaryCounter -= 2;
							}
						}

						else if(j == secondaryCounter){
							secondaryCounter -= 2;
							str += "#";
						}
						else {
							str += " ";
						}
					}

				}
			}
			System.out.println(str);
		}
	}
}
