package com.cm;
import static org.junit.Assert.*;

import org.junit.Test;

import com.cm.AreaOfTriangle;
import com.cm.InvalidTriangleException;

public class AreaOfTriangleTest {

	@Test
	public void testValidAreas() throws InvalidTriangleException {
		
		assertEquals(6, AreaOfTriangle.area(3, 4, 5), 0.0);
		assertEquals(6.4, AreaOfTriangle.area(4, 5, 6), 0.1);
		assertEquals(649.5, AreaOfTriangle.area(70, 50, 30), 0.1);
	}
	
	@Test(expected=InvalidTriangleException.class)
	public void testException() throws InvalidTriangleException {
		// throw error as sides do not make a triangle
		assertEquals(6, AreaOfTriangle.area(3, 4, 10), 0.0);
	}
	
	@Test(expected=InvalidTriangleException.class)
	public void testExceptionNegative() throws InvalidTriangleException {
		// throw error as sides do not make a triangle
		assertEquals(6, AreaOfTriangle.area(3, -4, 5), 0.0);
	}

}
