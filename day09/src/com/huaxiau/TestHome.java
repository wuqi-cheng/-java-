package com.huaxiau;

import java.util.Scanner;

public class TestHome {
	public static void main(String[] args) {
		System.out.println("请输入要领养的动物编号：1、狗狗  2、企鹅");
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		Man m = new Man();
		switch (i) {
		case 1:
			Dog a = new Dog();
			m.chouse(a);
			if (a instanceof Dog) {
				Dog d = (Dog) a;
			}
			a.eat();
			a.play();
			a.show();
			break;
		case 2:
			Pen p = new Pen();
			m.chouse(p);
			if (p instanceof Pen) {
				Pen d = (Pen) p;
			}
			p.eat();
			p.swing();
			break;
		default:break;
		}
	}

}

class Man {
	public void chouse(Animal a) {
		if (a instanceof Dog) {
			Dog d = (Dog) a;

		}else if (a instanceof Pen) {
			Pen p = (Pen) a;
		}
	}

	public void setEat() {

	}

	public void setPaly() {

	}
}

abstract class Animal {
	String name;
	int healthy;
	int intimacy;

	public abstract void eat();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealthy() {
		return healthy;
	}

	public void setHealthy(int healthy) {
		this.healthy = healthy;
	}

	public int getIntimacy() {
		return intimacy;
	}

	public void setIntimacy(int intimacy) {
		this.intimacy = intimacy;
	}

}

class Pets extends Animal {
	public void eat() {
		System.out.println("宠物在吃饭");
	}

	public void show() {
		System.out.println("名称：" + name + ",健康值：" + healthy + ",亲密度:" + intimacy);
	}

}

class Dog extends Pets {
	String sort;

	public void eat() {
		if (healthy >= 100) {
			System.out.println("我已经饱了");
		} else {
			healthy += 5;
			System.out.println("狗在吃饭");
		}
	}

	public void play() {
		intimacy += 5;
		System.out.println("我在玩飞盘");
	}
}

class Pen extends Pets {

	public void eat() {
		if (healthy >= 100) {
			System.out.println("我已经饱了");
		} else {
			healthy += 5;
			System.out.println("企鹅在吃饭");
		}
	}

	public void swing() {
		intimacy -= 5;
		System.out.println("我在游泳");
	}
}
