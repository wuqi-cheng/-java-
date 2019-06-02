package com.aura;

public class Operation {
	public static void main(String[] args) {
		//Î»ÔËËã·û & | ^ ~ << >> >>>
		int a = 3,b=5;//0011 0101  
		int c = a & b;//1
		int d = a | b;//7
		int e = a ^ b;//6
		int f = ~a;//-4   -A = ~A+1  ~A = -A-1 
		int g = a<<1;//6
		int h = a>>1;//1
		int i = a>>>1;//1
		int j = -16>>4;
		int k = -4>>>1;
		
		System.out.println(c+" "+d+" "+e+" "+f+" "+g+" "+h+" "+i+"  "+j+"  "+k);
		
		if (a++>3 && --b<5) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		System.out.println(a+","+b);
		
	}

}
