package com.aura;

import java.util.Random;
import java.util.Scanner;

public class GuessNum {
	public static void main(String[] args) {
		Random ran = new Random();
		int value = ran.nextInt(10);
		// System.out.println(value);
		Scanner scanner = new Scanner(System.in);
		int i = 0;

		while (i<3) {
			System.out.print("请输入一个整数：");
			
			int num = scanner.nextInt();
			if (num == value) {
				System.out.println("恭喜！你猜对了！");
				break;
			} else if (num > value) {
				System.err.println("对不起，你猜大了！");
			} else {
				System.out.println("对不起，你猜小了");
			}
			i++;
		}
	}
}
