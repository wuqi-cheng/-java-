package com.aura;

import java.util.ArrayList;

public class TestDay02_14 {
	public static void main(String[] args) {
		ArrayList<Student> stus = new ArrayList();
		stus.add(new Student("����",21,"��"));
		stus.add(new Student("����",22,"��"));
		stus.add(new Student("����",23,"��"));
		
		for(int i = 0;i<stus.size();i++) {
			System.out.println("����"+stus.get(i).name+"������"+stus.get(i).age+"���Ա�"+stus.get(i).sex);
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
