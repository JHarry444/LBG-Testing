package com.qa.testing.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.qa.testing.Calculator;

public class CalcTest {

	private Calculator calc = new Calculator();

	@Test
	void testAdd() {
		Assertions.assertEquals(8, this.calc.add(4, 4));
	}
}
