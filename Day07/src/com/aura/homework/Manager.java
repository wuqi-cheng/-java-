package com.aura.homework;

public class Manager {
	private String name; //����
	private int id;  // ����
	private int wage;  // ���� 
	private int bonus;  //����
	
	public Manager() {	}
	
	public Manager(String name,int id,int wage) {
		this.name = name;
		this.id = id;
		this.wage = wage;
	}
	
	public Manager(String name,int id,int wage,int bonus) {
		this(name,id,wage);
		this.bonus = bonus;
	}
	
	public void work() {
		System.out.println("����:"+name+"������:"+id+"�����ʣ�"+wage);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getWage() {
		return wage;
	}
	public void setWage(int wage) {
		this.wage = wage;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
}


class Programmer extends Manager {
	public Programmer(String name,int id,int wage) {
		super(name,id,wage);
	}
}

