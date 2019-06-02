package com.aura;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int i,j,k;
		Scanner s = new Scanner(System.in);
		System.out.println("请输入三个数：");
		i = s.nextInt();
		j = s.nextInt();
		k = s.nextInt();
		if(i > j) {
			if(i > k) {
				System.out.println("三个数中最大的数为："+i);
			}else {
				System.out.println("三个数中最大的数为："+k);
			}
		}else {
			if(j > k) {
				System.out.println("三个数中最大的数为："+j);
			}else {
				System.out.println("三个数中最大的数为："+k);
			}
		}
	}
}
