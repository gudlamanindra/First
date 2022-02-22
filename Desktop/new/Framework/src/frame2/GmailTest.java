package frame2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import frame1.BaseTest;

public class GmailTest extends BaseTest{
	@Test
    public void gmailTest(){
	getDriver().get("https://www.gmail.com");
	WebElement userName= getDriver().findElement(By.id("identifierId"));
	userName.clear();
	userName.sendKeys("gudlamanindra@gmail.com");
	WebElement next=getDriver().findElement(By.id("identifierNext"));
	next.click();
}
}
