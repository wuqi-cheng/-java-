package com.aura.expe;

public class Account {
	private int id;   //�˺�
	private double balance;   //���
	private double annualInterestRate;  //������
	
	public Account(int id,double balance,double annualInterestRate) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	//������withdraw�У���Ҫ�ж��û�����Ƿ��ܹ�������������Ҫ��������ܣ�Ӧ������ʾ��
	public void withdraw (double amount) {
		if(amount > balance) {
			System.out.println("����ȡ��������˻����������²���!");
		}else {
			balance = balance-amount;
			System.out.println("�ɹ�ȡ����"+amount);
		}
	}
	
	//��Ǯ
	public void deposit (double amount) {
		balance = balance+amount;
		System.out.println("�ɹ����룺"+amount);
	}


}
