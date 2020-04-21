package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	private DTDC dtdc;

	public Flipkart(DTDC dtdc) {
		this.dtdc = dtdc;
		System.out.println("Flipkart.Flipkart()");
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
		 msg = dtdc.deliver(oid);
		 return Arrays.toString(items)+"are shopped having prices"+Arrays.toString(prices)+"with bill amt"+billAmt+"Delivery status"+msg;
	}
	
}
