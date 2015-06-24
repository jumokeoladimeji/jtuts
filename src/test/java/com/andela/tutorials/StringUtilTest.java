package com.andela.tutorials;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testCompareTo() {
		assertNotEquals(0, StringUtil.compare("Hello", "Goodbye"));
	}
	
	@Test
	public void testReverseAndMute(){
		assertEquals("kmj", StringUtil.reverseAndMute("jumoke"));
		assertEquals("sr", StringUtil.reverseAndMute("Iris"));
	}
}
