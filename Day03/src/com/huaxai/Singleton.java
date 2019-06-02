package com.huaxai;

/*
 * 23�����ģʽ��
 * ����ģʽ������ʽ  ����ʽ
 * �۲���ģʽ��
 * װ��ģʽ
 * ����ģʽ
 * ����ģʽ
 * 
 */

//����ģʽ
public class Singleton {
	//1.������˽�У������û��ֱ��new��
	private Singleton(){
		System.out.println("constructor...");
	}
	
	//3.Ψһ�Ķ����Ϊ��Ա����
	private static Singleton s;// = new Singleton();
	
	//2.�����ṩһ�����еľ�̬�Ļ��Ψһʵ���ķ���
	public static Singleton getInstance() {
		if(s == null) {
			s = new Singleton();
		}
		return s;
	}
}
