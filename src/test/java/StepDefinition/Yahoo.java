package StepDefinition;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Yahoo {
        public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91756\\Desktop\\new\\CucumberJava\\chromedriver.exe");
	   	WebDriver driver=new ChromeDriver();
	   	driver.manage().window().maximize();
	   	System.out.println("user enter the url");
	   	System.out.println("na");
	   	driver.get("https://www.yahoo.com/"); 
	   	Thread.sleep(5000);
	   	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mani");
	   	Thread.sleep(5000);
	   	List<WebElement> l = driver.findElements(By.xpath("//ul[@class='sa-tray-list-container']//li")); 
	    System.out.println(l.size());
	    for(int i=1;i<=l.size();i++) {
			  String text= l.get(i).getText(); 
			  System.out.println(text);
			  if(text.equals("manipal hospital bangalore")){
				  l.get(i).click();
				  break;
			  }
		      } 
		 Thread.sleep(5000);
		 driver.close();
	}
}
