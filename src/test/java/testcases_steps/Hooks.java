package testcases_steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Hooks {
	
	WebDriver driver;
	@Before
	public void init()
	{
		System.out.println("all initialization is Done ");
	}
	
	@Given("user is on deal page")
	public void user_is_on_deal_page() {
	   System.out.println("user is on deal page");
	}

	@When("user fill the deal form")
	public void user_fill_the_deal_form() {
		 System.out.println("user fill the deal form");
	}

	@Then("deal is ceated")
	public void deal_is_ceated() {
		 System.out.println("deal is ceated");
	}

	@After
	public void tearDown()
	{
		System.out.println("browser is closed");
		
	}
}
