package com.online.dmi.test;

public class AccountProcessing {
	public String deposit(Accounts ac, int amount)
	{
		ac.setBalance(ac.getBalance()+amount);
		return "SUCCESS";
	}

	public String withdrawal(Accounts ac, int amount)
	{
		ac.setBalance(ac.getBalance() - amount);
		return "SUCCESS";
	}
	
	public String transfer(Accounts from,Accounts to, int amount) throws Exception
	{
		if (from.getTypeOfAccount()=="Consumer" && amount >750)
		{
			throw new Exception("Your Transfer Limit exceeded");
		}
		
		if (from.getBalance() < amount)
		{
			throw new Exception("your balance is below ");
		}
		
		from.setBalance(from.getBalance() - amount);
		to.setBalance(to.getBalance() + amount);
		return "SUCCESS";
		
	}

}
