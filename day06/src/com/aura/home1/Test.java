package com.aura.home1;

public class Test {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setName("张思");
		e1.setId(10001);
		e1.setSalary(5000);
		Employee e2 = new Employee("雷神",1021,3000);
		e1.show();
		e2.show();
		Animal a2 = new Animal();
		Animal a = new Animal("小猫", 2);
		a.sleep();
		a2.eat();
		Persion p1 = new Persion();
		Persion p2 = new Persion("袁飞",20,"男");
		p1.study();
		p2.sleep();
		
	}
}

class Employee{
	private String name;
	private int id;
	private double salary;
	public Employee() {
		super();
	}
	public Employee(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void show() {
		System.out.println("姓名："+name+"，工号："+id+"工资："+salary);
	}
	
}

class Animal{
	private String name;
	private int age;
	public Animal() {
		super();
	}
	public Animal(String name, int age) {
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
	public void eat() {
		System.out.println("我在吃饭");
	}
	public void sleep() {
		System.out.println("睡觉中，请勿打扰");
	}
}

class Persion{
	private String name;
	private int age;
	private String gender;
	public Persion() {
		super();
	}
	public Persion(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void study() {
		System.out.println("学习中，请勿打扰!");
	}
	public void sleep() {
		System.out.println("我在睡觉！");
	}
}