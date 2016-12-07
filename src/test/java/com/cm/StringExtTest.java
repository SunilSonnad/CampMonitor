package com.cm;
import static org.junit.Assert.*;

import org.junit.Test;

import com.cm.StringExt;

public class StringExtTest {

	@Test
	public void testNull() {
		assertTrue(StringExt.isNullOrEmpty(null));
	}
	
	@Test
	public void testEmpty() {
		assertTrue(StringExt.isNullOrEmpty(""));
	}
	
	@Test
	public void testNotNull() {
		assertFalse(StringExt.isNullOrEmpty("null"));
	}
	
	@Test
	public void testNotEmpty() {
		assertFalse(StringExt.isNullOrEmpty("a"));
	}

}
