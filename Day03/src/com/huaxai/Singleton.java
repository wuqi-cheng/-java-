package com.huaxai;

/*
 * 23种设计模式：
 * 单例模式：饱汉式  饿汉式
 * 观察者模式：
 * 装饰模式
 * 工厂模式
 * 门面模式
 * 
 */

//单例模式
public class Singleton {
	//1.构造器私有（让外界没法直接new）
	private Singleton(){
		System.out.println("constructor...");
	}
	
	//3.唯一的对象成为成员变量
	private static Singleton s;// = new Singleton();
	
	//2.对外提供一个公有的静态的获得唯一实例的方法
	public static Singleton getInstance() {
		if(s == null) {
			s = new Singleton();
		}
		return s;
	}
}
