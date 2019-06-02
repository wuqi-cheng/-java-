package com.aura.homework;

public class TestPerson {
	public static void main(String[] args) {
		Student s = new Student("����",21);
		s.eat();
		s.study();
		
		Teacher t = new Teacher("����",34);
		t.eat();
		t.teach();
	}
}

class Person{
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
	
	public Person() {}
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public void eat() {
		System.out.println("���ڳԷ���");
	}
}

class Student extends Person{
	public Student(String name,int age) {
		super(name,age);
	}
	
	public void study() {
		System.out.println(Student.this.getName()+":"+"�Ұ�ѧϰ��");
	}
}

class Teacher extends Person{
	public Teacher(String name,int age) {
		super(name,age);
	}
	
	public void teach() {
		System.out.println(Teacher.this.getName()+":"+"�Ұ����Σ�");
	}
}
