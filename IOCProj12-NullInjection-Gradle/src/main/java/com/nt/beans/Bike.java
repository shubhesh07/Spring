package com.nt.beans;

public class Bike {
	private String bikeNo;
	private String bikeName;
	private String ownerName;
	private int enginecc;
	public Bike(String bikeNo, String bikeName, String ownerName, int enginecc) {
		this.bikeNo = bikeNo;
		this.bikeName = bikeName;
		this.ownerName = ownerName;
		this.enginecc = enginecc;
	}
	@Override
	public String toString() {
		return "Bike [bikeNo=" + bikeNo + ", bikeName=" + bikeName + ", ownerName=" + ownerName + ", enginecc="
				+ enginecc + "]";
	}
}
