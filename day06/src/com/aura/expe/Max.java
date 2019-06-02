package com.aura.expe;

public class Max {
	public void max(int a,int b){
		int max = a>b?a:b;
		System.out.println("最大值："+max);
	}
	
	public double max(double a, double b) {
		double max = a>b?a:b;
		System.out.println("最大值："+max);
		return max;
	}
	
	public double max(double a,double b,double c) {
//		double max = a>b?a:b;
//		max = max>c?max:c;
		double max = max(a,b)>c?max(a,b):c;
		System.out.println("最大值："+max);
		return max;
	}
}
