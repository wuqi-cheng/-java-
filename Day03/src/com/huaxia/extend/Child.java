package com.huaxia.extend;

/*
 * super用法：
 * 1.子类构造器中国选择性的调用父类构造器super(xx,xx)只能在构造器的第一行
 * 2.子类成员方法中调用父类的成员
 */

public class Child extends Father{
	String name;
	Child(String name){
		super("王健林");
		this.name = name;
	}
	
	//重写，覆盖
	void show() {
		super.show();
		System.out.println("Child show:"+name);
	}
	
}
