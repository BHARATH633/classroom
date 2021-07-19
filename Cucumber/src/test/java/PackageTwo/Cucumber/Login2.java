package PackageTwo.Cucumber;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Login2 {

	
	public class StepGenerator1 {
		public static WebDriver driver;
	
		@Given("^User already login$")
		public void loginapp() {
		
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/index.php");
		}
		@When("^User enter username as ([^\"]*)$")
		public void un(String UN)
		{
		driver.findElement(By.name("username")).sendKeys(UN);
		}
		@When("^User enter password as ([^\"]*)$")
		public void pwd(String PWD)
		{
		driver.findElement(By.name("password")).sendKeys(PWD);
		driver.findElement(By.name("login")).click();
		}
		@Then("^Home$")
		public void Home()
		{
		driver.close();
		}
	}
