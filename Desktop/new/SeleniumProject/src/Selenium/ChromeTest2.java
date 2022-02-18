
package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeTest2 {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\91756\\Desktop\\new\\SeleniumProject\\chromedriver.exe");
	        //ChromeDriver chromeDriver=new ChromeDriver();
	        
	        RemoteWebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().deleteAllCookies();
	        driver.get("https://www.gmail.com");
	        //1.identify the username element
	        Thread.sleep(5000);
	       
	        WebElement userName=driver.findElement(By.id("identifierId"));
	        //2.perform the action
	        userName.clear();
	        userName.sendKeys("gudlamanindra@gmail.com");
	        //1..identify the password element
	        WebElement next=driver.findElement(By.id("identifierNext"));
	        //2.identify the action
            next.click();
	        Thread.sleep(5000);
	        driver.close();
		}	
	}
