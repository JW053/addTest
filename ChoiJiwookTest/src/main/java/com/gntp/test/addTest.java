package com.gntp.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.gntp.jiwook.adder;


public class addTest {
	@Test
	public void evaluatesAddition() {
		adder cal = new adder();
		int result = cal.addition(1,3);
		assertEquals(4, result);
	}
}
