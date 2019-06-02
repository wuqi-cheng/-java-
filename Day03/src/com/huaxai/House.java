package com.huaxai;

import java.util.ArrayList;

public class House {
	String type;
	double totalArea;
	double remainArea;
	ArrayList<HouseItem> items;
	
	//构造器
	House(String type,double totalArea){
		this.type = type;
		this.totalArea = totalArea;
		remainArea = totalArea;
		items = new ArrayList<>();
	}
		
	void addItem(HouseItem item) {
		if(remainArea >= item.area) {
			items.add(item);
			remainArea -= item.area;
			System.out.println("添加家具："+item.name+",占地面积："+item.area);
		}else {
			System.out.println("面积不够添加家具:"+item.name);
		}
	}
	
	void show() {
		System.out.println("户型："+type+",总面积"+totalArea+",剩余面积："+remainArea);
		System.out.println("家具列表："+items);
	}

	@Override
	public String toString() {
		return "House [type=" + type + ", totalArea=" + totalArea + ", remainArea=" + remainArea + ", items=" + items
				+ "]";
	}
	
	
}
