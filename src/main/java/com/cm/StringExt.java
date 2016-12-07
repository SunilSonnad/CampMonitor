package com.cm;

/**
 * This class provides static methods as an extension to the String class.
 * As we cannot extend String class in Java.
 * @author
 */
public class StringExt {

	/**
	 * Returns true if the string is null or empty.
	 * @return
	 */
	public static boolean isNullOrEmpty(String value) {
		return value == null || value.isEmpty();
	}

}
