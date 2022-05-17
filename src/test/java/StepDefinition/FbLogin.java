package StepDefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class FbLogin {
     public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91756\\Desktop\\git file\\First\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   System.out.println("user enter the url");
		   driver.get("https://www.facebook.com"); 
		   System.out.println("fb");
		   Actions a = new Actions(driver);
		    
		a.sendKeys(driver.findElement(By.xpath("//input[@type='text']")), "gudlamanindra@gmail.com").build().perform();
			a.sendKeys(driver.findElement(By.xpath("//input[@type='password']")), "8712271635").build().perform();
	
		a.click(driver.findElement(By.xpath("//button[@value='1']"))).build().perform();
		    Thread.sleep(5000);
			a.click(driver.findElement(By.xpath("//a[@aria-label='Marketplace']"))).build().perform();
		Thread.sleep(5000);
			
			a.click(driver.findElement(By.xpath("(//div[@role='button'])[3]"))).build().perform();
			
		    Thread.sleep(10000);
		    
		a.click(driver.findElement(By.xpath("//div[@class='b20td4e0 muag1w35']/div[4]"))).build().perform();			
	}
}
