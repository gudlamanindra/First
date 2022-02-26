
package com.exam;

public class SwitchDemo {
     public static void main(String[] args) {
		String browser= "firefox";
		switch(browser)
		{
		case "ie" : System.out.println("IE BROWSER");
		break;
		case "chrome" : System.out.println("CHROME BROWSER");
		break;
		
		case "edge" : System.out.println("EDGE BROWSER");
		break;
		case "firefox" : System.out.println("FIREFOX BROWSER");
		break;
		default: System.out.println("NO CASE IS MATCHED");
		break;
		}
		System.out.println("NS");
	}
}
 