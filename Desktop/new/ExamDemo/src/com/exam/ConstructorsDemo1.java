package com.exam;
class ConstructorTest1{
	int id;
	String Job;
	public ConstructorTest1 (int id,String Job){
		this.id=id;
		this.Job=Job;
	}
	
//	public ConstructorTest1 (int id1,String Job1){
//		id=id1;
//		Job=Job1;
//	}
	public void print(){
		System.out.println(id+"**"+Job);
	}
}
public class ConstructorsDemo1 {

	public static void main(String[] args) {
		ConstructorTest1 constructorTest1=new ConstructorTest1(95,"mani");
constructorTest1.print();
ConstructorTest1 constructorTest2=new ConstructorTest1(75,"gudla");
constructorTest2.print();
ConstructorTest1 constructorTest3=new ConstructorTest1(65,"manindra");
constructorTest3.print();
	}

}
