package com.aura.homework;

public class TestAccount {
	public static void main(String[] args) {
		Account a = new Account(1112,20000,0.045);
		a.withdraw(2500);
		System.out.println("余额为："+a.getBalance());
		a.deposit(3000);
		System.out.println("余额为："+a.getBalance()+",月利率为："+a.getMonthlyInterest());
	}
	
}

class Account{
	private int id;
	private double balance;
	private double annualInterestRate;
	
	public Account() {}
	
	public Account (int id, double balance, double annualInterestRate ) {
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
	
	public double getMonthlyInterest() {
		return getAnnualInterestRate()/12;
	}
	
	public void withdraw (double amount) {
		if(amount > balance) {
			System.out.println("您的取款金额超过你账户的余额！请重新操作!");
		}else {
			balance = balance-amount;
			System.out.println("成功取出："+amount);
		}
	}
	
	public void deposit (double amount) {
		balance = balance+amount;
		System.out.println("成功存入："+amount);
	}

}
