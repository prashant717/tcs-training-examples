package com.tcs.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreamForSimpleTypes {
	public static void main(String[] args) {
		// list is the original data structure
		List<Integer> list = new ArrayList<Integer>();
		list.add(30);
		list.add(10);
		list.add(40);
		list.add(20);
		System.out.println("Original List: "+list);
		list.stream().forEach(item-> System.out.println(item));
		System.out.println("After sorting ascending-------------------------");
		list.stream().sorted((x,y)->Integer.compare(x,y)).forEach(item->System.out.println(item));
		System.out.println("After Descending-----------");
		list.stream().sorted((x,y)->Integer.compare(y, x)).forEach(item->System.out.println(item));
		List <Integer> deslist=list.stream().sorted((x,y)->Integer.compare(y, x)).collect(Collectors.toList());
	System.out.println(deslist);
	}
}