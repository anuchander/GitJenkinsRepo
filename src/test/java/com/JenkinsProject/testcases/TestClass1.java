/**
 * 
 */
package com.JenkinsProject.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.JenkinsProject.base.BaseClass;

/**
 * @author anu
 *
 */
public class TestClass1 extends BaseClass{
	
	@Test
	public void method1() {
		System.out.println("This is message from method1");
	}
	
	@Test
	public void method2() {
		System.out.println("This is message from method2");
	}
	
	@Test
	public void method3() {
		System.out.println("This is message from method3");
	}
	
	@Test
	public void method4(){
		System.out.println("This is method4 written in Github and committed");
	}

}
