package com.aura.homework;

public class TestAnimal {
	public static void main(String[] args) {
		Dog d = new Dog("灰色",4);
		Cat c = new Cat("白色",4);
		d.eat();
		d.lookHome();
		System.out.println("--------");
		c.eat();
		c.catchMouse();
	}
	
	
}

class Animal {
	private String color;
	private int foot;
	
	public Animal() {}
	
	public Animal(String color,int foot) {
		this.color = color;
		this.foot = foot;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getFoot() {
		return foot;
	}
	public void setFoot(int foot) {
		this.foot = foot;
	}
	
	public void eat() {
		System.out.println("吃饭！");
	}
	
	public void feature() {
		System.out.println("我的皮毛颜色是"+this.color+",我有"+this.foot+"条腿");
		
	}
	
}

class Dog extends Animal{
	public Dog(String color,int foot) {
		super(color,foot);
	}
	
	public void lookHome() {
		System.out.println("我可以看门!");
	}
}

class Cat extends Animal{
	public Cat(String color,int foot) {
		super(color,foot);
	}
	
	public void catchMouse() {
		System.out.println("我可以抓老鼠！");
	}
}
