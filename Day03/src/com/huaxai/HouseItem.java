package com.huaxai;

public class HouseItem {
	String name;
	double area;
	
	HouseItem(String name,double area){
		this.name = name;
		this.area = area;
	}

	@Override
	public String toString() {
		return "HouseItem [name=" + name + ", area=" + area + "]";
	}
	
	
}
