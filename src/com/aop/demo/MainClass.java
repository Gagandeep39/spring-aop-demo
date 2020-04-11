/**
 * Gagandeep
 * 1:10:23 pm
 * 11-Apr-2020
 */
package com.aop.demo;

import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.aop.config.AppConfig;
import com.aop.dao.AccountDao;
import com.aop.dao.MembershipDao;
import com.aop.entity.Account;

public class MainClass {
	/**
	 * Uses Spring 5.0.8
	 * AspecrtJWeaver 1.9.5
	 * @return void
	 */
	
	public static void main(String[] args) {
		
		/**
		 * Initializing Annoation based ncfiguration
		 */
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		

		
		/*
		 * DEMO 1
		 * pre Excuting a mehod before excuting the called method
		 * @Before("execution(public void addAccount())")
		 */
		AccountDao dao = context.getBean("accountDao", AccountDao.class);

		dao.addAccount();
		
		/*
		 * DEMO 2 
		 * Match only one method of a specific class
		 * Ogging WOnt work when this is used
		 * @Before("execution(public void com.aop.dao.AccountDao.addAccount())")
		 */
		
		MembershipDao dao2 = context.getBean("membershipDao", MembershipDao.class);
		
		dao2.addAccount();
		
		/**
		 * DEMO 3
		 * Match any method starting from 'adds'
		 * Loggin will only work wheb this is enabled
		 * @Before("execution(public void add*())")
		 */
		dao.addCredit();
		
		/**
		 * DEMO 4
		 * Match any return type (Below method returns a string)
		 * Logging will work for 
		 * @Before("execution(* add*())")
		 */
		dao.addDebit();
		
		/**
		 * DEMO 5
		 * Match method with 'Account' as a parameter
		 * @Before("execution(public void add*(com.aop.entity.Account))")
		 */
		dao.addAccount(new Account());
		
		/**
		 * DEMO 6
		 * Match method with multiple parameter
		 * @Before("execution(public void add*(String, ..))")
		 * @Before("execution(public void add*(..))")
		 */
		dao.addAccount("", new Account());
		
		/**
		 * DEMO 7
		 * Mach any method with any parameter 
		 * @Before("execution(* com.aop.dao.*.*(..))")
		 */
		dao.addAccount("", new Account(), "", "");
		context.close();
	}

}
