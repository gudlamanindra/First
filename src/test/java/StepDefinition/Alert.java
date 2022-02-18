package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91756\\Desktop\\new\\CucumberJava\\chromedriver.exe");
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/webtables");
		Thread.sleep(5000);
		
		driver.findElement(By.id("addNewRecordButton")).click();
		Thread.sleep(5000);
		Actions a = new Actions(driver);
		a.sendKeys(driver.findElement(By.id("firstName")), "Manindra").build().perform();
		a.sendKeys(driver.findElement(By.id("lastName")), "Gudla").build().perform();
		a.sendKeys(driver.findElement(By.id("userEmail")), "gudlamanindra@gmail.com").build().perform();
		a.sendKeys(driver.findElement(By.id("age")), "26").build().perform();
		a.sendKeys(driver.findElement(By.id("salary")), "12000").build().perform();
		a.sendKeys(driver.findElement(By.id("department")), "work").build().perform();
		a.click(driver.findElement(By.id("submit"))).build().perform();
		Thread.sleep(10000);
		driver.close();
	}
}
