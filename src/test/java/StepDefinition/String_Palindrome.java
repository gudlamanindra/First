 
package StepDefinition;

public class String_Palindrome {
        public static void main(String[] args) {
        String s="sweety not durga";
        String y="";
        for(int i=s.length()-1;i>=0;i--) {
        	y=y+s.charAt(i);
        }
        System.out.println(y);
        if(y.equalsIgnoreCase(s)) {
        	System.out.println("Given String is a palindrome");
        }
        else
        {
        	System.out.println("Given String is not a palindrome");
        }
	} 

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
