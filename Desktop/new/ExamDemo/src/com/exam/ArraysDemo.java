
package com.exam;

public class ArraysDemo {

	public static void main(String[] args) {
      String str[]=new String[6];
	
      for(int i=0;i<str.length;i++){
    	  System.out.println(str[i]);
      }
      str[0]="S";
      str[1]="T";
      str[2]="U";
      str[3]="V";
      str[4]="W";
      str[5]="X";
      System.out.println(" **** ");
      for(int i=0;i<str.length;i++){
    	  System.out.println(str[i]);
      }
	}

}
