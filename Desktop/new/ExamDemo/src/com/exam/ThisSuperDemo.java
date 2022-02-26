package com.exam;
class Demo1{
	long id=45684665596l;
	public void hello(){
		System.out.println("JOB");
	}
	public Demo1(){
		super();
		System.out.println("parent class default constructor");
	}
}
class Demo1Test extends Demo1{
	public Demo1Test()
	{
		super();
	System.out.println("child class default constructor");
	}
	int id=456;
	public void job(){
		int id=91456;
		System.out.println(id);
		System.out.println(this.id);
		System.out.println(super.id);
		super.hello();
	}
}
public class ThisSuperDemo {
        public static void main(String[] args) {
		Demo1Test demo1Test=new Demo1Test();
		demo1Test.job();
	} 
}
