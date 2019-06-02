package com.huaxai;

/*
 * 面向对象设计三部曲：
 * 	1.设计类（定义类）：属性，构造器，行为
 * 		类与类之间的关系（依赖，组合，继承）
 * 	2.创建对象
 * 		new+构造器 
 * 	3.使用对象
 * 		对象.成员
 */

public class TestHouse {
	public static void main(String[] args) {
		House house = new House("三室两厅",80);
//		house.type = "三室两厅";
//		house.totalArea = 80;
//		house.remainArea = 80;
//		house.items = new ArrayList<>();
		
		HouseItem bad = new HouseItem("席梦思",10);
		HouseItem chest = new HouseItem("衣柜",20);
		HouseItem table = new HouseItem("餐桌",8);
		house.addItem(bad);
		house.addItem(chest);
		house.addItem(table);
		house.show();
		System.out.println(house.toString());
	}
}
