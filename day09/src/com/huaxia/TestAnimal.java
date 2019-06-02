package com.huaxia;

public class TestAnimal {
	public static void main(String[] args) {
		Animal a = Animal.getAnimal();
		Animal a2 = Animal.getAnimal();
		System.out.println(a == a2);
		System.out.println(a.hashCode());
		System.out.println(a2.hashCode());
		
		Animal1 a3 = Animal1.getAnimal1();
		Animal1 a4 = Animal1.getAnimal1();
		System.out.println(a3 == a4);
		System.out.println(a3.hashCode());
		System.out.println(a4.hashCode());
	}
}

class Animal{
	private Animal() {}
	
	private static Animal animal = new Animal();
	
	public static Animal getAnimal(){
		return animal;
	}
	
	public void show() {
		System.out.println("单例模式");
	}
}

class Animal1{
	private Animal1() {}
	
	private static Animal1 animal = null;
	
	public static Animal1 getAnimal1(){
		if(animal==null) {
			animal = new Animal1();
		}
		return animal;
	}
	
	public void show() {
		System.out.println("单例模式");
	}
}
