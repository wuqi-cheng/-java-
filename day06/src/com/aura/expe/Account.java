package com.aura.expe;

public class Account {
	private int id;   //账号
	private double balance;   //余额
	private double annualInterestRate;  //年利率
	
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
	
	//在提款方法withdraw中，需要判断用户余额是否能够满足提款数额的要求，如果不能，应给出提示。
	public void withdraw (double amount) {
		if(amount > balance) {
			System.out.println("您的取款金额超过你账户的余额！请重新操作!");
		}else {
			balance = balance-amount;
			System.out.println("成功取出："+amount);
		}
	}
	
	//存钱
	public void deposit (double amount) {
		balance = balance+amount;
		System.out.println("成功存入："+amount);
	}


}
