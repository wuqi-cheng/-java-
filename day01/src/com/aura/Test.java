package com.aura;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int i,j,k;
		Scanner s = new Scanner(System.in);
		System.out.println("��������������");
		i = s.nextInt();
		j = s.nextInt();
		k = s.nextInt();
		if(i > j) {
			if(i > k) {
				System.out.println("��������������Ϊ��"+i);
			}else {
				System.out.println("��������������Ϊ��"+k);
			}
		}else {
			if(j > k) {
				System.out.println("��������������Ϊ��"+j);
			}else {
				System.out.println("��������������Ϊ��"+k);
			}
		}
	}
}
