package StepDefinition;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
  public class Amazon2 {
   public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91756\\Desktop\\new\\CucumberJava\\chromedriver.exe");
	   	WebDriver driver=new ChromeDriver();
	   	driver.manage().window().maximize();
	   	System.out.println("user enter the url");
	   	driver.get("https://www.amazon.com/"); 
	   	Thread.sleep(6000);
	   	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("lig");
     	Thread.sleep(5000);
	   	List<WebElement> l = driver.findElements(By.xpath("//div[@class='autocomplete-results-container']/div")); 
        System.out.println(l.size());
        for(int i=1;i<=l.size();i++) {
        	String text=driver.findElement(By.xpath("//div[@class='autocomplete-results-container']/div["+i+"]")).getText();
        	System.out.println(text);
        }
	Thread.sleep(5000);
	driver.close();
	}
}

  
  
  