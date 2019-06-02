package com.aura.home;

public class TestDemo {
	public static void main(String[] args) {
		Demo d = new Demo();
		d.add(2, 3);
		d.equal(2, 3);
		d.MultiplicationTable();
		d.quotient(11, 0);
	}
}

class Demo{
	public void add(int i,int j) {
		System.out.println("两数之和为："+(i+j));
	}
	
	public void equal(int i,int j) {
		if(i==j) {
			System.out.println("两数相等");
		}else {
			System.out.println("两数不相等");
		}
	}
	
	public void MultiplicationTable() {
		for(int i=1;i<10;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
	}
	
	public void quotient(int i,int j) {
		if(j==0) {
			System.out.println("被除数不能为0");
		}else
			System.out.println("两数的商为："+i%j);
	}
}