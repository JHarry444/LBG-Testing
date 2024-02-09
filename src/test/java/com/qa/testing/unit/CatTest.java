package com.qa.testing.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.qa.testing.Cat;

public class CatTest {

	private Cat cat = new Cat();

	@Test
	void testNoise() {
		Assertions.assertEquals("Meow", cat.makeNoise());
	}

}
