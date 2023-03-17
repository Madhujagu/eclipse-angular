package com.math.demo.arthmeticTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.math.demo.arthimeticOperation.ArtmeticOperation;

class ArthmeticTest {

	@Test
	public void test() {
		ArtmeticOperation resAdd=new ArtmeticOperation();
		int expected = 50;
		int res = resAdd.performAddition(50, 50);
		assertEquals(expected, res);
	}
}
