package org.bhanu.hanscon.twocollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Class to represent 2 collections where one contains integers 1 thru 10 (random order)
 * another  contains 6 thru 15 (random order).
 * @author bhanu Vadhera
 * @date 12/11/2017
 *
 */
public class TwoCollectionsTest {

	/**
	 * create Random Collection
	 * @param arg1 min
	 * @param arg1 max
	 * @return  collection of integers in random order within range of min to max.
	 */
	static Collection<Integer> createRandomCollection(int min, int max){
		List<Integer> intList = new ArrayList<Integer>();
		for(int i = min; i <= max; i++) {
			intList.add(i);
		}
		Collections.shuffle(intList);
		return intList;
	}

	/**
	 * prints Collection
	 * @param arg1 collection
	 */
	static void printCollection(Collection<?> collection){
		System.out.println("Collection size:" + collection.size());
		for(Object val: collection) {
			System.out.println(val == null ? "null value" : val.toString());
		}
	}

	public static void main(String[] args) {
		/**
		 * creates a Collection of integers in a random order from 1 - 10
		 */
		Collection<Integer> col1 = createRandomCollection(1, 10);
		/**
		 * Print first  collection and its size
		 */
		printCollection(col1);


		/**
		 * creates a Collection of integers in a random order from 6 - 15
		 */
		Collection<Integer> col2 = createRandomCollection(6, 15);
		/**
		 * Print second collection and its size
		 */
		printCollection(col2);

		/**
		 * Now to Combine the above two collections into a third collection
		 * we will use HashSet to avoid any duplicates
		 */
		Set<Integer> mergeSet = new HashSet<Integer>();
		mergeSet.addAll(col1);
		mergeSet.addAll(col2);
		List<Integer> mergedList = new ArrayList<Integer>(mergeSet.size());
		mergedList.addAll(mergeSet);
		/**
		 * Now Removing the middle entry
		 */
		mergedList.remove(mergedList.size()/2);

		/**
		 * make collection in reverse order
		 */
		Collections.reverse(mergedList);
		/**
		 * Print the collection in reverse order and its size
		 */
		printCollection(mergedList);
	}


}
