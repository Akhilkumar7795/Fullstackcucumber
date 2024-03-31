package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase {

	public WebDriver driver;
	
	public WebDriver webDriverManager() throws IOException {
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url =prop.getProperty("QAurl");
		String browser_properties = prop.getProperty("browser");
		String browser_maven=System.getProperty("browser");
		
		String browser = browser_maven!=null ? browser_maven : browser_properties;
		if(driver==null) {
			if(prop.getProperty("browser")=="chrome") {
		//ChromeOptions options = new ChromeOptions();
        //options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		//driver = new ChromeDriver(options);
		driver = new ChromeDriver();
		//driver.get("https://rahulshettyacademy.com/seleniumPractise/"); 
			}
			else if(prop.getProperty("browser")=="firefox") {
				//firefox code
			}
		driver.get(url);
	}

		return driver;
		}}
