package com.nt.test;

import com.nt.car.SuzukiCar;

public class BalenoCar implements SuzukiCar {

	@Override
	public String specification() {
		return "EngineCC:: 1500cc -> fuelType: Diesel ->model: HatchBack";
	}

	@Override
	public String drive() {
		
		return "driving 5+1 gear system Baleno Car";
	}

}
