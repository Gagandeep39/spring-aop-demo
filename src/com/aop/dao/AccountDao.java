/**
 * Gagandeep
 * 1:03:25 pm
 * 11-Apr-2020
 */
package com.aop.dao;

import org.springframework.stereotype.Component;

import com.aop.entity.Account;

@Component
public class AccountDao {
	
	public void addAccount() {
		System.out.println(getClass() + " Doing DB Work: Adding an Account");
	}
	
	public void addCredit() {
		System.out.println(getClass() + " Doing DB Work: Adding a Credit");
	}

	public String addDebit() {
		System.out.println(getClass() + " Doing DB Work: Debiting amount");
		return "";
	}
	
	public void addAccount(Account account) {
		System.out.println(getClass() + " Method with Account as Parameter");
	}
	
	public void addAccount(String string, Account account) {
		System.out.println(getClass() + " Method with String, Account as Parameter");
	}
	
	public void addAccount(String string, Account account, String s2, String s3) {
		System.out.println(getClass() + " Method with multiple Parameter");
	}

}
