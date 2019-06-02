package com.aura;

import java.util.Scanner;

public class Computer {
	public static void main(String[] args) {
		int i, j, k;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("请输入一个三位数的整数：");
			int value = scanner.nextInt();
			if (value >= 100 && value < 1000) {
				i = value % 10; // 取个位数
				j = value / 10 % 10; // 取十位数
				k = value / 100 % 10; // 取百位数
				System.out.println(value + "的百位数为：" + k + " 十位数为： " + j + " 个位数为：" + i);
				break;
			}else {
				System.out.println("你输入的不是一个三位数的整数！请重新输入");
			}
			
		}

	}
}
