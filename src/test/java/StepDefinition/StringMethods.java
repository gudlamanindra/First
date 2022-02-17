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
//		s1=s1.replace("k","v");
//		System.out.println(s1);
//        int size = s1.length();
//        System.out.println(size);
//        s1 = s1.toUpperCase();
//        System.out.println(s1);
//        s1 = s1.toLowerCase();
//        System.out.println(s1);
      
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
		
//		if(s1.contains("av")){
//			System.out.println("true");
//		}
//		else{
//		    System.out.println("False");
//		}
        
//		char c = s1.charAt(2);
//		System.out.println(c);
//		
//	    
	    Thread.sleep(5000);
	}   
}
