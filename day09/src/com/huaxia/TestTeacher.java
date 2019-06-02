package com.huaxia;

public class TestTeacher {
	public static void main(String[] args) {
		Teacher t = Teacher.getTeacher();
		t.show();
	}
}


class Teacher{
	private Teacher() {}
	
	private static Teacher teacher = new Teacher();
	
	public static Teacher getTeacher() {
		return teacher;
	}
	
	public void methon1() {
		show();
	}
	
	public void show() {
		System.out.println("--------");
	}
}