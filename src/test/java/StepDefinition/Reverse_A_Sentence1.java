package StepDefinition;

public class Reverse_A_Sentence1 {

	public static void main(String[] args) {
String s[]="I Was Able To Code".split(" ");
String answer="";
for(String r:s) {
	StringBuilder sb=new StringBuilder(r);
	sb.reverse();
	answer=answer+sb.toString()+" ";
	}
System.out.println(answer);
	}
}














































































