package com.huaxai;

/*
 * ������������������
 * 	1.����ࣨ�����ࣩ�����ԣ�����������Ϊ
 * 		������֮��Ĺ�ϵ����������ϣ��̳У�
 * 	2.��������
 * 		new+������ 
 * 	3.ʹ�ö���
 * 		����.��Ա
 */

public class TestHouse {
	public static void main(String[] args) {
		House house = new House("��������",80);
//		house.type = "��������";
//		house.totalArea = 80;
//		house.remainArea = 80;
//		house.items = new ArrayList<>();
		
		HouseItem bad = new HouseItem("ϯ��˼",10);
		HouseItem chest = new HouseItem("�¹�",20);
		HouseItem table = new HouseItem("����",8);
		house.addItem(bad);
		house.addItem(chest);
		house.addItem(table);
		house.show();
		System.out.println(house.toString());
	}
}
