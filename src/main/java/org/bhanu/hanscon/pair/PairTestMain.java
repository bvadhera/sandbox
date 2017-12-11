package org.bhanu.hanscon.pair;

import java.util.ArrayList;
import java.util.Collection;

public class PairTestMain {

	/** Choosing ArrayList<Pair<Integer, String>>  collection type as it is simple
     * to implement
	 * @return Add 5 key/value pairs to the collection (pair)
	 */

	public static void main(String[] args) {
		Collection<Pair<Integer, String>> pairs = new ArrayList<Pair<Integer, String>>();
		pairs.add(new Pair<Integer, String>(1, "1"));
		pairs.add(new Pair<Integer, String>(2, "2"));
		pairs.add(new Pair<Integer, String>(5, "5"));
		pairs.add(new Pair<Integer, String>(3, "3"));
		pairs.add(new Pair<Integer, String>(4, "4"));
		/**
		 * Adding a duplicate key/value pair (one of the five above)
         ▪ Check for duplicate key and print key/value if found (do not add it to the collection)
		 */
        Pair thepair =  new Pair<Integer, String>(3, "3");
        boolean isduplicate = false;
        for(Pair<Integer, String> p: pairs) {
            if(p.equals(thepair)) {
                isduplicate = true;
            }
        }
        if(!isduplicate) {
            pairs.add(thepair);
        }
		for(Pair<Integer, String> p: pairs) {
			System.out.println(p.toString());
		}
        System.out.println("Size: " + pairs.size());
        if(isduplicate) {
            System.out.println("Failed  to add a duplicate pair " + thepair.toString());
        }

	}

}
