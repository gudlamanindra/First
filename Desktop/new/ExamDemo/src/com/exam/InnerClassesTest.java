package com.exam;
class Outer{
	public void demo1(){
		System.out.println("demo1");
	}
	static public void demo2(){
		System.out.println("demo2");
	}
	static class Inner{
		public void demo3(){
			System.out.println("demo3");
		}
		 public void demo4(){
			System.out.println("demo4");
		}
	}
}
public class InnerClassesTest {

	public static void main(String[] args) {
     Outer outer=new Outer();
     outer.demo1();
    
     Outer.demo2();
     Outer.Inner inner= new Outer.Inner();
     inner.demo3();
     inner.demo4();
	}

}
