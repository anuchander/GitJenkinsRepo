/**
 * 
 */
package com.JenkinsProject.testcases;

import org.testng.annotations.Test;

/**
 * @author anu
 *
 */
public class TestClass4 {

	@Test
	public void method1() {
		System.out.println("This is method1 in TestClass4");
	}
	
	@Test
	public void methodCreatedInBranch() {
		System.out.println("I am created in local Branch01");
		
	}
	
	@Test
	public void methodCreatedAtGitHub(){
		System.out.println("This method created in GitHub");
	}
	
	@Test
	public void newMethod() {
		
	}
	
	
}
