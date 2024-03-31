package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="FeatureFiles",glue="Stepdefinitions",monochrome=true)
public class TestNgRunner extends AbstractTestNGCucumberTests {


	
}
