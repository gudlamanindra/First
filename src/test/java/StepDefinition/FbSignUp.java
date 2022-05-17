package StepDefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class FbSignUp {
       public static void main(String[] args) throws InterruptedException {
    	   	System.setProperty("webdriver.chrome.driver", "C:\\Users\\91756\\Desktop\\git file\\First\\chromedriver.exe");
		   	WebDriver driver=new ChromeDriver();
		   	driver.manage().window().maximize();
		   	System.out.println("user enter the url");
		   	driver.get("https://www.facebook.com"); 
		   	Actions a = new Actions(driver);
		   	a.click(driver.findElement(By.xpath("(//a[@role='button'])[2]"))).build().perform();
		    Thread.sleep(5000);
		    a.sendKeys(driver.findElement(By.xpath("(//input[@type='text'])[2]")), "Manindra").build().perform();
		    Thread.sleep(5000);
		    a.sendKeys(driver.findElement(By.xpath("(//input[@type='text'])[3]")), "Gudla").build().perform();
		    Thread.sleep(5000);
		    a.sendKeys(driver.findElement(By.xpath("(//input[@type='text'])[4]")), "7569296364").build().perform();
		    Thread.sleep(5000);
		    a.sendKeys(driver.findElement(By.xpath("(//input[@type='password'])[2]")), "7569296364").build().perform();
		    Thread.sleep(5000);
		    Select s = new Select(driver.findElement(By.xpath("//select[@id='day']")));
		    s.selectByValue("20");
		    Select s1 = new Select(driver.findElement(By.xpath("//select[@id='month']")));
		    s1.selectByIndex(6);
		    Select s2 = new Select(driver.findElement(By.xpath("//select[@id='year']")));
		    s2.selectByVisibleText("1995");
		    a.click(driver.findElement(By.xpath("(//input[@type='radio'])[2]"))).build().perform();
		    Thread.sleep(5000);
		    a.click(driver.findElement(By.xpath("(//button[@type='submit'])[2]"))).build().perform();
		    Thread.sleep(5000);
       }
}




