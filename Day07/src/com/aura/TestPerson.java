package com.aura;

public class TestPerson {
	public static void main(String[] args) {
		Person p1 = new Person("����",21);
		System.out.println(p1.getName()+","+p1.getAge()+","+p1.getSchool()+","+p1.getMajor());
		Person p2 = new Person("����",21,"����");
		System.out.println(p2.getName()+","+p2.getAge()+","+p2.getSchool()+","+p2.getMajor());
		Person p3 = new Person("����",21,"����","��һ");
		System.out.println(p3.getName()+","+p3.getAge()+","+p3.getSchool()+","+p3.getMajor());
	}
}
