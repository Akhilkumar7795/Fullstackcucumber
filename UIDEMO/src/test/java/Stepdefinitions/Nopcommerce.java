package Stepdefinitions;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Nopcommerce {

	public WebDriver driver;
	
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
	   
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demo.nopcommerce.com/");
	}

	@When("the user searches for a laptop")
	public void the_user_searches_for_a_laptop() throws InterruptedException {
	    
		driver.findElement(By.xpath("//input[@id=\"small-searchterms\"]")).sendKeys("laptop");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}

	@Then("a list of laptops should be visible")
	public void a_list_of_laptops_should_be_visible() throws InterruptedException {
	driver.findElement(By.xpath("//a[contains(text(),'Asus N551JK-XO076H Laptop')]/following::button[contains(text(),'Add to cart')][1]")).click();
	}

	@Then("the user selects the first laptop from the list")
	public void the_user_selects_the_first_laptop_from_the_list() {
	   
	driver.findElement(By.xpath("//span[contains(text(),'Shopping cart')]")).click();
	driver.findElement(By.xpath("//input[@id=\"termsofservice\"]")).click();
	
	}

	@Then("places the order for purchase")
	public void places_the_order_for_purchase() {
		driver.findElement(By.xpath("//button[contains(text(),' Checkout ')]")).click();
	}
}
