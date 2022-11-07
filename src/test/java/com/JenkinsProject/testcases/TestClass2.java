/**
 * 
 */
package com.JenkinsProject.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.testng.annotations.Test;

/**
 * @author anu
 *
 */
public class TestClass2 {
	Logger log = (Logger) LogManager.getLogger("TestClass2.java");
	
	@Test
	public void method1() {
		log.info("This is before method1 in TestClass2");
		System.out.println("I am in method1 of TestClass2");
		log.info("This is after method1 in TestClass2");
	}
	
	@Test
	public void method2() {
		log.info("This is before method2 in TestClass2");
		System.out.println("I am in method2 of TestClass2");
		log.info("This is after method2 in TestClass2");
	}
	
	@Test
	public void method3(){
		log.info("This is before method3 in TestClass2");
		System.out.println("I am method3 in TestClass2");
		log.info("This is after method3 in TestClass2");
	}
	
	@Test
	public void method4() {
		log.info("This is before method4 in TestClass2");
		System.out.println("I am method4 in TestClass2");
		log.info("This is after method4 in TestClass2");
	}
	
	@Test
	public void method5(){
		log.info("This is before method5 in TestClass2");
		System.out.println("I am method5 in TestClass2");
		log.info("This is after method5 in TestClass2");
	}

}
