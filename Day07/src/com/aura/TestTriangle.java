package com.aura;

public class TestTriangle {
	public static void main(String[] args) {
		Triangle t = new Triangle(2,3);
		t.findArea();
	}
}


class Triangle{
	private int  base;
	private int height;
	
	public Triangle(){
		System.out.println("无参的构造器");
	}
	
	public Triangle(int base,int height) {
		this.base = base;
		this.height = height;
	}
	
	public int getBase() {
		return base;
	}
	public int getHeight() {
		return height;
	}
	
	public void findArea() {
		System.out.println(base*height/2);
	}
}