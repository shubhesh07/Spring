package com.nt.test;

import com.nt.car.SuzukiCar;

public class CiazCar implements SuzukiCar {

	@Override
	public String specification() {
		return "EngineCC:: 1700cc -> fuelType: Diesel ->model: HatchBack";
	}

	@Override
	public String drive() {
		
		return "driving 5+1 gear system Ciaz Car";
	}

}
