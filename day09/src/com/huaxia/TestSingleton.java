package com.huaxia;

public class TestSingleton {
	public static void main(String[] args) {
		
		
	}
}

//单例模式
class Singleton1{
	//1、将构造器私有化
	private Singleton1() {	}
	//2、定义创建一个私有对象
	private static Singleton1 instance = new Singleton1();
	//3、定义一个共有方法
	public static Singleton1 getInstance() {
		return instance;
	}
	
}