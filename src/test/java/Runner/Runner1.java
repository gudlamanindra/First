package Runner;

import org.junit.runner.RunWith;


import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\91756\\Desktop\\new\\CucumberJava\\src\\test\\resources\\Features\\login.feature"},
      glue= {"classpath:StepDefinition"},monochrome=true,tags="@Step")
public class Runner1 
{
	
}