package com.aura.homework;

public class TestAnimal {
	public static void main(String[] args) {
		Dog d = new Dog("��ɫ",4);
		Cat c = new Cat("��ɫ",4);
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
		System.out.println("�Է���");
	}
	
	public void feature() {
		System.out.println("�ҵ�Ƥë��ɫ��"+this.color+",����"+this.foot+"����");
		
	}
	
}

class Dog extends Animal{
	public Dog(String color,int foot) {
		super(color,foot);
	}
	
	public void lookHome() {
		System.out.println("�ҿ��Կ���!");
	}
}

class Cat extends Animal{
	public Cat(String color,int foot) {
		super(color,foot);
	}
	
	public void catchMouse() {
		System.out.println("�ҿ���ץ����");
	}
}
