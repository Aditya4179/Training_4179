package com.collection;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableTest {
	public static void main(String args[]) {
		Hashtable<Integer,String> hashtable=new Hashtable<Integer,String>();
		hashtable.put(1,"Kari");
		hashtable.put(2,"Mayu");
		hashtable.put(3,"Tej");
		hashtable.put(4,"Madhu");
		
		System.out.println(hashtable.getOrDefault(2, "key is Not there "));
		hashtable.putIfAbsent(5, "isha");
		System.out.println(hashtable);
		Enumeration<Integer> en=hashtable.keys();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	
		
		Set<Entry<Integer,String>> set=hashtable.entrySet();
		for(Entry<Integer,String> e1 : set) {
			System.out.println(e1.getKey()+" : "+e1.getValue());
		}
		
		set.stream().forEach(System.out::println);
	}

}
