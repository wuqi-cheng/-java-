package com.aura;

public class Refer {
	public static void main(String[] args) {
		//ֵ����
		int i=3;
		int j = i;
		j++;
		
		//������������
		String name = "as";
		String name2 = name;
		System.out.println(name2 == name);
		
		String name3 = new String("as1");
		String name4 = name3;
		
	}
}
