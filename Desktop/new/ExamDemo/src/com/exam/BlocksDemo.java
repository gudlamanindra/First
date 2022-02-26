package com.exam;
class BlocksDemo1{
	public BlocksDemo1(){
		System.out.println("PL:constructor");
	}
	static{
		System.out.println("static block1");
		System.out.println("instance block1");
		System.out.println("static block2");
		System.out.println("instance block2");
	}
	
}
class BlocksDemo2 extends BlocksDemo1{
	public BlocksDemo2(){
		System.out.println("CL:constructor");
	}
	static{
		System.out.println("CL:static block");
	    System.out.println("CL:instance block");
	}
}
public class BlocksDemo {

	public static void main(String[] args) {
@SuppressWarnings("unused")
BlocksDemo2 blocksDemo2=new BlocksDemo2();
	}

}
