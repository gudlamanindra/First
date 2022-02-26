package com.exam;


import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
      
	@SuppressWarnings("rawtypes")
	ArrayList<Comparable> a1 = new ArrayList<Comparable>();
      boolean s1=a1.add(25);
      System.out.println(s1);
      boolean s2=a1.add("job");
      System.out.println(s2);
      boolean s3=a1.add(27);
      System.out.println(s3);
      
      boolean s4=a1.add(29);
      System.out.println(s4);
      boolean s5=a1.add(null);
      System.out.println(s5);
      
      a1.add(0,"practice");
      
      Object obj=a1.get(4);
      System.out.println(obj);
      Object remove=a1.remove(2);
      System.out.println(remove);
      System.out.println(a1);
	}

}
