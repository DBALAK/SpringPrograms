package com.JUnitAnnot;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class CalcuTest {

	Calculator c = new Calculator();

	@Test
	public void testAdd() {
		System.out.println("In testAdd method");
		assertEquals(6, c.add(2, 4));
	}

	@Ignore("Not yet implemented")
	@Test
	public void testSub() {
		System.out.println("In testSub method");
		assertEquals(2, c.sub(4, 2));
	}
	
	
	@Test(expected=ArithmeticException.class,timeout=1000)
	public void testDiv() {
		System.out.println("In testDiv method");
		assertEquals(2, c.div(4, 0));
	}
	
}
