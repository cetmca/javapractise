package com.online.dmi.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountProcessingTest {
	
	AccountProcessing acctproc = new AccountProcessing();
	Accounts acc = new  Consumer();
	Accounts toacc = new  Consumer();
	Accounts fromacc = new  Commercial();
	
		

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testDeposit() {
		String status = acctproc.deposit(acc, 1000);
		System.out.println("---------------TEST DEPOSIT");
		assertEquals(status,"SUCCESS");
		//fail("Not yet implemented");
	}
	
	
	@Test
	public void testWithdrawal() {
		String status = acctproc.withdrawal(acc, 1000);
		System.out.println("---------------TEST WITHDRAWAL ");
		assertEquals(status,"SUCCESS");
		//fail("Not yet implemented");
	}
	
	@Test
	public void testTranfer() throws Exception {
		fromacc.setBalance(1234);
		fromacc.setWithDrawelLimit(750);
		System.out.println("---------------TEST TRANFER ");
		String status = acctproc.transfer(fromacc, toacc, 500);
		System.out.println("Status -------");
		assertEquals(status,"SUCCESS");
		//fail("Not yet implemented");
	}

}
