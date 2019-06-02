package com.aura;

import java.util.Scanner;

public class TestAccount {
	public static void main(String[] args) {
		int count = 0 ;
		System.out.print("请输入密码：");
		Scanner s = new Scanner(System.in);
		while(count<3) {
			String pass = s.next();
			if(pass.equals("123456")) {
				System.out.println("请输入取款金额：");
				count = 0;
				break;
			}else {
				System.out.println("密码错误！请重新输入");
				count++;
			}
			if(count>3) {
				System.out.println("密码输入错误次数超过三次，您的卡片被吞，请联系柜台");
				System.exit(0);
			}
		}
		System.out.println("您取出"+s.next()+"金额!");
	}	
}
