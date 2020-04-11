/**
 * Gagandeep
 * 1:14:53 pm
 * 11-Apr-2020
 */
package com.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoLoggingAspect {
	
	/**
	 * Adding a logging aspect for logging purpose 
	 * @return void
	 * 
	 * @Before("execution(public void addAccount())") - Match any method with this name in any class
	 * @Before("execution(public void com.aop.dao.AccountDao.addAccount())") - Match only one method
	 * @Before("execution(public void add*())")  - MAtch all methods in all class with name starting from add
	 * @Before("execution(* * addAccount())") - Match addAccoutn method with any access specifier and return type
	 * @Before("execution(* addAccount())") - Match any return type, modifier is optional
	 * @Before("execution(public void add*(com.aop.entity.Account))") - Will worlk only for Account parameter type
	 * @Before("execution(public void add*(Account))") - Will cause error, always use fully qualified name
	 * @Before("execution(public void add*(String, ..))") - All methos with Strig followed by any parameter
	 * @Before("execution(public void add*(..))") - All methods with any parameter
	 * @Before("execution(* com.aop.dao.*.*(..))")
	 * 	-> Classname * -> Methodname * -> Any no. of param(..)
	 * 
	 * 
	 */

	@Before("execution(* com.aop.dao.*.*(..))")
	public void beforeMehotd() {
		System.out.println("----------Executing @Before addAccount()----------");
	}

}
