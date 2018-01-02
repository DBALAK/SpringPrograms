package com.JUnitExamples;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class AssertionsTestRunner {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(Assertions.class);

		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}

		System.out.println(result.wasSuccessful());
	}
}
