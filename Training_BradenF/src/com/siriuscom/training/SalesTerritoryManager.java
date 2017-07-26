package com.siriuscom.training;

import java.util.Date;

public class SalesTerritoryManager extends SalesPerson{

	private String name;
	private Date date;
	private double pay;
	
	public SalesTerritoryManager(String name, Date date, double pay) {
		super(name, date, pay);
	}

	public Date dateOfJoining() {
		return null;
	}
}
