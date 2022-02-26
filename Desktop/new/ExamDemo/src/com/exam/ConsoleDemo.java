package com.exam;

import java.util.Scanner;

public class ConsoleDemo {
int id;
String job;
public void demo(){
	System.out.println(id+"**"+job);
}
	public static void main(String[] args) {
		ConsoleDemo consoleDemo=new ConsoleDemo();
		System.out.println("ENTER ID");
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
consoleDemo.id=scanner.nextInt();
System.out.println("ENTER YOUR JOB");
consoleDemo.job=scanner.next();
consoleDemo.demo();
}

}
