package com.exam;
abstract interface HumanLife{
	String name="HumanLife";
	void family();//public and abstract
	void born();
	void studies();
	void job();
	
}
abstract class HumanLifeImp1 implements HumanLife{

	@Override
	public void family() {
		System.out.println("FAMILY");
	}

	@Override
	public void born() {
		System.out.println("BORN");
	}

	@Override
	public void studies() {
		System.out.println("STUDIES");
	}

	@Override
	public void job() {
		System.out.println("JOB=SALARY");
	}
	
}
class HumanLifeImpOne extends HumanLifeImp1{

	
	@Override
	public void job() {
		System.out.println("JOB");
	}
	public void practice(){
		System.out.println("PRACTICE=JOB");
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		HumanLifeImpOne humanLifeImpOne=new HumanLifeImpOne();
		humanLifeImpOne.born();
		humanLifeImpOne.family();
		humanLifeImpOne.job();
		humanLifeImpOne.practice();
		humanLifeImpOne.studies();
		
	}

}
