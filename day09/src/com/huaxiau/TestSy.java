package com.huaxiau;

import java.util.Scanner;

public class TestSy {
	static Scanner s = new Scanner(System.in);
	static Book[] books = new Book[5];
	// 0代表可借，1代表已借出
	static {
		Book book1 = new Book(1, "三国演义", 0, 10);
		books[0] = book1;
		Book book2 = new Book(2, "红楼梦", 1, 20);
		books[1] = book2;
		Book book3 = new Book(3, "西游记", 0, 10);
		books[2] = book3;
		Book book4 = new Book(4, "水浒传", 1, 20);
		books[3] = book4;
		Book book5 = new Book(5, "气场", 0, 10);
		books[4] = book5;
	}

	public static void main(String[] args) {
		showMenu();
	}
	
	public static void showMenu(){
		System.out.println("欢迎来到你的月亮图书商城管理系统");
		System.out.println("------------------------------------");
		System.out.println("1.查看所有书籍\n"
						 + "2.借阅书籍\n"
						 + "3.归还书籍\n"
						 + "4.退出系统");
		System.out.println("------------------------------------");
		System.out.println("请输入选择:");
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
			System.out.println("欢迎下次使用！");
			s.close();
			System.exit(1);
			
			break;
		default:
			System.out.println("请重新输入选择：");
			chouse();
			break;
		}
	}

	public static void showBook() {
		System.out.println("编号\t图书名称\t图书状态\t借出次数");
		for(int i=0;i<books.length;i++) {
			String status;
			if(books[i].getStatus()==1) {
				status = "借出";
			}else {
				status = "可借";
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
		System.out.println("请输入需要借阅的书籍名称：");
		boolean falg = false;
		String bname = s.next();
		for(Book b : books) {
			if(b.getBname().equals(bname)) {
				if(b.getStatus()==1) {
					System.out.println("该书已被借出！");
					showMenu();
					return;
				}
				b.setStatus(1);
				b.setCount(b.getCount()+1);
				System.out.println("成功借阅《"+bname+"》");
				falg = true;
			}
		}
		if(!falg) {
			System.out.println("书籍不存在！");
			getBook();
		}else {
			showMenu();
		}
	}

	public static void reBook() {
		System.out.println("请输入需要归还的书籍名称：");
		boolean falg = false;
		String bname = s.next();
		for(Book b : books) {
			if(b.getBname().equals(bname)) {
				if(b.getStatus()==0) {
					System.out.println("该书不需要归还！");
					showMenu();
					return;
				}
				b.setStatus(0);
				System.out.println(bname+"归还成功！");
				falg = true;
			}
		}
		if(!falg) {
			System.out.println("书籍不存在！");
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
