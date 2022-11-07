/**
 * 
 */
package com.JenkinsProject.testcases;

import org.testng.annotations.Test;

/**
 * @author anu
 *
 */
public class TestClass3 {
	
	@Test
	public void method1() {
		System.out.println("This is method1 in TestClass3");
	}
	
	@Test
	public void method2(){
		System.out.println("This is method2 in TestClass3");
	}
	
	@Test
	public void method3() {
		System.out.println("This is method3 in TestClass3");
	}
	public void method4(){
		System.out.println("This is method4 in TestClass3 added in Github");

	}

	public void method5() {
		System.out.println("This method added in branch to test merge conflicts");
	}

	@Test
	public void method6(){
		System.out.println("Added method6 in TestClass3 in Github");

	}
	
	@Test
	public void methodInBranck() {
		System.out.println("Added method in branch");
		
	}
	
	@Test
	public void methodInGitHub(){
		System.out.println("Added methodInGitHub");
	}

}
