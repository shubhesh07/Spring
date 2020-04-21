package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	private Courier courier;
	public Flipkart() {
		System.out.println("Flipkart: 0-param constructor");
	}
	//Setter method for setter Injection
	public void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier()");
		this.courier = courier;
	}

	public String shopping(String[] items,float[] prices) {
		float billAmt=0.0f;
		int oid=0;
		String msg=null;
		//Generate Bill Amount
		for(float price:prices)
			billAmt=billAmt+price;
		//Generate Order ID
		oid=new Random().nextInt(1000);
		//Use dependent for delivery
		 msg = courier.deliver(oid);
		 return Arrays.toString(items)+" are shopped having prices "+Arrays.toString(prices)+" with bill amt " +billAmt+" Delivery status "+msg;
	}
	
}//class
