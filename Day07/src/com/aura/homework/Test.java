package com.aura.homework;

class Test{
	public static void main(String[] args) {
		Manager m= new Manager("张三", 0001, 8000);
		m.work();
		Programmer p = new Programmer("李四",001,5000);
		p.work();
	}
}
