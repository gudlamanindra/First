package StepDefinition;
public class Task {
      public static void main(String[] args) {
	    String s = "UdayKumar Abbanapuri";
	    
	    String[] s1 = s.split(" ");
	    String s2 = s1[0];
	    //char c = s2.charAt(2);
	    System.out.println(s2.charAt(2));
	    System.out.println(s1[1]);
	    
	    
	    
	    //contains
	    if(s.contains("Ud")){
	    	System.out.println("true");
	    }else {
	    	System.out.println("false");
	    }
	    // charAt
        // s3=s.charAt(0);
        //System.out.println(s3);
        }
}
