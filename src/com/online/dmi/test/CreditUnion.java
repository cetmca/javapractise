package com.online.dmi.test;

import java.util.List;

public class CreditUnion {
	private String name;
	private List<Accounts> account;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Accounts> getAccount() {
		return account;
	}
	public void setAccount(List<Accounts> account) {
		this.account = account;
	}

}
