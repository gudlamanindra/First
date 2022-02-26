package com.exam;
 class Start{
	public static int num1 =45;
	public static int num2 =47;
	public static int num3 =49;
	public static int num4=70;
	 
	
	static public int addition(){
		int result = num1+num2+num4;
		System.out.println("static result is : "+result);
		return result;
		
	}
	static public int addition1(){
		int result = num1+num2+num3;
		System.out.println("static result is : "+result);
		return  result;
	}
	
}
 class AdditionTo{
	 int num5=80;
	 int num6=90;
	 int num7=100;
	 public int addition2(){
		 int result = num5+num6;
			System.out.println("non_static result is : "+result);
			return  result;
	 }
	 public int addition3(){
		 int result = num5+num6+num7;
			System.out.println("non_static result is : "+result);
			return  result;
	 }
 }
public class AdditionDemo {
	static public int num1=456;
	static public int num2=496;
	static public int num3=457;
	public static void main(String[] args) {
		Start.addition();
		Start.addition1();
	AdditionTo additionTo=new AdditionTo();
	additionTo.addition2();
	additionTo.addition3();
	}

}
