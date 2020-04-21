package com.nt.test;

import com.nt.car.SuzukiCar;

public class SuzukiCarFactory {
	//Factory Method
	public static SuzukiCar getInstance(String type) {
		SuzukiCar car=null;
		if(type.equalsIgnoreCase("swift"))
			car=new SwiftCar();
		else if(type.equalsIgnoreCase("baleno"))
			car=new BalenoCar();
		else if(type.equalsIgnoreCase("ciaz"))
			car=new CiazCar();
		else
			throw new IllegalArgumentException("Invalid Car Type");
		return car;
	}
	
}//class
