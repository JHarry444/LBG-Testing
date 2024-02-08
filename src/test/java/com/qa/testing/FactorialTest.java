package com.qa.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTest {

	private Factorial factorial = new Factorial();

	@Test
	void test1() {
		Assertions.assertEquals("1!", this.factorial.reverse(1));
	}

	@Test
	void test2() {
		Assertions.assertEquals("2!", this.factorial.reverse(2));
	}

	@Test
	void test6() {
		Assertions.assertEquals("3!", this.factorial.reverse(6));
	}

	@Test
	void test120() {
		Assertions.assertEquals("5!", this.factorial.reverse(120));
	}

	@Test
	void test150() {
		Assertions.assertEquals("NONE", this.factorial.reverse(150));
	}
}
