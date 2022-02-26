package com.exam;

import java.util.LinkedList;



public class LinkedListDemo {

	public static void main(String[] args) {
 @SuppressWarnings("rawtypes")
LinkedList<Comparable> list=new LinkedList<Comparable>();
 
 list.add(45);

 list.add(55);
 list.add("job");
 list.add(45);
 list.add("job");
 list.add(65);
 list.add(0,"hard");
 list.add(null);
 Object obj=list.get(2);
 System.out.println(obj);
 Object obj2=list.getFirst();
 System.out.println(obj2);
 Object obj3=list.getLast();
 System.out.println(obj3);
 System.out.println(list);
	}

}
