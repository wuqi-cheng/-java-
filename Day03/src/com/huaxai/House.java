package com.huaxai;

import java.util.ArrayList;

public class House {
	String type;
	double totalArea;
	double remainArea;
	ArrayList<HouseItem> items;
	
	//������
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
			System.out.println("��ӼҾߣ�"+item.name+",ռ�������"+item.area);
		}else {
			System.out.println("���������ӼҾ�:"+item.name);
		}
	}
	
	void show() {
		System.out.println("���ͣ�"+type+",�����"+totalArea+",ʣ�������"+remainArea);
		System.out.println("�Ҿ��б�"+items);
	}

	@Override
	public String toString() {
		return "House [type=" + type + ", totalArea=" + totalArea + ", remainArea=" + remainArea + ", items=" + items
				+ "]";
	}
	
	
}
