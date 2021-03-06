package org.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Contact_Page {
	WebDriver driver;
	@Given("Launcing the Pedasys Contact Page")
	public void launcing_the_Pedasys_Contact_Page() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://www.growthengineering.co.uk/contact/");
	    driver.manage().window().maximize();
	}

	@When("give input data in {string},{string},{string},{string},{string},{string}")
	public void give_input_data_in(String First_name, String Last_name, String Work_email, String Telephone, String company_name, String country) {
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		WebElement first_name = driver.findElement(By.name("firstname"));
	    first_name.sendKeys(First_name);
	    
	    WebElement last_name =driver.findElement(By.name("lastname"));
	    last_name.sendKeys(Last_name);
	    
	    WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
	    email.sendKeys(Work_email);
	    
	    WebElement phone= driver.findElement(By.xpath("//input[@type='tel']"));
	    phone.sendKeys(Telephone);
	    
	    WebElement comp =driver.findElement(By.xpath("(//input[@type='text'])[3]"));
	    comp.sendKeys(company_name);
	
	    WebElement countrry =driver.findElement(By.name("country_"));
	    countrry.sendKeys(country);
	}

	@When("Select any one value from Audience Field")
	public void select_any_one_value_from_Audience_Field() {
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	    WebElement Audience=driver.findElement(By.xpath("//label[@for='how_big_is_your_audience_20180-63c6168e-e30a-4c79-ab68-77cedae08dfe']"));
	    Audience.click();
	}

	@When("Select any one option from  Best Decribe your Role")
	public void select_any_one_option_from_Best_Decribe_your_Role() {
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		WebElement Role = driver.findElement(By.xpath("//select[@name='role_description']"));
	    Select s = new Select(Role);
	    s.selectByValue("CEO or Managing Director");
	    
	}

	@When("Select any one option from Purpose of your Enquiry")
	public void select_any_one_option_from_Purpose_of_your_Enquiry() {
	    WebElement Purpose = driver.findElement(By.xpath("//select[@name='what_is_the_purpose_of_your_enquiry_']"));
	    Select s1 = new Select(Purpose);
	    s1.selectByVisibleText("To find out how Growth Engineering can help me");
	}

	@When("Check the Privacy Policy and click submit buton")
	public void check_the_Privacy_Policy_and_click_submit_buton() {
	    WebElement checkbox =driver.findElement(By.xpath("//input[@type='checkbox']"));
	    checkbox.click();
	}

	@Then("Close the Browser")
	public void close_the_Browser() {
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	    driver.quit();
	}



}
