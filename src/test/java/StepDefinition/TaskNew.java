package StepDefinition;
public class TaskNew {
	public static void main(String[] args) {
		String s4 = "QWERTY";
		s4= s4.split("R")[1].replace("T","K");
        System.out.println(s4);
        if(s4.equals("KY")) {
        	System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        if(s4.equalsIgnoreCase("ky")) {
        	System.out.println("True");
        }
        else{
        System.out.println("False");	
        }
        if(s4.contains("Y")){
        	System.out.println("True");
        }
        else {
        	System.out.println("False");
        }
         String s5="S32";
        int s3=Integer.parseInt(s5.replace("S", ""));
        System.out.println(s3);
//		char c=s4.charAt(3);
//		System.out.println(c);
//		if(s4.equals("QWERTY")){
//			 System.out.println("True");
//		}
//		else{
//			System.out.println("False");
//		}
//		if(s4.equalsIgnoreCase("qwerTy")){
//			System.out.println("True");
//		}
//		else{
//		    System.out.println("False");
//		}
//		char c1 = s4.charAt(4);
//		System.out.println(c1);
//		int size=s4.length();
//		System.out.println(size);
        }
}
