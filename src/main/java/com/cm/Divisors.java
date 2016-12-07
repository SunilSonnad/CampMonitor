package com.cm;
import java.util.ArrayList;
import java.util.List;

public class Divisors {
	
	public static List<Integer> divisors(Integer number) {

		if(number == null || number < 0) {
			throw new RuntimeException("The input cannot be null or negative");
		}
		
		if(number == 0) {
			return new ArrayList<>();
		}
		
		//this list stores the smaller of the divisors in ascending order.
		List<Integer> ascList = new ArrayList<>();
		
		//this list stores the bigger of the divisors in descending order.
		List<Integer> descList = new ArrayList<>();
		
		//iterate only until the sqrt.
		int len = (int) Math.sqrt(number);
		
		for(int i = 1; i <= len; i++) {
			
			if(number % i == 0) {
				// add to the end of different lists to avoid insertion.
				ascList.add(i);
				descList.add(number / i);
			}
		}
		
		// remove duplicate element - in case of perfect square
		if(ascList.get(ascList.size() - 1)
				.equals(
						descList.get(descList.size() - 1)
						)
				) {
			descList.remove(descList.size() - 1);
		}
		
		// merge to single list.
		int i = descList.size() - 1;
		while(i >= 0) {
			ascList.add(descList.get(i--));
		}
		
		return ascList;
	}
}
