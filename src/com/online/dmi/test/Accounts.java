package com.online.dmi.test;

public abstract class Accounts {
	protected String owner;
	protected int balance;
	protected String typeOfAccount;
	protected int withDrawelLimit;
	
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getTypeOfAccount() {
		return typeOfAccount;
	}

	public int getWithDrawelLimit() {
		return withDrawelLimit;
	}
	public void setWithDrawelLimit(int withDrawelLimit) {
		this.withDrawelLimit = withDrawelLimit;
	}

	

}
