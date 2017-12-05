package com.test.bala;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestExample {

	
	 int a=3;
	@BeforeClass
	public static void beforeClass() {
	   System.out.println("in before class");
	}

	//execute after class
	@AfterClass
	public static void  afterClass() {
	   System.out.println("in after class");
	}

	//execute before test
	@Before
	public void before() {
	   System.out.println("in before");
	}
		
	//execute after test
	@After
	public void after() {
	   System.out.println("in after");
	}
		
	//test case
	@Test
	public void test() {
		a=a/0;
	   System.out.println("in test");
	}
		
	//test case ignore and will not execute
	@Test
	@Ignore
	public void ignoreTest() {
	   System.out.println("in ignore test");
	}	
	
	@Test(timeout=1)
	public void testTimeOut(){
		int a[]={1,2,3,4};
		int b[]=new int[4];
		for(int i=0;i<a.length;i++){
			b[i]=a[i]*9999;
		}
		for(int i=0;i<a.length;i++)
		System.out.println(b[i]);
	}

}
