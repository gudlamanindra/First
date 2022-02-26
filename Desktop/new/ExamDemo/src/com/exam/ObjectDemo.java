package com.exam;

public class ObjectDemo {
int id;
String job;
public void print(){
	System.out.println(id+"**"+job);
}
	public static void main(String[] args) {
		ObjectDemo objectDemo=new ObjectDemo();
		
		objectDemo.id=456;
		objectDemo.job="MANI";
		objectDemo.print();
	}
 
}
