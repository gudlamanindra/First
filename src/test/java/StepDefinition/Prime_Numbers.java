package StepDefinition;

public class Prime_Numbers {

	public static void main(String[] args) {
      int x=5;
      int count=0;
      if(x>1) {
    	  for(int i=1;i<=x;i++) {
    		  if(x%i==0) {
    			  count++;
    		  }
    	  }
    	 if(count==2) {
    		 System.out.println("Its prime number");
    	 }
      else {
    	  System.out.println("Its not prime number");
      }
      
      }

	}
}
