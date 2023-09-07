//package testcases_steps;
//
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.testng.Assert;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//
//public class Steps {
//
//	WebDriver driver;
//	@Given("User is on login page")
//	public void user_is_on_login_page() {
//
//		System.setProperty("WebDriver.Chrome.driver", "E:\\Selenium\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("https://classic.freecrm.com/index.html");
//		driver.manage().window().maximize();
//	}
//	
//	@Then("Validate login page Tital")
//	public void validate_login_page_tital() {
//		String tital =driver.getTitle();
//		System.out.println("Login Page Tital is :- "+tital);
//		Assert.assertEquals("Free CRM software for customer relationship management, sales, and support.", tital);
//		System.out.println("*******************************************************************************************************");
//	}
//	
//	// Example-2
//	@When("User enter user name {string} and password {string}")
//	public void user_enter_user_name_and_password(String username, String password) {
//		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
//		System.out.println("--------------------------------------------------------------------------------------------");
//	}
///*
// * Example -1
//	@When("User enter user name and password")
//	public void user_enter_user_name_and_password() {
//		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(Navnath);
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Navnath@123);
//	}
//*/
//	@Then("User click on login button")
//	public void user_click_on_login_button() {
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		
//		System.out.println("--------------------------------------------------------------------------");
//	}
//
//	@And ("User is now Home page and Validate page Tital")
//	public void user_is_now_home_page_and_validate_page_tital() {
//		String tital =driver.getTitle();
//		System.out.println("Home Page Tital is :- "+tital);
//		Assert.assertEquals("CRMPRO", tital);
//
//		System.out.println("-----------------------------------------------------------------------------");
//	}
//	
//	@Then("user move to new contact page")
//	public void user_move_to_new_contact_page() throws InterruptedException {
//	   
//		Thread.sleep(5000);
//		driver.switchTo().frame("mainpanel");
//		WebElement ele = driver.findElement(By.xpath("//a[@title='Contacts']"));
//		
//		Actions act = new Actions(driver);
//		act.moveToElement(ele).build().perform();
//		driver.findElement(By.xpath("//a[@title='New Contact']")).click();
//		
//		
//	}
//
//	@Then("User Enter {string} and {string} and {string}")
//	public void user_enter_and_and(String FirstName, String LastName, String Position) throws InterruptedException {
//	   
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(FirstName);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='surname']")).sendKeys(LastName);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='company_position']")).sendKeys(Position);
//		driver.findElement(By.xpath("//input[@value='Save']")).click();
//		
//		
//	}
//	@Then("Close the browser")
//	public void close_the_browser() {
//	  driver.quit();
//	}
//
//}
