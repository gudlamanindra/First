package StepDefinition;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class DateTime {
	public static void main(String[] args) throws IOException, InterruptedException {
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
			LocalDateTime now = LocalDateTime.now();
			System.out.println(dtf.format(now));
		   	WebDriver driver=new ChromeDriver();
		   	driver.get("https://www.flipkart.com/");
		   	Thread.sleep(10000);
		   	File c=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   	File copy=new File("C:\\Users\\91756\\Desktop\\new\\CucumberJava\\Scr");
		   	FileUtils.copyFile(c,copy);
		   	
	}
}
	