package com.aura;

import java.util.Arrays;

public class Ptest {
	public static void main(String[] args) {
//		int i = 0;
//		for(int j = 1000; j < 10000; j++)
//			if((j/1000+j/100%10) == (j/10%10+j%10)) {
//				i++;
//				System.out.print(j+" ");
//				if(i%5 == 0) {
//					System.out.println();
//				}
//			}
//		System.out.println(i);
		
		
//		int[][] a = {{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
//		int s = 0;
//		for(int i = 0; i < a.length; i++)
//			for( int j = 0; j < a[i].length; j++)
//				s += a[i][j];
//		System.out.println("公司年销售额为："+s);
		
//		for(int j = 9; j > 0; j--) {
//			for(int i = 1; i <= j; i++)
//				System.out.print(i+"*"+j+"="+i*j+" ");
//			System.out.println();
//		}
		
		
//		int s = 0;
//		for(int i = 5; i <= 1005; ) {
//			s += i;
//			i += 10;
////			System.out.print("s="+s+" ");
////			System.out.print("i="+i+" ");
//		}
//		System.out.println(s);
		
//		int [] array = {1,7,6,5,4,3};
//		int a = array[0];
//		int j=0;
//		for(int i=0; i<array.length-1;i++)
//			{
//				if(array[i] > a){
//					a = array[i];
//					j=i;
//				}		
//			}
//		System.out.println(j);
		//System.out.println(0);
		
		
//		 int [] array = {7,6,5,4,3};
//		 int j;
//		 for(int i = 0; i < array.length-1; i++)
//			 for(int k = 0; k < array.length-i-1; k++)
//				 if(array[k] > array[k+1])
//				 {
//					 j = array[k];
//					 array[k] = array[k+1];
//					 array[k+1] = j;
//				 }
//		 for(int a : array)
//			 System.out.println(a);
			 
//		Arrays.sort(array);
//		
//		for(int a :array)
//			System.out.println(a);
		
		int[][] a = {{1,2},{3,4},{5,6}};
		int s = 0;
		for(int i=0;i<a.length;i++) {
			for(int j=0; j< a[i].length;j++) {
				s += a[i][j];
			}
			System.out.println(s);
			s=0;
		}
		

		
	}
}
