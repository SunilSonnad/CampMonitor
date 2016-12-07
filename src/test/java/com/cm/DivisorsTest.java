package com.cm;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import org.junit.Test;

import com.cm.Divisors;

public class DivisorsTest {

	@Test
	public void testNormal() {
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		expected.add(10);
		expected.add(12);
		expected.add(15);
		expected.add(20);
		expected.add(30);
		expected.add(60);
		
		assertEquals(expected, Divisors.divisors(60));
	}
	
	@Test
	public void testSmallValue() {
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		assertEquals(expected, Divisors.divisors(1));
		
		expected.add(2);
		assertEquals(expected, Divisors.divisors(2));
	}
	
	@Test
	public void testZero() {
		assertEquals(new ArrayList<>(), Divisors.divisors(0));
	}
	
	@Test(expected=RuntimeException.class)
	public void testNegativeAndNull() {
		List<Integer> expected = new ArrayList<>();
		
		assertEquals(expected, Divisors.divisors(-10));
		assertEquals(expected, Divisors.divisors(null));
	}

	@Test
	public void testPrime() {
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		expected.add(13);
		assertEquals(expected, Divisors.divisors(13));
	}
	
	@Test
	public void testPerfectSquare() {
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		expected.add(3);
		expected.add(9);
		expected.add(27);
		expected.add(81);
		
		assertEquals(expected, Divisors.divisors(81));
	}
}
