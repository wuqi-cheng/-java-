package com.huaxai;

public class TestB {
	public static void main(String[] args) {
		B b1 = B.getb();
		B b2 = B.getb();
		System.out.println(b1 == b2);
	}
}
