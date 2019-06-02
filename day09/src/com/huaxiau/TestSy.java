package com.huaxiau;

import java.util.Scanner;

public class TestSy {
	static Scanner s = new Scanner(System.in);
	static Book[] books = new Book[5];
	// 0����ɽ裬1�����ѽ��
	static {
		Book book1 = new Book(1, "��������", 0, 10);
		books[0] = book1;
		Book book2 = new Book(2, "��¥��", 1, 20);
		books[1] = book2;
		Book book3 = new Book(3, "���μ�", 0, 10);
		books[2] = book3;
		Book book4 = new Book(4, "ˮ䰴�", 1, 20);
		books[3] = book4;
		Book book5 = new Book(5, "����", 0, 10);
		books[4] = book5;
	}

	public static void main(String[] args) {
		showMenu();
	}
	
	public static void showMenu(){
		System.out.println("��ӭ�����������ͼ���̳ǹ���ϵͳ");
		System.out.println("------------------------------------");
		System.out.println("1.�鿴�����鼮\n"
						 + "2.�����鼮\n"
						 + "3.�黹�鼮\n"
						 + "4.�˳�ϵͳ");
		System.out.println("------------------------------------");
		System.out.println("������ѡ��:");
		chouse();
	}


	public static void chouse(){
		switch (s.nextInt()) {
		case 1:
			showBook();
			break;
		case 2:
			getBook();
			break;
		case 3:
			reBook();
			break;
		case 4:
			System.out.println("��ӭ�´�ʹ�ã�");
			s.close();
			System.exit(1);
			
			break;
		default:
			System.out.println("����������ѡ��");
			chouse();
			break;
		}
	}

	public static void showBook() {
		System.out.println("���\tͼ������\tͼ��״̬\t�������");
		for(int i=0;i<books.length;i++) {
			String status;
			if(books[i].getStatus()==1) {
				status = "���";
			}else {
				status = "�ɽ�";
			}
			System.out.println(books[i].getBid()+"\t"+books[i].getBname()+"\t"+status+"\t"+books[i].getCount());
		}
		System.out.println("**************************************************");
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		showMenu();
	}

	public static void getBook() {
		System.out.println("��������Ҫ���ĵ��鼮���ƣ�");
		boolean falg = false;
		String bname = s.next();
		for(Book b : books) {
			if(b.getBname().equals(bname)) {
				if(b.getStatus()==1) {
					System.out.println("�����ѱ������");
					showMenu();
					return;
				}
				b.setStatus(1);
				b.setCount(b.getCount()+1);
				System.out.println("�ɹ����ġ�"+bname+"��");
				falg = true;
			}
		}
		if(!falg) {
			System.out.println("�鼮�����ڣ�");
			getBook();
		}else {
			showMenu();
		}
	}

	public static void reBook() {
		System.out.println("��������Ҫ�黹���鼮���ƣ�");
		boolean falg = false;
		String bname = s.next();
		for(Book b : books) {
			if(b.getBname().equals(bname)) {
				if(b.getStatus()==0) {
					System.out.println("���鲻��Ҫ�黹��");
					showMenu();
					return;
				}
				b.setStatus(0);
				System.out.println(bname+"�黹�ɹ���");
				falg = true;
			}
		}
		if(!falg) {
			System.out.println("�鼮�����ڣ�");
			getBook();
		}else {
			showMenu();
		}
	}

}

class Book {
	private int bid;
	private String bname;
	private int status;
	private int count;

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Book() {
		super();
	}

	public Book(int bid, String bname, int status, int count) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.status = status;
		this.count = count;
	}

}
