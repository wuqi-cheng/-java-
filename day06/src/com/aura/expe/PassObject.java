package com.aura.expe;

public class PassObject {

	public void printAreas(Cirlce c, int time) {
		for(int i=1; i<=time;i++) {
			c.setRadius(i);
			System.out.println(c.getRadius()+" "+c.findArea());
		}
	}
	
	public static void main(String[] args) {
		PassObject p = new PassObject();
		Cirlce c = new Cirlce();
		p.printAreas(c, 5);
		System.out.println(c.getRadius());
	}
}
