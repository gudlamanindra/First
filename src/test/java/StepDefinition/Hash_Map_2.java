package StepDefinition;
import java.util.HashMap;
public class Hash_Map_2 {
public static void main(String[] args) {
HashMap<String,String> hello=new HashMap<String,String>();
hello.put("Rajesh123", "Rakesh234");
hello.put("Ramesh154","Lakshman564");
hello.put("sai123", "harsha125");
hello.remove("Ramesh154");
System.out.println(hello.containsKey("Rajesh123"));
System.out.println(hello.containsValue("Ramesh154"));
System.out.println(hello.replace("Rajesh123","Sahu156"));
System.out.println(hello.keySet());
System.out.println(hello.values());
System.out.println(hello);
  }
}