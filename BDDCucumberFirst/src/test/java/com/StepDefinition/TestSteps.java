package com.StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSteps {
	WebDriver driver;
	@Given("User should Open Chrome Browser")
	public void user_should_open_chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
	 
	    
	    System.setProperty("webdriver.chrome.driver","./ChromeDriverJars/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@When("User should Enter Url in Browser")
	public void user_should_enter_url_in_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    
	    driver.get("https://auth.hollandandbarrett.com/u/login");
		driver.manage().window().maximize();
	    
	}

	@When("User Should Navigate Home Page")
	public void user_should_navigate_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	    System.out.println("Browser of the Title: " + driver.getTitle());
	}

	@When("Enter UserName and Password in Edit Box")
	public void enter_user_name_and_password_in_edit_box() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   
	    driver.findElement(By.id("username")).sendKeys("raghu.astepahead@gmail.com");
		driver.findElement(By.id("password")).sendKeys("raghuBN@123");
		Thread.sleep(1000);
	    
	}

	@When("Click On Login PushButton")
	public void click_on_login_push_button() {
	    // Write code here that turns the phrase above into concrete actions
	   
	    driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
	    driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
	    
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_login_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    
	    System.out.println("Browser of the Title: " + driver.getTitle());
	}

	@Then("User Should Navigate to Dashboard")
	public void user_should_navigate_to_dashboard() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("User Should Logout Holland and Barrett Application")
	public void user_should_logout_holland_and_barrett_application() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//div[@class='MyHB-module_title__pWUQ0']")).click();
		driver.findElement(By.xpath("//button[@class='jsx-2504483895 secondary size-m with-icon']//*[name()='svg']")).click();
	}

	@Then("Message displayed Logout Successfully")
	public void message_displayed_logout_successfully() {
	    // Write code here that turns the phrase above into concrete actions
		
	   
	    driver.quit();
	}




}
