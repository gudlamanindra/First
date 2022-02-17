package StepDefinition;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class StepDefinition1 {
	WebDriver driver;
	@Given("^user launches the browser$")
	public void user_launches_the_browser() throws InterruptedException  {
	   System.out.println("Before");
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\91756\\Desktop\\new\\CucumberJava\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   }
	@When("^user enter the url$")
	public void user_enter_the_url() throws IOException, InterruptedException {
	    System.out.println("user enter the url");
	    driver.get("https://www.freejobalert.com"); 
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//a[@style='color:#fff;'])[1]")).click();
	    ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(tabs2.size()-1)); 
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("(//a[@title='MPSC'])[1]")).click();
	    ArrayList<String> tabs3 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs3.get(tabs3.size()-1)); 
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("(//a[@title=\"MPSC\"])[2]")).click();
	    ArrayList<String> tabs4 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs4.get(tabs4.size()-1)); 
	    Thread.sleep(5000);
	    driver.switchTo().window(tabs4.get(tabs4.size()-3)); 
	    Thread.sleep(5000);
	    driver.switchTo().window(tabs4.get(0)); 
	    Thread.sleep(5000);
	    driver.switchTo().window(tabs4.get(1)); 
	    Thread.sleep(5000);
	    driver.switchTo().window(tabs4.get(2)); 
	    Thread.sleep(5000);
	    driver.switchTo().window(tabs4.get(3)); 
	    Thread.sleep(5000);
	    driver.quit();
     }
    @When("^user enter the \"(.*)\" url$")
	public void user_enter_the_url(String user) throws IOException {
	    System.out.println("user enter the url");
	    driver.get(user); 
	}
	@And("^user enter the  password$")
	public void user_enter_the_password() {
	    System.out.println("user enter the password");
	}
    @Then("^user logs in into the application$")
	public void user_logs_in_into_the_application() {
	   System.out.println("user logs in into the application");
	}
}




