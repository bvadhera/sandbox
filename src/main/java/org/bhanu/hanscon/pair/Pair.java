package org.bhanu.hanscon.pair;

public class Pair<K, V> {

	private K key;
	public V value;
	
	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	@SuppressWarnings("rawtypes")
	@Override
	public boolean equals(Object other) {
		if(other == null || !(other instanceof Pair))return false;
		Pair p = (Pair)other;
		return key.equals(p.key) && value.equals(p.value);
	}
	
	@Override
	public int hashCode() {
		return 37 * key.hashCode() + value.hashCode();
	}
	
	@Override
	public String toString() {
		return "key: " + key + " value: "+ value;
	}
}
