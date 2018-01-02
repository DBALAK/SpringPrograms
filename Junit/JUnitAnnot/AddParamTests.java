package com.JUnitAnnot;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class AddParamTests {

	Calculator c = new Calculator();
	private int expected;
	private int first;
	private int second;

	public AddParamTests(int expected, int first, int second) {
		this.expected = expected;
		this.first = first;
		this.second = second;
	}

	@Parameters
	public static Collection<Object[]> testData() {
		Object[][] o = new Object[][] { { 6, 2, 4 }, { 7, 4, 3 }, { 8, 2, 6 } };
		return Arrays.asList(o);
	}

	@Test
	public void testAdd() {
		assertEquals(expected, c.add(first, second));
	}
}
