package com.nt.beans;

public class BlueDart implements Courier {
	

	public BlueDart() {
		System.out.println("BlueDart: 0-param Contructor");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String deliver(int oid) {
		return "BlueDart is ready to deliver product of "+oid;
	}

}
