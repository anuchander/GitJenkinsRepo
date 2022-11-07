/**
 * 
 */
package com.JenkinsProject.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.JenkinsProject.base.BaseClass;

/**
 * @author anu
 *
 */
public class TestClass1 extends BaseClass{
	
	Logger log = (Logger) LogManager.getLogger(TestClass1.class.getName());
	//private static org.apache.logging.log4j.Logger demologger = LogManager.getLogger(TestClass1.class.getName());
	
	@Test
	public void method1() {
		log.info("This is before method1 in TestClass1");
		System.out.println("This is message from method1");
		log.info("This is after method1 in TestClass1");
	}
	
	@Test
	public void method2() {
		log.info("This is before method2 in TestClass1");
		System.out.println("This is message from method2");
		log.info("This is after method2 in TestClass1");
	}
	
	@Test
	public void method3() {
		log.info("This is before method3 in TestClass1");
		System.out.println("This is message from method3");
		log.info("This is after method3 in TestClass1");
	}
	
	@Test
	public void method5() {
		log.info("This before nethod5 in TestClass1");
		System.out.println("This is method5 for testing rebase");
		log.info("This is after method5 in TestClass1");
	}

}
