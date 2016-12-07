package com.cm;

public class AreaOfTriangle {

	/**
	 * Returns the area of the triangle, given its sides.
	 * @param a
	 * @param b
	 * @param c
	 * @return area
	 * @throws InvalidTriangleException
	 */
	public static double area(int a, int b, int c) throws InvalidTriangleException {
		
		validateSides(a, b, c);
		
		double perimeter = calculatePerimeter(a, b, c);
		
		// Area of a triangle, with perimeter p, is calculated as
		// Sqrt of (p * (p-a)(p-b)(p-c)) 
		double area = Math.sqrt((double) perimeter * 
						 (perimeter - a) *
						 (perimeter - b) * 
						 (perimeter - c)
						);
		
		return area;
	}

	private static int calculatePerimeter(int a, int b, int c) {
		return (a + b + c) / 2;
	}

	private static void validateSides(int a, int b, int c) throws InvalidTriangleException {
		//Check if any value is negative
		if(a < 0 || b < 0 || c < 0) {
			throw new InvalidTriangleException("The sides cannot have negative value");
		}
		
		//Check if sides can form a triangle
		if((a+b) <= c || (b+c) <= a || (c+a) <= b) {
			throw new InvalidTriangleException("The sides dont make a triangle");
		}
	}
}
