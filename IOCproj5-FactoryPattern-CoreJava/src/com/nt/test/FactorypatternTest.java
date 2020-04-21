package com.nt.test;

import com.nt.car.SuzukiCar;

public class FactorypatternTest {

	public static void main(String[] args) {
		SuzukiCar car=null;
		car=SuzukiCarFactory.getInstance("baleno");
		System.out.println(car.specification());
		System.out.println(car.drive());
		System.out.println("..........................................");
		car=SuzukiCarFactory.getInstance("ciaz");
		System.out.println(car.specification());
		System.out.println(car.drive());
		System.out.println("..........................................");
		car=SuzukiCarFactory.getInstance("swift");
		System.out.println(car.specification());
		System.out.println(car.drive());
	}

}
