package com.huaxia.extend;

/*
 * super�÷���
 * 1.���๹�����й�ѡ���Եĵ��ø��๹����super(xx,xx)ֻ���ڹ������ĵ�һ��
 * 2.�����Ա�����е��ø���ĳ�Ա
 */

public class Child extends Father{
	String name;
	Child(String name){
		super("������");
		this.name = name;
	}
	
	//��д������
	void show() {
		super.show();
		System.out.println("Child show:"+name);
	}
	
}
