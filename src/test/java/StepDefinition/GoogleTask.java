package StepDefinition;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
     public class GoogleTask {
       	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91756\\Desktop\\new\\CucumberJava\\chromedriver.exe");
	   	WebDriver driver=new ChromeDriver();
	   	driver.manage().window().maximize();
	   	System.out.println("user enter the url");
	   	
	   	driver.get("https://www.google.co.in/"); 	
	   	Thread.sleep(5000);
	   	driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("exam");
	   	Thread.sleep(5000);
	   	List<WebElement> l = driver.findElements(By.xpath("(//ul[@jsname='bw4e9b'])[1]/li")); 
	    System.out.println(l.size());
	    for(int i=1;i<=l.size();i++) {
		  String text=driver.findElement(By.xpath("(//ul[@jsname='bw4e9b'])[1]/li["+i+"]")).getText(); 
		  System.out.println(text);
		  //text=text.split("\n")[0];
		  if(text.equals("example")){
			  driver.findElement(By.xpath("(//ul[@jsname='bw4e9b'])[1]/li["+i+"]")).click();
			  break;
		  }
	    } 
	    driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[5]")).click();
       } 
     }
     

      
     
     
     
      
      
      
      