package com.siriuscom.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateProjects {

	public void getNewYorkTime() {
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("America/New York"));
//		cal.add(Calendar.HOUR, 1);
		Date date = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		String output = sdf.format(date);
		System.out.println(output);
		
	}
	
	public void calcFirstLastDayOfWeek() {
		Calendar cal = Calendar.getInstance();
	}
	
	public void displayDatesInFormats() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = cal.getTime();
		String output = sdf.format(date);
		System.out.println(output);
		
		sdf = new SimpleDateFormat("dd::MMM::yyyy");
		output = sdf.format(date);
		System.out.println(output);
		
		sdf = new SimpleDateFormat("yyyy-MM-ddhh:mm:ss.SSS");
		output = sdf.format(date);
		System.out.println(output);
		
		sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		output = sdf.format(date);
		System.out.println(output);
		
	}
	
	public void monthsRemaining() {
		Calendar cal = Calendar.getInstance();
		int month = cal.get(Calendar.MONTH);
		System.out.println(11 - month);
	}
	
	private void getTenDaysAfterCurrentDate() {
		//days after
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		System.out.println("10 days after " + sdf.format(cal.getTime()));
		for(int i = 0; i < 10; i++) {
			cal.add(Calendar.DAY_OF_YEAR, (i+1));
			
			Date date = cal.getTime();
			String output = sdf.format(date);
			System.out.println(output);
		}
	}
	
	private void getTenDaysBeforeCurrentDate() {
		//days after
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("10 days before " + sdf.format(cal.getTime()));

		for(int i = 0; i < 10; i++) {
			cal.add(Calendar.DAY_OF_YEAR, -(i+1));
			Date date = cal.getTime();
			String output = sdf.format(date);
			System.out.println(output);
		}
	}
	
	public void getTenDaysBeforeAndAfter() {
		getTenDaysBeforeCurrentDate();
		getTenDaysAfterCurrentDate();
	}
}
