package com.huaxia;

public class TestAnimal1 {
	public static void main(String[] args) {
		
	}
}

abstract class An{
	String name;
	int age;
	
	public An() {
		super();
	}

	public An(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public abstract void eat();
	
//	public void show() {
//		System.out.println();
//	}
}

class Dog extends An{
	String sex;

	public Dog(String name,int age,String sex) {
		super();
		this.sex = sex;
	}

	@Override
	public void eat() {
		System.out.println("¹·³Ô¹ÇÍ·");
		
	}
	
	
	
	
}