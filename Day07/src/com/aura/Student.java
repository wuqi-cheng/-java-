package com.aura;

public class Student {
	//����
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
	
	//������
	public Student() {
		System.out.println("�����޲����ķ���");
	}
	
	public Student(String name) {
		this.name = name;
	}
	
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}

	//��ʾѧԱ��Ϣ
	public void inof() {
		System.out.println("������"+name+",����:"+age);
	}
	
	public static void main(String[] args) {
		//���������
		Student s = new Student();
		s.inof();
		
	}
}
