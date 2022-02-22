package frame2;

import org.testng.annotations.Test;

import frame1.BaseTest;

public class FbTest extends BaseTest {
	@Test
    public void fbTest(){
	getDriver().get("https://www.facebook.com");
}
}