package com.huaxia.extend2;

public class Feed {
	String name;
	
	Dog d = new Dog();
	Cat c = new Cat();
	
	void feeddog(String name) {
		System.out.println("����Ա��"+name);
		d.eat();
	}
	
	void feedcat(String name) {
		System.out.println("����Ա��"+name);
		d.eat();
	}

}
