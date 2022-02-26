package com.exam;
class Parent
{
	public void play(){
		System.out.println("PC: PLAY");
	}
	public void studies(){
		System.out.println("PC: STUDIES");
	}
	public void job(){
		System.out.println("PC: JOB");
	}
}
class Child extends Parent{
	@Override
	public void studies(){
		System.out.println("CC: I DONT STUDY");
	}
	public void practice(){
		System.out.println("CC: PRACTICE");
	}
	
}
public class OverridingDemo {

	public static void main(String[] args) {
//	  Parent parent=new Parent();
//	  parent.play();
//	  parent.studies();
//	  parent.job();
//		Child child= new Child();
//		child.play();
//		child.studies();
//		child.job();
//		child.practice();
		
	  Parent parent=new Child();
	  parent.play();
	  parent.studies();
	  parent.job();
	 

	}

}
