package StepDefinition;

import java.util.ArrayList;

public class String_Array {

	public static void main(String[] args) {
String[] strArray = {"India" , "Usa" , "China"};
strArray[1]="Brazil";
for(String s : strArray) {
	System.out.println(s);
}
ArrayList<String> list = new ArrayList<String>();
list.add("India");
list.add("Usa");
list.add("Brazil");
list.add("Asia");
for(String s : list) {
	System.out.println(s);
}
	}
}





