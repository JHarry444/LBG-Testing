package com.qa.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CatTest {

	private Cat cat = new Cat();

	@Test
	void testNoise() {
		Assertions.assertEquals("Meow", cat.makeNoise());
	}

}
