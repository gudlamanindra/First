package StepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListTotal {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91756\\Desktop\\new\\CucumberJava\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   
		   System.out.println("user enter the url");
		   driver.get("https://www.moneycontrol.com/");
		   Thread.sleep(5000);
	    List<WebElement> l = driver.findElements(By.xpath("((//table[@class='rhsglTbl'])[3]/thead/following-sibling::tbody/tr/td)[2]/b")); 
		    System.out.println(l.size());
		    double x=1; 
			  for(int i=0;i<l.size();i++)
			  { 
			JavascriptExecutor js =(JavascriptExecutor) driver;
			  js.executeScript("arguments[0].scrollIntoView();", l.get(i+1)); 
			  String text=l.get(i+1).getText(); 
			  double num = Double.parseDouble(text);
			  System.out.println(num); 
			  x=x+1;
			 } 
		    System.out.println(x);
		   
	}

}
