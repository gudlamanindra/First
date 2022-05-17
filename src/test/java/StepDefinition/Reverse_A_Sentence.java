package StepDefinition;

public class Reverse_A_Sentence {

	public static void main(String[] args) {
    String s[]="upper case to lower case".split("");
    String answer="";
    for(int i=s.length-1;i>=0;i--) {
    answer=answer+s[i]+"";	
    }
    System.out.println("Reversed String:"+answer);
	}

}


