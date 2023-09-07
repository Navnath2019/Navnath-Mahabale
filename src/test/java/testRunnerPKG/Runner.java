package testRunnerPKG;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@CucumberOptions(features=("C:\\Users\\nkmin\\eclipse-workspace\\Maven_BDD\\Feature"),
//@CucumberOptions(features=("Feature/login.feature"),
@CucumberOptions(features=("Feature/Hooks.feature"),
glue=("testcases_steps"), 
monochrome = true,
plugin = {"pretty", "html: target/cucumber.html","json: target/cucumber.json"} ,
dryRun=false)

//tags =  "@SmokeTest and  not @RegressionTest")
//tags = {"@SmokeTest"}

public class Runner extends AbstractTestNGCucumberTests{

	
	
	
	
	
	 
	
	
}
