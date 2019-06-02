package com.aura.expe;

public class Cirlce {
	private double radius; //圆的半径
	
	public double findArea() {
		System.out.print("圆的面积为: ");
		return Math.PI*radius*radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
}
