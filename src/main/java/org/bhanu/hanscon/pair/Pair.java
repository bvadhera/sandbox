package org.bhanu.hanscon.pair;

/**
 * Class to represent a collection that contains a key/value pair
 * @author bhanu Vadhera
 * @date 12/11/2017
 *
 */

public class Pair<K, V> {

	private K key;
	public V value;


	// the Getters
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}

	// the Setters
	public void setKey(K key) {
		this.key = key;
	}
	public void setValue(V value) {
		this.value = value;
	}

	/**
	 * The Constructor.
	 * @param arg1 key
	 * @param arg2 value
	 */
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	@SuppressWarnings("rawtypes")
	@Override
	/** implements equals.
	 * @param arg2 Object
	 * @return A boolean if object passed is equal.
	 */
	public boolean equals(Object other) {
		if(other == null || !(other instanceof Pair))return false;
		Pair p = (Pair)other;
		return key.equals(p.key) && value.equals(p.value);
	}
	
	@Override
    /** implements hashCode.
     * @return A unique value.
     */
	public int hashCode() {
		return 37 * key.hashCode() + value.hashCode();
	}
	
	@Override
    /**
     * @return A key-value as string
     */
	public String toString() {
		return "key: " + key + " value: "+ value;
	}
}
