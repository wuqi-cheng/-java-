package com.aura.home;

public class Test3 {
	public static void main(String[] args) {
		JavaTeacher jt = new JavaTeacher("����", 33);
		PythonTeacher pt = new PythonTeacher("����", 30);
		jt.teach();
		pt.teach();
		JavaStu js = new JavaStu("����", 32);
		PythonStu ps = new PythonStu("���", 21);
		js.study();
		ps.study();
		Cats c = new Cats("��ɫ", 4);
		Dogs d = new Dogs("��ɫ", 4);
		c.eat();
		c.catchMouse();
		d.eat();
		d.LookHome();
	}
}

abstract class Teachers{ 
	private String Name;
	private int age;
	public Teachers(String name, int age) {
		super();
		this.Name = name;
		this.age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	abstract void teach();
}

class JavaTeacher extends Teachers{

	public JavaTeacher(String name, int age) {
		super(name, age);
	}

	@Override
	void teach() {
		System.out.println("Java��ʦ��JavaSE");
	}
	
}

class PythonTeacher extends Teachers{

	public PythonTeacher(String name, int age) {
		super(name, age);
	}

	@Override
	void teach() {
		System.out.println("Python����ʦ��Python");
	}
	
}

abstract class Students{
	private String Name;
	private int age;
	public Students(String name, int age) {
		super();
		Name = name;
		this.age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	abstract void study();
}

class JavaStu extends Students{

	public JavaStu(String name, int age) {
		super(name, age);
	}

	@Override
	void study() {
		System.out.println("ѧJavaSE");
	}
}

class PythonStu extends Students{

	public PythonStu(String name, int age) {
		super(name, age);
	}

	@Override
	void study() {
		System.out.println("ѧPython");
	}
	
}

abstract class Animals{
	private String color;
	private int foot;
	public Animals(String color, int foot) {
		super();
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
	abstract void eat();
}

class Cats extends Animals{
	public Cats(String color, int foot) {
		super(color, foot);
	}

	@Override
	void eat() {
		System.out.println("è����");
	}
	public void catchMouse(){
		System.out.println("����ץ����");
	}
	
}

class Dogs extends Animals{
	public Dogs(String color, int foot) {
		super(color, foot);
	}

	@Override
	void eat() {
		System.out.println("������");
	}
	
	public void LookHome() {
		System.out.println("���ܿ��ţ�");
	}
	
}