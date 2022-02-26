package com.exam;
class PojoTest1{
	private int practiceHrs = 9;
	private String name = "JOB";
	public int getpracticeHrs(){
		return practiceHrs;
	}
	public String getName(){
		return name;
	}
	public void setpracticeHrs(int practiceHrs){
		this.practiceHrs=practiceHrs;
	}
public void setName(String name){
	this.name=name;
	}
}
public class PojoDemo1 {

	public static void main(String[] args) {
		PojoTest1 pojoTest1 = new PojoTest1();
	    pojoTest1.setpracticeHrs(9);
	    pojoTest1.setName("Manindra");
	    
        System.out.println(pojoTest1.getpracticeHrs());
        System.out.println(pojoTest1.getName());
        
        
        int practiceHrs = pojoTest1.getpracticeHrs();
        String name = pojoTest1.getName();
        System.out.println(practiceHrs+"**"+name);

	}

}
