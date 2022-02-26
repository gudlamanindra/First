package com.exam;
class PojoTest{
	private int practiceHrs = 9;
	private String name = "JOB";
	public int getpracticeHrs(){
		return practiceHrs;
	}
	public String getName(){
		return name;
	}
}
public class PojoDemo {
    public static void main(String[] args) {
		PojoTest pojoTest = new PojoTest();
        System.out.println(pojoTest.getpracticeHrs());
        System.out.println(pojoTest.getName());
        int practiceHrs = pojoTest.getpracticeHrs();
        String name = pojoTest.getName();
        System.out.println(practiceHrs+"**"+name);
	}
}
