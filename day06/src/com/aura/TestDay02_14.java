package com.aura;

import java.util.ArrayList;

public class TestDay02_14 {
	public static void main(String[] args) {
		ArrayList<Student> stus = new ArrayList();
		stus.add(new Student("张三",21,"男"));
		stus.add(new Student("张四",22,"男"));
		stus.add(new Student("李四",23,"男"));
		
		for(int i = 0;i<stus.size();i++) {
			System.out.println("姓名"+stus.get(i).name+"、年龄"+stus.get(i).age+"、性别"+stus.get(i).sex);
		}
		
	}
}



class Student{
	String name;
	int age;
	String sex;
	
	public Student(String name,int age,String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
}
