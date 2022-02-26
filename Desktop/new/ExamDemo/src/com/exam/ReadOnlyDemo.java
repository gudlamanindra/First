package com.exam;
abstract class ReadDemo{
	static int id=45;
	static public void hello1(){
		System.out.println("hello1()");
	}
	static public int hello2(){
		System.out.println("hello2():"+id);
		return id;
	}
}
public class ReadOnlyDemo {

	public static void main(String[] args) {
		ReadDemo.hello1();
		ReadDemo.hello2();

	}

}
