package com.nt.beans;

import java.util.Date;

public class WishGenerator {
	//bean properties
	private Date date;
	public  WishGenerator(Date date) {
		this.date=date;
		System.out.println("WishGenerator.WishGenerator()");
	}

	/*
	 * //Setter method supporting Setter Injection public void setDate(Date date) {
	 * System.out.println("WishMessageGenerator.setDate()"); this.date=date; }
	 */
	//Write business method logic having business logic using injected Date class object
	@SuppressWarnings("deprecation")
	public String generateMessage(String user) {
		int hour=0;
		System.out.println("Injected Date :: "+date);
		//get current hour of the day
		hour=date.getHours();		//24hours format
		//generate wish message
		if(hour<12)
			return"Good Morning::"+user;
		else if(hour<16)
			return"Good AfterNoon::"+user;
		else if(hour<20)
			return"Good Evening::"+user;
		else
			return"Good Night::"+user;
	}
}//class
