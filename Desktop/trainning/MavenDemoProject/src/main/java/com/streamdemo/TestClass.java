package com.streamdemo;

import java.util.List;
import java.util.stream.Collectors;

public class TestClass {
	public static Integer solve(Integer n, Integer x) {
		try {
			return n/x;
		}catch(Exception e) {
			
		}
		return new Integer(-1);
	}
	public static List<Integer> divide(List<Integer> l1,Integer x){
		
		return l1.stream().map(n->solve(n,x)).collect(Collectors.toList());
	}

}
