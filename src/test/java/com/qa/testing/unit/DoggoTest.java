package com.qa.testing.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.qa.testing.Doggo;

public class DoggoTest {

	private Doggo doggo = new Doggo();

	@Test
	void testSize() {
		assertEquals(99, this.doggo.compete(42).size());
	}

	@Test
	void testContains() {
		assertEquals(false, this.doggo.compete(42).contains("42nd"));
	}

	@Test
	void testFirst() {
		assertEquals(true, this.doggo.compete(42).contains("21st"));
	}

	@Test
	void testSecond() {
		assertEquals(true, this.doggo.compete(42).contains("22nd"));
	}

	@Test
	void testThird() {
		assertEquals(true, this.doggo.compete(42).contains("23rd"));
	}

	@Test
	void testFourth() {
		assertEquals(true, this.doggo.compete(42).contains("24th"));
	}

	@Test
	void testEleven() {
		assertEquals(true, this.doggo.compete(42).contains("11th"));
	}

	@Test
	void testTwelve() {
		assertEquals(true, this.doggo.compete(42).contains("12th"));
	}

	@Test
	void testThirteen() {
		assertEquals(true, this.doggo.compete(42).contains("13th"));
	}

}
