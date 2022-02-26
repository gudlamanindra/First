package com.exam;

public class Demo22 {
     public int addition(int a1,int a2)
     {
    	 int result=a1+a2;
    	 System.out.println("int int Result is:"+result);
    	 return result;
     }
     public float addition(float a1,float a2)
     {
    	 float result=a1+a2;
    	 System.out.println("float float Result is:"+result);
		 return result;
     }
     public double addition(double a1,double a2)
     {
    	 double result=a1+a2;
    	 System.out.println("double double Result is:"+result);
    	 return result;
     }
     public static void main(String[] args) 
     {
		Demo22 demo22=new Demo22();
		demo22.addition(25,35);
		demo22.addition(35.5f,35.5f);
		demo22.addition(22.3,22.5);
     }
}
