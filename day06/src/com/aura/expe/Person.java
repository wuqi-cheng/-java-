package com.aura.expe;

public class Person {
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
		if(age>0&&age<130) {
				this.age = age;
		}
		else {
			System.out.println("�������벻���ϣ�");
		}
	}
	
}
