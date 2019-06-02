package com.aura;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
//		int a[] = {1,2,3,4,5,6},i;
//		for(i = 0; i < a.length; i++)
//		{
//			System.out.println(a[i]);
//		}
		
		
//		int[][] b = {{1,2,3},{4,5,6},{7,8,9}};
//		for(int i = 0; i < b.length;i++) {
//			for(int j = 0; j < b[i].length; j++) {
//				System.out.print(b[i][j]+" ");
//			}
//			System.out.println();
//		}
		
//		int[] c = {1,5,6,2,3,4,8,15,24,7,20,13,46,5,8};
//		int k;
//		for(int i = 0; i < c.length; i++)
//			for(int j = 0; j < c.length - i; j++) {
//				if(c[i] > c[j]) {
//					k = c[i];
//					c[i] = c[j];
//					c[j] = k;
//				}
//			}
//		System.out.println("最大值为："+c[0]+"最小值为："+c[c.length-1]);
		
//		int[] c = {1,5,6,2,3,4,8,15,24,7,20,13,46,5,8};
//		for(int i = c.length-1; i >= 0; i--)
//			System.out.print(c[i]+" ");
		
		
		int[] e = {1,5,6,2,3,4,8,15,24,7,20,13,46,5,8};
		System.out.println("请输入查找元素的值：");
		Scanner s = new Scanner(System.in);
		int value = s.nextInt();
		for(int x=0;x<e.length;x++)
        {
            if(e[x]==value)
            {
                System.out.println("在数组中数字："+value+",第一次出现的索引值为："+x);
                break;
            }
        }

		
	}
}
