package com.exam;

public class Exam {
	static public int id = 456;
	static public  int practiceHrs = 9;
	static public void hello(){
		int id = 91456;
		int salary = 250000;
		System.out.println(id);
		System.out.println(salary);
		
		System.out.println(salary-id);
		
	}
	public void hello1(){
		
		System.out.println(id+practiceHrs);
	}
	public static void main(String[] args) {
		Exam exam = new Exam();
		Exam.hello();
		exam.hello1();
	}
}
