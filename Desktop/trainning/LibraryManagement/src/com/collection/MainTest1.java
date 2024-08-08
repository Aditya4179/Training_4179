package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class MainTest1 {
	public static void main(String args[]) {
		LinkedHashSet<Model> modelList=new LinkedHashSet<Model>();
		modelList.add(new Model("Karishma","Jalgaon",1));
		modelList.add(new Model("Madhu","dhule",2));
		modelList.add(new Model("Teju","shirpur",3));
		
		Iterator<Model> iterate= modelList.iterator();
		while(iterate.hasNext()) {
			System.out.println(iterate.next().toString());
		}
		
		ArrayList<Model> list1=new ArrayList<Model>();
		list1.add(new Model("kari","Jalgaon",1));
		list1.add(new Model("Teju","Jalgaon",4));
		list1.add(new Model("kari","Jalgaon",1));
		
		modelList.addAll(list1);
		
		Iterator<Model> iterate1= modelList.iterator();
		while(iterate1.hasNext()) {
			System.out.println(iterate1.next().toString());
		}
		
		LinkedHashSet<String> list=new LinkedHashSet<String>();
		
		ArrayList<String> a=new ArrayList<String>();
		
		a.add("Karishma");
		a.add("Karishma");
		
		list.addAll(a);
		System.out.println(list);
	}

}
