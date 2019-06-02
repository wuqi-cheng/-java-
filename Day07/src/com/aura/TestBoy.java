package com.aura;

public class TestBoy {
	public static void main(String[] args) {
		
	}
}

class Boy{
	private String name;
	private int age;
	
	public Boy() {	}	
	
	public Boy(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void marry(Gril g) {
		System.out.println("ÒªÈ¢£º"+g.getName());
	}
	
}

class Gril{
	private String name;
	private int age;
	
	public Gril() {
		super();
	}
	
	public Gril(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
