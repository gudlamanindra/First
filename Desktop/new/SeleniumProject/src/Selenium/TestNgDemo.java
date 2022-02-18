package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNgDemo {
	WebDriver driver;
	@BeforeSuite
    public void openBrowser() {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\91756\\Desktop\\new\\SeleniumProject\\chromedriver.exe");
        //ChromeDriver chromeDriver=new ChromeDriver();
        //RemoteWebDriver driver=new ChromeDriver();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }
	@Test
    public void gmailLoginTestCase() throws InterruptedException {
    	 driver.get("https://www.gmail.com");
         //1.identify the username element
         WebElement un=driver.findElement(By.id("identifierId"));
         //2.perform the action
         un.clear();
         un.sendKeys("gudlamanindra@gmail.com");
         Thread.sleep(9000);
         driver.findElement(By.id("identifierNext")).click();
         Thread.sleep(9000);
    }
	@AfterSuite
    public void closeBrowser() {
    	driver.close();
    }

}
