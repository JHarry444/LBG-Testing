package com.qa.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcTest {

	private Calculator calc = new Calculator();

	@Test
	void testAdd() {
		Assertions.assertEquals(8, this.calc.add(4, 4));
	}
}
