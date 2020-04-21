package com.nt.beans;

public class Ekart implements Courier {
	public Ekart() {
		System.out.println("Ekart: 0-param constructor");
		
	}
	public String deliver(int oid) {
		return "Ekart is ready to deliver product of "+oid;
	}
}
