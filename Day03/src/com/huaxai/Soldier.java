package com.huaxai;

public class Soldier {
	String name;
//	Gun[] guns = new Gun[5]; 
//	ArrayList<Gun> guns = new ArrayList<>();
	Gun gun;
	
	Soldier(String name, Gun gun) {
		this.name = name;
		this.gun = gun;
		}
	
	void fire() {
		gun.shoot();
		System.out.println(name+"¿ª»ð!");
	}
	
}
