package com.huaxai;

public class Gun {
	String model;
	int bullet_count;
	
	public Gun(String model, int bullet_count) {
		super();
		this.model = model;
		this.bullet_count = bullet_count;
	}
	
	void addd_bullet(int num) {
		bullet_count += num;
	}
	
	void shoot() {
		if(bullet_count > 0) {
			bullet_count--;
			System.out.println(model +"�����ӵ�--"+",��ʣ��"+bullet_count+"�ӵ�");
		}else {
			System.out.println("��������--");
		}
	}
	
	
}
