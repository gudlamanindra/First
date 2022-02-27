package StepDefinition;
public class TaskNew {
	public static void main(String[] args) {
		String s4 = "QWERTY";
		s4= s4.split("R")[0].replace("W","K");
        System.out.println(s4);
        if(s4.equals("QKE")) {
        	System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        if(s4.equalsIgnoreCase("qke")) {
        	System.out.println("True");
        }
        else{
        System.out.println("False");	
        }
        if(s4.contains("K")){
        	System.out.println("True");
        }
        else {
        	System.out.println("False");
        }
        }
}
