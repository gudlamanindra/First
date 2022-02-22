package frame1;

import java.io.File;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import frame3.DriverPaths;

public class BaseTest {
   private static WebDriver driver;
	@Parameters({"browser"})
	@BeforeSuite
public void openBrowser(@Optional("chrome")String browser) {
	if(browser.equalsIgnoreCase("firefox")) {
		System.setProperty(DriverPaths.firefoxkey,DriverPaths.firefoxvalue);
		driver=new FirefoxDriver();
		init();
	}
	else if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty(DriverPaths.chromekey,DriverPaths.chromevalue);
		driver=new ChromeDriver();
		init();
	}
	else if(browser.equalsIgnoreCase("ie")) {
		System.setProperty(DriverPaths.iekey,DriverPaths.ievalue);
		driver=new InternetExplorerDriver();
		init();
	}
	else if(browser.equalsIgnoreCase("edge")) {
		System.setProperty(DriverPaths.edgekey,DriverPaths.edgevalue);
		driver=new EdgeDriver();
		init();
	}
	
}
public void init() {
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
}
@AfterSuite
public void closeBrowser() {
	if(driver!=null) {
		driver.close();
	}
	else {
		System.out.println("Driver is not pointing to null");
	}
}
@BeforeMethod
public void beforeTestCaseExecution(Method method) {
	String tcName=method.getName();
	System.out.println("Current TestCase execution is"+tcName);
}
@AfterMethod
public void afterTestCaseExecution(ITestResult result) {
	if(result.getStatus()==ITestResult.SUCCESS) {
		System.out.println("TC IS PASSED:" +result.getName());
	}
	else if(result.getStatus()==ITestResult.FAILURE) {
		System.out.println("TC IS FAILED:" +result.getName());
		
	}
	else if(result.getStatus()==ITestResult.SKIP) {
		System.out.println("TC IS SKIPPED:" +result.getName());
	}
	
}
public static WebDriver getDriver() {
	return driver;
	
}
}
