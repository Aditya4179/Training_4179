package com.streamdemo;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String args[]) {
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("karishma");
		arr.add("");
		
		List<String> mylist=Arrays.asList("apple","banana","oragne","aaa","bbb","aaa","bbb");
		
		
		Stream<String> sequencialStream=mylist.stream();
		Stream<String> parallelStream=mylist.parallelStream();
	    
		Stream<String> stream=Stream.of("apple","banana","orange");//used to create stream with sequencial elements
		sequencialStream=Stream.of("hello");//creating stream with single value
		System.out.println(sequencialStream);
		
		stream.forEach(System.out::println);
		sequencialStream.forEach(System.out::println);
		
		
		List<String> filtered=mylist.stream()
				.filter(s->s.length()>3)
				.collect(Collectors.toList());
		
		System.out.println(filtered);
		
		List<Integer> integer=mylist.stream()
				.map(s->s.length())
				.collect(Collectors.toList());
		System.out.println(integer);
		
		List<Integer> integer1=mylist.stream()
				.map(String::length)
				.collect(Collectors.toList());
		System.out.println(integer);
		
		List<String> sorted=mylist.stream()
				.sorted()//by default it is ascending
				.collect(Collectors.toList());
		System.out.println(sorted);
		
		List<Integer> intList=Arrays.asList(10,30,50,45,14,76);
		List<Integer> sortedint=intList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortedint);
		
		List<Integer> intSorteddec=intList.stream()
				.sorted((a,b)->b-a)
				.collect(Collectors.toList());
		System.out.println(intSorteddec);
		
		Stream<Integer> st=Stream.of(5,9,93,57,0);
		st.sorted((a,b)->b-a).forEach(System.out::println);
		
		List<String> distinct=mylist.stream()
				.distinct()
				.collect(Collectors.toList());
		System.out.println(distinct);
		
		List<List<Integer>> listoflist=Arrays.asList(
				Arrays.asList(10,30),
				Arrays.asList(20,40)
				);
		
		List<Integer> newlist=listoflist.stream()
				.flatMap(List::stream)
				.collect(Collectors.toList());
		System.out.println(newlist);
		
		try (Stream<String> streamfile=Files.lines(Paths.get("src/main/java/com/streamdemo/Stream.txt")))
		{
			streamfile.forEach(System.out::println);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
