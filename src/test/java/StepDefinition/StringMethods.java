package StepDefinition;

public class StringMethods{

public static void main(String[] args) throws InterruptedException{
	String s1="jaka";
		if(s1.contains("ak")) {
        	System.out.println("True");
        }
        else {
        	System.out.println("False");
        }
		System.out.println(s1);

      
        if(s1.equals("jaka")){
			 System.out.println("True");
		}
		else{
			System.out.println("False");
		}
		
		if(s1.equalsIgnoreCase("Jaka")){
			System.out.println("True");
		}
		else{
		    System.out.println("False");
		}
		

	    Thread.sleep(5000);
	}   
}
