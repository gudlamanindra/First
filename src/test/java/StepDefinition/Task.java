package StepDefinition;
public class Task {
      public static void main(String[] args) {
	    String s4 = "Rs 12,200";
        float a =  Float.parseFloat(s4.replace(",", "").substring(3));
        System.out.println(a);
        String s6 = "$ 70.20";
        float b = Float.parseFloat(s6.substring(2)); 
        System.out.println("s4*dollarprice");
		System.out.println("s4=5222.178");
   		float sum = (float) (a+(b*74.39));
		System.out.println("total = Rs" +sum);
        }
}
