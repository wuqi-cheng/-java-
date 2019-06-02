package com.aura.expe;

public class TestCompute {
	public static void main(String[] args) {
		Compute a = new Compute();
		a.add(1,2,3);
		a.add(2.3,56,3.1);
	}
}

//计算类
class Compute{
	//求和的方法
	public void add(int...num) {
		int sum = 0;
		for(int i=0; i<num.length; i++) {
			sum += num[i];
		}
		System.out.println("和:"+sum);
	}
	
	public void add(double...num) {
		double sum = 0;
		for(int i=0; i<num.length; i++) {
			sum += num[i];
		}
		System.out.println("和:"+sum);
	}
}
