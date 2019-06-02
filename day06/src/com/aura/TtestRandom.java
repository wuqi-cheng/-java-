package com.aura;

import java.util.Random;

public class TtestRandom {
	public static void main(String[] args) {
//		int[] data = ;
//		quickSort(data,0,data.length-1);
//		for(int i=0; i<data.length; i++)
//			System.out.print(data[i]+" ");
		
		Random random = new Random(System.currentTimeMillis()); 
        int[] data = new int[100000]; 
        for (int i = 0; i < data.length; i++) { 
        	data[i] = random.nextInt(100000); 
        } 
        long start1 = System.currentTimeMillis(); 
        bubble(data);
        long time1 = System.currentTimeMillis() - start1; 
        System.out.println("bubble��ʱ��" + time1 + "����");
        
        int[] data2 = new int[100000]; 
        for (int i = 0; i < data2.length; i++) { 
        	data2[i] = random.nextInt(100000); 
        } 
        
        long start2 = System.currentTimeMillis(); 
        select(data2);
        long time2 = System.currentTimeMillis() - start2; 
        System.out.println("select��ʱ��" + time2 + "����");
        
        int[] data3 = new int[100000]; 
        for (int i = 0; i < data3.length; i++) { 
        	data3[i] = random.nextInt(100000); 
        } 
        
        long start3 = System.currentTimeMillis(); 
        insert(data3);
        long time3 = System.currentTimeMillis() - start3; 
        System.out.println("insert��ʱ��" + time3 + "����");
        
        int[] data4 = new int[100000]; 
        for (int i = 0; i < data4.length; i++) { 
        	data4[i] = random.nextInt(100000); 
        } 
        long start4 = System.currentTimeMillis(); 
        quickSort(data4,0,data4.length-1);
        long time4 = System.currentTimeMillis() - start4; 
        System.out.println("quickSort��ʱ��" + time4 + "����");
        
	}
	
	//ð������
	public static void bubble(int[] data) {
		for(int i=0; i<data.length-1; i++) {
			for(int j=0; j<data.length-1-i; j++) {
				if(data[j]>data[j+1]) { //����С��������
					int t = data[j];
					data[j] = data[j+1];
					data[j+1] = t;
				}
			}
		}
	}
	
	//ѡ������
	public static void select(int[] data) {
		for(int i=0; i<data.length;i++) {
			int k = i;
			for(int j = i+1; j<data.length; j++) {
				if(data[j] < data[k])
					k = j;
			}
			if(k != i) {
				int t = data[i];
				data[i] = data[k];
				data[k] = t;
			}
		}
	}
	
	//��������
	public static void insert(int[] data) {
		for(int i=1; i < data.length; i++) {
			int t = data[i];
			int j;
			for(j=i-1;j>=0;j--) {
				if(data[j]>t) {
					data[j+1] = data[j];
				}else {
					break;
				}
			}
			data[j+1] = t;
		}
	}
	
	//��������
	public static void quickSort(int[] data,int low,int high) {
		int i,j,temp,t;
        if(low>high){
            return;
        }
        i=low;
        j=high;
        temp = data[low]; //temp���ǻ�׼λ

        while (i<j) {
            //�ȿ��ұߣ���������ݼ�
            while (temp<=data[j]&&i<j) {
                j--;
            }
            //�ٿ���ߣ��������ҵ���
            while (temp>=data[i]&&i<j) {
                i++;
            }
            //������������򽻻�
            if (i<j) {
                t = data[j];
                data[j] = data[i];
                data[i] = t;
            }

        }
        //��󽫻�׼Ϊ��i��j���λ�õ����ֽ���
        data[low] = data[i];
        data[i] = temp;
        //�ݹ�����������
        quickSort(data, low, j-1);
        //�ݹ�����Ұ�����
        quickSort(data, j+1, high);
	}
	
	
}
