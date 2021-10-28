
package com.cybage.collectionsgen.assign_3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDets {

	public static void main(String[] args) {
		Map<Book, Integer> hashMap = new HashMap<>();
		hashMap.put(new Book("Alpha"), 200);
		hashMap.put(new Book("Bravo"), 300);
		hashMap.put(new Book("Delta"), 400);
		hashMap.put(new Book("Echo"), 500);
		
		Iterator<Entry<Book, Integer>> iterator = hashMap.entrySet().iterator();
		
		while(iterator.hasNext()) {
			Map.Entry<Book, Integer> set = (Map.Entry<Book, Integer>)iterator.next();
		System.out.println(set.getKey().getName()+" "+set.getValue());
		}
		
	}

}
