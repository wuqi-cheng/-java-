package com.aura;

public class TestAnimal {
	public static void main(String[] args) {
		Animal a = new Animal();
			a.eat();
		
		Cat c = new Cat();
		c.eat();
		c.catchMouse();
		System.out.println("-----------");
		Animal a1 = new Dog();
		a1.eat();
		if(a1 instanceof Dog) {
			Dog dog = (Dog)a1;
			dog.play();
		}
		
		
		Animal a2 = new Cat();
		a2.eat();
	}
}

class Animal{
	String name;
	int age;
	
	public void eat() {
		System.out.println("动物吃");
	}
}

class Dog extends Animal{
	String sex;
	public void eat() {
		System.out.println("小狗吃粮食");
	}
	
	public void play() {
		System.out.println("和主人玩");
	}
}

class Cat extends Animal{
	public void eat() {
		System.out.println("猫吃饭");
	}
	
	public void catchMouse() {
		System.out.println("猫抓老鼠!");
	}
	
}