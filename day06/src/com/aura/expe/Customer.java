package com.aura.expe;

public class Customer {
	private String firstname;
	private String lastName;
	private Account account;
	
	public Customer(String f,String l) {
		firstname = f;
		lastName = l;			
	}
	
	public String getFirstName() {
		return firstname;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public Account getAccount() {
		return account;
	}
	
	public void setAccount(Account account) {
		this.account = account;
		
	}
	
	

	
}
