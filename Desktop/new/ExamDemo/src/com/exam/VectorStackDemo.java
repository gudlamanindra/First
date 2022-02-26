package com.exam;

import java.util.Vector;


public class VectorStackDemo {

	public static void main(String[] args) {
@SuppressWarnings("rawtypes")
Vector<Comparable> vec=new Vector<Comparable>();
vec.add(45);
vec.add(55);
vec.add(0,"ram");
vec.add(45.45);
vec.add(null);
System.out.println(vec);

	}

}
