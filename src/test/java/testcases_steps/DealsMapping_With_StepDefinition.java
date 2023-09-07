//package testcases_steps;
//
//import java.util.List;
//import java.util.Map;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.testng.Assert;
//
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class DealsMapping_With_StepDefinition {
//
//	WebDriver driver;
//
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
//	@When("User enter user name and password")
//	public void user_enter_user_name_and_password(DataTable credentials) throws InterruptedException {
//
//		for (Map<String, String>  data : credentials.asMaps (String.class , String.class ))
//		{
//			driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(data.get("username")); 
//			Thread.sleep(2000);// for lookupp direct index inperticuper feature line 
//			driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys(data.get("password")); 
//		}
//
//	}
//
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
//
//
//	@Then("user move to new deal page")
//	public void user_move_to_new_deal_page() throws InterruptedException {
//
//		Thread.sleep(5000);
//		driver.switchTo().frame("mainpanel");
//		WebElement ele = driver.findElement(By.xpath("//a[@title='Deals']"));
//
//		Actions act = new Actions(driver);
//		act.moveToElement(ele).build().perform();
//		driver.findElement(By.xpath("//a[@title='New Deal']")).click();
//
//
//
//	}
//	@Then("User enter new deal details")
//	public void user_enter_new_deal_details(DataTable dataTable) {
//		
//		for (Map<String, String>  data : dataTable.asMaps (String.class , String.class ))
//		{
//			driver.findElement(By.xpath("//input[@id='title']")).sendKeys(data.get("tital")); 	// Tital
//			driver.findElement(By.xpath("//input[@id='amount']")).sendKeys(data.get("amount")); 	//Amount
//			driver.findElement(By.xpath("//input[@id='probability']")).sendKeys(data.get("probability"));  //Probability %
//			driver.findElement(By.xpath("//input[@id='commission']")).sendKeys(data.get("commission")); //commission %
//		}
//			
//			//driver.findElement(By.xpath("//input[@type='password']")).sendKeys(data.get("password"));
//		
//		
//	}
//
//	@Then("Close the browser")
//	public void close_the_browser() {
//		driver.quit();
//	}
//
//
//
//
//
//}
