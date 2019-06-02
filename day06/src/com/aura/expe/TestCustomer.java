package com.aura.expe;

public class TestCustomer {
	public static void main(String[] args) {
		Customer c = new Customer("Jane","Smith");
		c.setAccount(new Account(100, 2000, 0.0123));
		c.getAccount().deposit(100);
		c.getAccount().withdraw(960);
		c.getAccount().withdraw(2000);
		System.out.println(c.getFirstName()+" "+c.getLastName()
		+",�˺ţ�"+c.getAccount().getId()
		+",��"+c.getAccount().getBalance()
		+",����Ϊ��"+c.getAccount().getAnnualInterestRate());
	}
}
