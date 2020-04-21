package com.nt.test;

import com.nt.car.SuzukiCar;

public class SwiftCar implements SuzukiCar {

	@Override
	public String specification() {
		return "EngineCC:: 1200cc -> fuelType: Diesel ->model: HatchBack";
	}

	@Override
	public String drive() {
		
		return "driving 5+1 gear system Swift Car";
	}

}
