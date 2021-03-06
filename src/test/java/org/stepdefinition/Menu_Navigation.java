package org.stepdefinition;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Menu_Navigation {

	
	WebDriver driver;
	@Given("Launch the Homepage Url link of growthengineering")
	public void launch_the_Homepage_Url_link_of_growthengineering() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://www.growthengineering.co.uk/");
	    driver.manage().window().maximize();
	    
	}

	@When("Validate all Menu accessible in Our_Products Menu")
	public void validate_all_Menu_accessible_in_Our_Products_Menu() {
//	    Actions product = new Actions(driver);
//	    driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	    WebElement product_1 = driver.findElement(By.xpath("(//a[text()='Our Products'])[1]"));
//	    product.moveToElement(produ).perform();
	    product_1.click(); 
	    WebElement Knowledge_arcade = driver.findElement(By.xpath("(//a[text()='The Knowledge Arcade'])[1]"));
		Knowledge_arcade.click();	
		
		driver.get("https://www.growthengineering.co.uk/");
	    driver.manage().window().maximize();
	    WebElement product_2 = driver.findElement(By.xpath("(//a[text()='Our Products'])[1]"));
	    product_2.click();  
	    WebElement Authoring_Tool =driver.findElement(By.xpath("(//a[text()='Genie Authoring Tool'])[1]"));
	    Authoring_Tool.click();	
	    
	    driver.get("https://www.growthengineering.co.uk/");
	    driver.manage().window().maximize();
	    WebElement product_3 = driver.findElement(By.xpath("(//a[text()='Our Products'])[1]"));
	    product_3.click();
	    WebElement Academy = driver.findElement(By.xpath("(//a[text()='The Academy LMS'])[1]"));
	    Academy.click();
	}

	@When("Validate all Menu accessible in Our_Approach Menu")
	public void validate_all_Menu_accessible_in_Our_Approach_Menu() {
		driver.get("https://www.growthengineering.co.uk/");
	    driver.manage().window().maximize();
	    WebElement approach_1 = driver.findElement(By.xpath("(//a[text()='Our Approach'])[1]"));
	    approach_1.click();
	    WebElement Brain_Science=driver.findElement(By.xpath("(//a[text()='Brain Science'])[1]"));
        Brain_Science.click();
        
        driver.get("https://www.growthengineering.co.uk/");
	    driver.manage().window().maximize();
	    WebElement approach_2 = driver.findElement(By.xpath("(//a[text()='Our Approach'])[1]"));
	    approach_2.click();
	    WebElement Social_Learning=driver.findElement(By.xpath("(//a[text()='Social Learning'])[1]"));
	    Social_Learning.click();
	    
	    driver.get("https://www.growthengineering.co.uk/");
	    driver.manage().window().maximize();
	    WebElement approach_3 = driver.findElement(By.xpath("(//a[text()='Our Approach'])[1]"));
	    approach_3.click();
	    WebElement Gamification=driver.findElement(By.xpath("(//a[text()='Gamification'])[1]"));
	    Gamification.click();
	    
	    driver.get("https://www.growthengineering.co.uk/");
	    driver.manage().window().maximize();
	    WebElement approach_4 = driver.findElement(By.xpath("(//a[text()='Our Approach'])[1]"));
	    approach_4.click();
	    WebElement Personalisation=driver.findElement(By.xpath("(//a[text()='Personalisation'])[1]"));
	    Personalisation.click();
	}

	@When("Validate all Menu accessible in Resources")
	public void validate_all_Menu_accessible_in_Resources() {
		driver.get("https://www.growthengineering.co.uk/");
	    driver.manage().window().maximize();
	    WebElement Resource_1 =driver.findElement(By.xpath("(//a[text()='Resources'])[1]"));
	    Resource_1.click();
	    WebElement Downloads = driver.findElement(By.xpath("(//a[text()='Downloads'])[1]"));
	    Downloads.click();
	    
	    driver.get("https://www.growthengineering.co.uk/");
	    driver.manage().window().maximize();
	    WebElement Resource_2 =driver.findElement(By.xpath("(//a[text()='Resources'])[1]"));
	    Resource_2.click();
	    WebElement Blogs = driver.findElement(By.xpath("(//a[text()='Blog'])[1]"));
	    Blogs.click();
	    
	    driver.get("https://www.growthengineering.co.uk/");
	    driver.manage().window().maximize();
	    WebElement Resource_3 =driver.findElement(By.xpath("(//a[text()='Resources'])[1]"));
	    Resource_3.click();
	    WebElement Webinars = driver.findElement(By.xpath("(//a[text()='Webinars'])[1]"));
	    Webinars.click();
	    
	    driver.get("https://www.growthengineering.co.uk/");
	    driver.manage().window().maximize();
	    WebElement Resource_4 =driver.findElement(By.xpath("(//a[text()='Resources'])[1]"));
	    Resource_4.click();
	    WebElement Elearning = driver.findElement(By.xpath("(//a[text()='Free eLearning Content'])[1]"));
	    Elearning.click();
	    
	}

	@When("Validate all Menu accessible in About_Us")
	public void validate_all_Menu_accessible_in_About_Us() {
		driver.get("https://www.growthengineering.co.uk/");
	    driver.manage().window().maximize();
	    WebElement About_1 =driver.findElement(By.xpath("(//a[text()='About Us'])[1]"));
	    About_1.click();
	    WebElement Strory = driver.findElement(By.xpath("(//ul[@role='group'])[4]/li[1]"));
	    Strory.click();
	    
	    driver.get("https://www.growthengineering.co.uk/");
	    driver.manage().window().maximize();
	    WebElement About_2 =driver.findElement(By.xpath("(//a[text()='About Us'])[1]"));
	    About_2.click();
	    WebElement Clients= driver.findElement(By.xpath("(//ul[@role='group'])[4]/li[2]"));
	    Clients.click();
	    
	    driver.get("https://www.growthengineering.co.uk/");
	    driver.manage().window().maximize();
	    WebElement About_3 =driver.findElement(By.xpath("(//a[text()='About Us'])[1]"));
	    About_3.click();
	    WebElement Awards= driver.findElement(By.xpath("(//ul[@role='group'])[4]/li[3]"));
	    Awards.click();
	    
	    driver.get("https://www.growthengineering.co.uk/");
	    driver.manage().window().maximize();
	    WebElement About_4 =driver.findElement(By.xpath("(//a[text()='About Us'])[1]"));
	    About_4.click();
	    WebElement Partners =driver.findElement(By.xpath("(//ul[@role='group'])[4]/li[4]"));
	    Partners.click();
	    
	    driver.get("https://www.growthengineering.co.uk/");
	    driver.manage().window().maximize();
	    WebElement About_5 =driver.findElement(By.xpath("(//a[text()='About Us'])[1]"));
	    About_5.click();
	    WebElement GDRP= driver.findElement(By.xpath("(//ul[@role='group'])[4]/li[5]"));
	    GDRP.click();
	    
	    driver.get("https://www.growthengineering.co.uk/");
	    driver.manage().window().maximize();
	    WebElement About_6 =driver.findElement(By.xpath("(//a[text()='About Us'])[1]"));
	    About_6.click();
	    WebElement GetInTouch = driver.findElement(By.xpath("(//ul[@role='group'])[4]/li[6]"));
	    GetInTouch.click();
	    
	}

	@When("Click Get_in_Touch Menu")
	public void click_Get_in_Touch_Menu() {
		driver.get("https://www.growthengineering.co.uk/");
	    driver.manage().window().maximize();
	    WebElement Touch =driver.findElement(By.xpath("//*[text()='GET IN TOUCH']"));
	    Touch.click();
	    
	}

	@Then("close Browser")
	public void close_Browser() {
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.quit();
	    
	}

}
