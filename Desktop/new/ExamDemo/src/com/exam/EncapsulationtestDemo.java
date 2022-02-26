package com.exam;
class EncapsulationTest
{
	public int id = 456;
	public String name = "MANINDRA";
	public void print()
	{
		System.out.println(id+"**"+name);
	}
}
public class EncapsulationtestDemo {

	public static void main(String[] args) {
		EncapsulationTest encapsulationTest = new EncapsulationTest();
		encapsulationTest.print();
		encapsulationTest.id=4356;
		encapsulationTest.name="GUDLA";
		encapsulationTest.print();

	}

}
