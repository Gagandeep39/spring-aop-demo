/**
 * Gagandeep
 * 1:54:08 pm
 * 11-Apr-2020
 */
package com.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDao {
	
	public void addAccount() {
		System.out.println(getClass() + " Doing DB Work: Adding a member");
	}

}
