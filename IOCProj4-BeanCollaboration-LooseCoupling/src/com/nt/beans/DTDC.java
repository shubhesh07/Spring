package com.nt.beans;

public class DTDC implements Courier {
	public DTDC() {
		System.out.println("DTDC: 0-param Constructor");
		
	}
	public String deliver(int oid) {
		return "DTDC is ready to deliver product of "+oid;
	}
}
