package com.collection;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetTest {
	public static void main(String args[]) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Karishma");
		list.add("Madhu");
		list.add("Teju");
		list.add("Karishma");
		
		HashSet<String> hasset=new HashSet<String>();
		hasset.addAll(list);
		System.out.println(hasset);
		
		hasset.stream().forEach(System.out::println);
	}

}
