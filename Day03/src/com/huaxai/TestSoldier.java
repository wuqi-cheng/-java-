package com.huaxai;

public class TestSoldier {
	public static void main(String[] args) {
		Gun gun = new Gun("AK47",3);
		Soldier soldier = new Soldier("≈Ï≈»",gun);
		soldier.fire();
		soldier.fire();
		soldier.fire();
		gun.addd_bullet(5);
		soldier.fire();
		soldier.fire();
		soldier.fire();
	}
}
