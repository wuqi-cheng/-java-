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
			System.out.print("������һ��������");
			
			int num = scanner.nextInt();
			if (num == value) {
				System.out.println("��ϲ����¶��ˣ�");
				break;
			} else if (num > value) {
				System.err.println("�Բ�����´��ˣ�");
			} else {
				System.out.println("�Բ������С��");
			}
			i++;
		}
	}
}
