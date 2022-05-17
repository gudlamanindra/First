package StepDefinition;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Yahoo {
        public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91756\\Desktop\\git file\\First\\chromedriver.exe");
	   	WebDriver driver=new ChromeDriver();
	   	driver.manage().window().maximize();
	   	System.out.println("user enter the url");
	   	driver.get("https://www.yahoo.com/"); 
	   	Thread.sleep(5000);
	   	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("exam");
	   	Thread.sleep(5000);
	   	List<WebElement> l = driver.findElements(By.xpath("//ul[@class='sa-tray-list-container']//li")); 
	    System.out.println(l.size());
	    for(int i=1;i<l.size();i++) {
			  String text= l.get(i).getText(); 
			  System.out.println(text);
			  if(text.equals("exam form")) {
				  l.get(i).click();
				  break;
			  }
		      } 
	}
}







