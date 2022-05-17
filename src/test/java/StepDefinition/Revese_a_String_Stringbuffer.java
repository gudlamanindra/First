package StepDefinition;

public class Revese_a_String_Stringbuffer{

	public static void main(String[] args) {
		 String s1 = "Geeks for Geeks";
		 
	        StringBuilder s = new StringBuilder();
	 
	        // append a string into StringBuilder s
	        s.append(s1);
	 
	        // reverse StringBuilder s
	        s.reverse();
	 
	        // print reversed String
	        System.out.println(s);
	}

}
