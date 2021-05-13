package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"C:\\Users\\srima\\eclipse-workspace\\CuCumberTest"
				+ "\\src\\main\\java\\FeatureFiles\\login.feature"},
				
		glue=	{"stepdefinitions"}	,
				
		plugin= {"pretty"},
		
		monochrome=true
		
		)


public class RunnerTest {

}
