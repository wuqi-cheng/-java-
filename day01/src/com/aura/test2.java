package com.aura;

import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Com com = new Com();
		System.out.println("请输入两个数：");
		double i,j;
		i = s.nextDouble();
		j = s.nextDouble();
		com.sum(i, j);
		com.equal(i, j);
		System.out.println("请输入三个数：");
		double a,b,c;
		a = s.nextDouble();
		b = s.nextDouble();
		c = s.nextDouble();
		com.max(a, b, c);
		
		com.start(5, 6);
		
		com.square(3, 4);
		
		com.circle(6);
		
	}
	
	
}
