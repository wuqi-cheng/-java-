package com.aura;

public class Student {
	//属性
	private String name;
	private int age;
	
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
	
	//构造器
	public Student() {
		System.out.println("构造无参数的方法");
	}
	
	public Student(String name) {
		this.name = name;
	}
	
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}

	//显示学员信息
	public void inof() {
		System.out.println("姓名："+name+",年龄:"+age);
	}
	
	public static void main(String[] args) {
		//创建类对象
		Student s = new Student();
		s.inof();
		
	}
}
