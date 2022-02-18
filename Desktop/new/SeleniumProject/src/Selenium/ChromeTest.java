package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {

	    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\91756\\Desktop\\new\\SeleniumProject\\chromedriver.exe");
        //ChromeDriver chromeDriver=new ChromeDriver();
        //RemoteWebDriver driver=new ChromeDriver();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.gmail.com");
        String title=driver.getTitle();
        System.out.println("Title is"+title);
        String CurrentUrl=driver.getCurrentUrl();
        System.out.println(CurrentUrl);
        String WindowName=driver.getWindowHandle();
        System.out.println(WindowName);
        if(title.equalsIgnoreCase("GMAIL")) {
        	System.out.println("Title is matching");
        }
        else {
        	System.out.println("Title is not matching");
        }
        Thread.sleep(5000);
        driver.close();
	}

}
