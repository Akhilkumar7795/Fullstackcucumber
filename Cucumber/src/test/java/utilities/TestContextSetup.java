package utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestContextSetup {

	public WebDriver driver;
	public String landingpageproductname;
	public PageObjectManager pageobjectmanager;
	public TestBase testBase;
	public GenericUtils genericUtils;
	
	public TestContextSetup() throws IOException {
		testBase = new TestBase();
		pageobjectmanager = new PageObjectManager(testBase.webDriverManager());
		genericUtils = new GenericUtils(testBase.webDriverManager());
	}
		
	
}
