package com.siriuscom.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateProjects {
	
	
	//returns time in New York from Austin time
	public void getNewYorkTime() {
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("America/New_York"));
		cal.add(Calendar.HOUR, 1);
		Date date = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		String output = sdf.format(date);
		System.out.println(output);
		
	}
	
	//displays the dates in several formats
	public void displayDatesInFormats() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = cal.getTime();
		String output = sdf.format(date);
		System.out.println(output);
		
		sdf = new SimpleDateFormat("dd::MMM::yyyy");
		output = sdf.format(date);
		System.out.println(output);
		
		sdf = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSS");
		output = sdf.format(date);
		System.out.println(output);
		
		sdf = new SimpleDateFormat("yyyy::MM::dd hh:mm:ss");
		output = sdf.format(date);
		System.out.println(output);
		
		sdf = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSS'Z'");
		output = sdf.format(date);
		System.out.println(output);
		
		sdf = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss");
		output = sdf.format(date);
		System.out.println(output);
		
		/*
Default format of LocalDateTime=2016-09-16T11:46:01.455                                                       
16::Sep::2016 11::46::01                                                                                      
Default format of Instant=2016-09-16T06:16:01.456Z                                                            
Default format after parsing = 2014-04-27T21:39:48
		 * 
		 * */
		
		
		
	}
	
	//gets the total months remaing in year.
	public void monthsRemaining() {
		Calendar cal = Calendar.getInstance();
		int month = cal.get(Calendar.MONTH);
		System.out.println(11 - month);
	}
	
	//returns the dates of 10 days after current date
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
	
	//returns the dates of 10 days before current date
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
	
	//calls above to functions
	public void getTenDaysBeforeAndAfter() {
		getTenDaysBeforeCurrentDate();
		getTenDaysAfterCurrentDate();
	}
	
	//gets the first date and last date of each week up to a year, starting from current date.
	public void getFirstAndLastDay() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		cal.add(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		
		Date date = cal.getTime();
		String output = sdf.format(date);
		
		for(int i = 0; i < 52; i++) {
			System.out.println("Beginning");
			
			date = cal.getTime();
			output = sdf.format(date);
			System.out.println(output);
			
			cal.add(Calendar.DAY_OF_WEEK, 6);
			
			date = cal.getTime();
			output = sdf.format(date);
			
			System.out.println("End");
			System.out.println(output);
			
			cal.add(Calendar.DAY_OF_WEEK, 1);
			


		}
		
		
	}
	
	//converts a date to a calendar object
	public Calendar ConvertDateToCalendar(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal;
	}
	
	//converts a calendar object ot a date object
	public Date ConvertCalendarToDate(Calendar cal) {
		return cal.getTime();
	}
	
}
