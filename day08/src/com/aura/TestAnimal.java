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
		System.out.println("�����");
	}
}

class Dog extends Animal{
	String sex;
	public void eat() {
		System.out.println("С������ʳ");
	}
	
	public void play() {
		System.out.println("��������");
	}
}

class Cat extends Animal{
	public void eat() {
		System.out.println("è�Է�");
	}
	
	public void catchMouse() {
		System.out.println("èץ����!");
	}
	
}