package com.junit.demo.junitTest;

public class Bank 
{
	private String name;
	private int balance;
	
	public Bank() {
		super();
	}

	public Bank(String name, int balance) {
		super();
		this.name = name;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int deposite(int amt) throws LimitExceedException
	{
		if(amt<50000) {

			this.balance=this.balance + amt;
		}
			
		else {
			throw new LimitExceedException("your trying out of limit");
		}
		return this.balance;
	}

	@Override
	public String toString() {
		return "Bank [name=" + name + ", balance=" + balance + "]";
	}
	

}
