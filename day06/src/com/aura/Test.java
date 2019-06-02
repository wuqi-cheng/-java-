package com.aura;

public class Test {
	void com(int i) {
		System.out.println(i+"的平方为："+i*i);
	}
	
	void com(int i,int j) {
		System.out.println(i+"*"+j+"="+i*j);		
	}
	
	void com(String s) {
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		test.com(5);
		test.com(3,4);
		test.com("hi");
	}
}
