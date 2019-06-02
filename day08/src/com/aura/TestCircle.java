package com.aura;

public class TestCircle {
	public static void main(String[] args) {
		Circle c = new Cylinder();
		System.out.println(c.findArea());
		if(c instanceof Cylinder) {
			Cylinder cy = (Cylinder)c;
			cy.findVolume();
		}
		
	}
}

class Circle{
	double radious;
	public double findArea() {
		return Math.PI*this.radious*this.radious;
	}
	public Circle() {
		this.radious = 1;
	}
}

class Cylinder extends Circle{
	double height=2;
	
	public double findArea() {
//		return Math.PI*2*this.radious+2*Math.PI*this.radious*this.radious;
		return Math.PI*2*this.radious+2*super.findArea();
		
	}
	
	public void findVolume() {
		double tj = super.findArea()*this.height;
		System.out.println(tj);
	}
}
