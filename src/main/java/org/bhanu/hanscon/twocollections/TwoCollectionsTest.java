package org.bhanu.hanscon.twocollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoCollectionsTest {

	public static void main(String[] args) {
		Collection<Integer> col1 = createRandomCollection(1, 10);
		printCollection(col1);
		
		Collection<Integer> col2 = createRandomCollection(6, 15);
		printCollection(col2);
		
		Set<Integer> mergeSet = new HashSet<Integer>();
		mergeSet.addAll(col1);
		mergeSet.addAll(col2);
		List<Integer> mergedList = new ArrayList<Integer>(mergeSet.size());
		mergedList.addAll(mergeSet);
		mergedList.remove(mergedList.size()/2);
		Collections.reverse(mergedList);
		printCollection(mergedList);
	}

	static Collection<Integer> createRandomCollection(int min, int max){
		List<Integer> intList = new ArrayList<Integer>();
		for(int i = min; i <= max; i++) {
			intList.add(i);
		}
		Collections.shuffle(intList);
		return intList;
	}
	
	static void printCollection(Collection<?> collection){
		System.out.println("Collection size:" + collection.size());
		for(Object val: collection) {
			System.out.println(val == null ? "null value" : val.toString());
		}
	}
}
