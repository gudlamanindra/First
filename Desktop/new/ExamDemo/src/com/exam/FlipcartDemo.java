
package com.exam;
class Fp_Men
{
	public void login(){
		System.out.println("LOGIN");
	}
	public void logout(){
		System.out.println("LOGout");
	}
	public void clothes(){
		System.out.println("clothes");
	}
	
}
class Fp_women extends  Fp_Men
{
	public void jewelleries(){
		System.out.println("jewelleries");
	}
}

class Fp_kids extends  Fp_Men
{
	public void toys(){
		System.out.println("toys");
	}
}
public class FlipcartDemo{

	public static void main(String[] args) {
		Fp_Men fp_Men = new Fp_Men();
		
		fp_Men.login();
		fp_Men.logout();
		fp_Men.clothes();
		
		//2.creating child class women
		//Fp_women fp_women = new Fp_women();
		
		//fp_women.login();
		//fp_women.logout();
		//fp_women.clothes();
		//fp_women.jewelleries();

		//3.creating child class object by using parent class reference
		//Fp_Men fp_Men2= new Fp_women();
		//fp_Men2.login();
		//fp_Men2.logout();
		//fp_Men2.clothes();		
	}

}
