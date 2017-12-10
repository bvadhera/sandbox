package org.bhanu.hanscon.pair;

import java.util.ArrayList;
import java.util.Collection;

public class PairTestMain {

	public static void main(String[] args) {
		Collection<Pair<Integer, String>> pairs = new ArrayList<Pair<Integer, String>>();
		pairs.add(new Pair<Integer, String>(1, "1"));
		pairs.add(new Pair<Integer, String>(2, "2"));
		pairs.add(new Pair<Integer, String>(5, "5"));
		pairs.add(new Pair<Integer, String>(3, "3"));
		pairs.add(new Pair<Integer, String>(4, "4"));
		
		pairs.add(new Pair<Integer, String>(3, "3"));
		for(Pair<Integer, String> p: pairs) {
			System.out.println(p.toString());
		}
		System.out.println("Size: " + pairs.size());
	}
	/**
	 * 
	 * @param pairs
	 * @param thepair
	 * @return true if the value was added
	 */
	boolean addPair(Collection<Pair<Integer, String>> pairs, Pair<Integer, String> thepair) {
		boolean isduplicate = false;
		for(Pair<Integer, String> p: pairs) {
			if(p.equals(thepair)) {
				isduplicate = true;
			}
		}
		if(!isduplicate) {
			pairs.add(thepair);
		}
		return !isduplicate;
	}

}
