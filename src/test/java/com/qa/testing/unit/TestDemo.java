package com.qa.testing.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestDemo {

	@Test // DO NOT CALL THE CLASS TEST
	void shouldPass() {
		// assertEquals(exp, actual)
		Assertions.assertEquals(2, 1 + 1);
	}

	@Test // DO NOT CALL THE CLASS TEST
	void shouldFail() {
		Assertions.assertEquals(3, 1 + 1);
	}

	@Test // DO NOT CALL THE CLASS TEST
	void shouldPassDouble() {
		// assertEquals(exp, actual, range)
		Assertions.assertEquals(0.3, 0.1 + 0.1 + 0.1, 0.01);
	}
}
