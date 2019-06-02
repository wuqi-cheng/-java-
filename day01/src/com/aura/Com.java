package com.aura;

public class Com {
	
	public static void sum(double a,double b) {
		System.out.println("两数之和为："+(double)(a+b));
	}
	
	public static void equal(double a,double b) {
		if(a == b) {
			System.out.println("两数相等！");
		}else {
			System.out.println("两数不相等！");
		}
	}
	
	public static void max(double a,double b,double c) {
		double i = Math.max(a, b);
		System.out.println("三个数中最大的数为："+Math.max(i, c));
	}
	
	public static void start(int a,int b) {
		for(int i = 0; i < a; i++){
			for(int j = 0;j < b; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void multi(int n) {
		for(int i = 0; i < n; i++){
			for(int j = 0;j < i; j++) {
				System.out.println(i+"*"+j+"="+(i*j)+" ");
			}
			System.out.println();
		}
		
	}
	
	public static void square(double a,double b) {
		System.out.println("长方形的面积为: "+(a*b));
	}
	
	public static void circle(double n) {
		double pi = Math.PI;
		System.out.println("圆的面积为："+(pi*n*n));
	}
	
	
}
