package com.aura;

import java.util.Scanner;

public class TestAccount {
	public static void main(String[] args) {
		int count = 0 ;
		System.out.print("���������룺");
		Scanner s = new Scanner(System.in);
		while(count<3) {
			String pass = s.next();
			if(pass.equals("123456")) {
				System.out.println("������ȡ���");
				count = 0;
				break;
			}else {
				System.out.println("�����������������");
				count++;
			}
			if(count>3) {
				System.out.println("���������������������Σ����Ŀ�Ƭ���̣�����ϵ��̨");
				System.exit(0);
			}
		}
		System.out.println("��ȡ��"+s.next()+"���!");
	}	
}
