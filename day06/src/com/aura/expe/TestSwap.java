package com.aura.expe;

public class TestSwap {
	public static void main(String[] args) {
		int n = 10;
		int m = 8;
		System.out.println("n="+n+",m="+m);
		swap(n,m);
		System.out.println("n="+n+",m="+m);
		
		DataSwap ds = new DataSwap();
		ds.n = 10;
		ds.m = 8;
		System.out.println("n="+ds.n+",m="+ds.m);
		swap(ds);
		System.out.println("n="+ds.n+",m="+ds.m);
		
	}
	
	//交换（值类型）
	public static void swap(int n,int m) {
		int tmp = n;
		n = m;
		m = tmp;
	}
	//(引用类型) 
	public static void swap(DataSwap ds) {
		int tmp = ds.n;
		ds.n = ds.m;
		ds.m = tmp;
	}
}


class DataSwap{
	int n;
	int m;
}

