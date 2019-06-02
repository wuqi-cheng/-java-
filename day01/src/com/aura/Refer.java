package com.aura;

public class Refer {
	public static void main(String[] args) {
		//值类型
		int i=3;
		int j = i;
		j++;
		
		//引用数据类型
		String name = "as";
		String name2 = name;
		System.out.println(name2 == name);
		
		String name3 = new String("as1");
		String name4 = name3;
		
	}
}
