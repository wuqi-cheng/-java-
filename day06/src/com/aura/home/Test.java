package com.aura.home;

public class Test {
	public static void main(String[] args) {
		Manage m = new Manage("张三", 3, 8000, 2000);
		Programmer p = new Programmer("李四", 100, 5000);
		m.work();
		p.work();
		Teacher t = new Teacher("梁建", 32);
		Student s = new Student("李飞", 21);
		t.eat();
		t.teach();
		s.eat();
		s.study();
		Cat c = new Cat("灰色", 4);
		Dog d = new Dog("黑色", 4);
		c.eat();
		c.catchMouse();
		d.eat();
		d.LookHome();
		
	}
}

class Employee{
	private String name;
	private int id;
	private double salary;
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
	public void work() {
		System.out.println("姓名："+name+",工号："+id+",工资："+salary);
	}
}

class Manage extends Employee{
	private double comm;
	public double getComm() {
		return comm;
	}
	public void setComm(double comm) {
		this.comm = comm;
	}
	public Manage(String name, int id, double salary,double comm) {
		super(name, id, salary);
		this.comm = comm;
	}
	
	public void work() {
		System.out.println("姓名："+getName()+",工号："+getId()+",工资："+getSalary()+",奖金"+getComm());
	}
}

class Programmer extends Employee{

	public Programmer(String name, int id, double salary) {
		super(name, id, salary);
	}
}

class People{
	private String name;
	private int age;
	public People(String name, int age) {
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
		System.out.println("在吃饭");
	}
}

class Teacher extends People{

	public Teacher(String name, int age) {
		super(name, age);
	}
	public void teach() {
		System.out.println("我在讲课！");
	}
	
}

class Student extends People{

	public Student(String name, int age) {
		super(name, age);
	}
	 public void study() {
		 System.out.println("我在学习！");
	 }
	
}

class Animal{
	private String color;
	private int foot;
	public Animal(String color, int foot) {
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
	
	public void eat() {
		System.out.println("吃饭");
	}
}

class Cat extends Animal{

	public Cat(String color, int foot) {
		super(color, foot);
	}
	
	public void catchMouse(){
		System.out.println("我能抓老鼠！");
	}
}

class Dog extends Animal{

	public Dog(String color, int foot) {
		super(color, foot);
	}
	
	public void LookHome() {
		System.out.println("我能看门！");
	}
	
}