package com.cm;
import static org.junit.Assert.*;

import java.util.stream.IntStream;

import org.junit.Test;

import com.cm.MostCommon;

public class MostCommonTest {

	@Test
	public void testValues() {
		int[] a = {1, 2, 3, 4, 5, 6, 7};
		int[] r = MostCommon.mostCommonElements(a);
		assertArrayEquals(IntStream.of(a).sorted().toArray(), IntStream.of(r).sorted().toArray());
	}
	
	@Test
	public void test1MaxValue() {
		int[] a = {11, 32, 432, 54, 52, 432};
		assertArrayEquals(new int[] {432}, MostCommon.mostCommonElements(a));
	}
	
	@Test
	public void test2MaxValues() {
		int[] a = {11, 32, 432, 54, 54, 432, 34, 23, 56};
		int[] r = MostCommon.mostCommonElements(a);
		
		assertArrayEquals(new int[] {54, 432}, IntStream.of(r).sorted().toArray());
	}
	
	@Test
	public void testAllValues() {
		int[] a = {7, 7, 7, 7, 7, 7};
		int[] r = MostCommon.mostCommonElements(a);
		
		assertArrayEquals(new int[] {7}, r);
	}
	
	@Test
	public void testEmptyArray() {
		assertTrue(MostCommon.mostCommonElements(new int[] {}).length == 0);
	}
	
	@Test
	public void testNullArray() {
		assertTrue(MostCommon.mostCommonElements(null).length == 0);
	}

}
