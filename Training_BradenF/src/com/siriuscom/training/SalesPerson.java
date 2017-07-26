package com.siriuscom.training;

import java.util.Date;

public class SalesPerson implements Employee{
	
	private String name;
	private Date date;
	private double pay;
	
	public SalesPerson(String name, Date date, double pay) {
		this.name = name;
		this.date = date;
		this.pay = pay;
	}
	
	public Date dateOfJoining() {
		return date;
	}

	@Override
	public double getPay() {
		return pay;
	}
}
