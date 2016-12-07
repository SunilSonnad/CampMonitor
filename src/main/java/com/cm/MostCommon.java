package com.cm;
import java.util.HashMap;
import java.util.Map;

/**
 * This class contains methods to calculate the most common elements.
 * @author sunilsonnad
 *
 */
public class MostCommon {
	   
	/**
	 * Returns an array of values that have occurred maximum number of times
	 * in the given array.
	 * @param a
	 * @return
	 * If null or empty then returns empty array.
	 * else returns non empty array.
	 */
	public static int[] mostCommonElements(int[] a) {
		
		//Return empty array if null or empty
		if(a == null || a.length == 0) {
			return new int[]{};
		}
		
		// map to store the count of occurrences
		Map<Integer, Integer> mapStore = new HashMap<>();
		
		final int maxCount = addRepetationsToMap(a, mapStore);
		
		int[] r = mapStore.entrySet().stream().filter(map -> map.getValue() == maxCount).
						mapToInt(map -> map.getKey()).toArray();

		return r;
	}

	private static int addRepetationsToMap(int[] a, Map<Integer, Integer> mapStore) {
		// stores the max count.
		int maxCount = 0;
		
		// store the occurrences in the map.
		for(int i : a) {
			int c = 1;
			if (mapStore.get(i) == null) {
				mapStore.put(i, 1);
			}
			else {
				c = mapStore.get(i);
				mapStore.put(i, ++c);
			}
			
			if(c > maxCount) {
				maxCount = c;
			}
		}
		return maxCount;
	}
}
