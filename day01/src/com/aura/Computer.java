package com.aura;

import java.util.Scanner;

public class Computer {
	public static void main(String[] args) {
		int i, j, k;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("������һ����λ����������");
			int value = scanner.nextInt();
			if (value >= 100 && value < 1000) {
				i = value % 10; // ȡ��λ��
				j = value / 10 % 10; // ȡʮλ��
				k = value / 100 % 10; // ȡ��λ��
				System.out.println(value + "�İ�λ��Ϊ��" + k + " ʮλ��Ϊ�� " + j + " ��λ��Ϊ��" + i);
				break;
			}else {
				System.out.println("������Ĳ���һ����λ��������������������");
			}
			
		}

	}
}
