package com.huaxia;

public class TestSingleton {
	public static void main(String[] args) {
		
		
	}
}

//����ģʽ
class Singleton1{
	//1����������˽�л�
	private Singleton1() {	}
	//2�����崴��һ��˽�ж���
	private static Singleton1 instance = new Singleton1();
	//3������һ�����з���
	public static Singleton1 getInstance() {
		return instance;
	}
	
}