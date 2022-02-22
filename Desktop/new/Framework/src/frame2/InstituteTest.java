package frame2;

import org.testng.annotations.Test;

import frame1.BaseTest;

public class InstituteTest extends BaseTest {
	@Test
    public void instituteTest(){
	getDriver().get("https://www.rameshsoft.com");
}
}