package com.aura;

public class TestCar {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.setId("辽A9752");
		car1.addso(10);
		Car car2 = new Car("辽B5086",150,200);
		car2.reduce(10);
		
		car1.carinfo();
		car2.carinfo();
	}
}


class Car{
	private String id;
	private int so;
	private double lo;
	
	public Car() {
		id = "xx1234";
		so = 100;
		lo = 100;
	}
	
	public Car(String id,int so,int lo) {
		this.id = id;
		this.so = so;
		this.lo = lo;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getSo() {
		return so;
	}
	public void setSo(int so) {
		if(so>0) {
			this.so = so;
		}else {
			System.out.println("车速不能为负数！");
		}
		
	}
	public double getLo() {
		return lo;
	}
	public void setLo(double lo) {
		this.lo = lo;
	}
	
	public void carinfo() {
		System.out.println("车牌:"+getId()+",车速："+getSo()+",载重:"+getLo());
	}
	
	public void addso(int so) {
		if(so>0) {
			setSo(getSo()+so);
		}else {
			System.out.println("加速不了!");
		}
	}
	
	public void reduce(int so) {
		if(so>this.so) {
			System.out.println("当前速度为零！");
			setSo(0);
		}else {
			setSo(this.so-so);
		}
	}
	
	
}