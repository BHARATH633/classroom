package PackageTwo.Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login1 {
	
	
	public static WebDriver driver;
	@Given("^print username$")
	public void userInformation()
	{
		System.out.println("hey bharath");
	}
	@Given("^User present in Adactin Login page$")
	public void openlogin() {
	
	driver=new ChromeDriver();
	driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
	driver.manage().window().maximize();
	}
	@When("^User Enter Username$")
	public void Enterunpwd() {
	driver.findElement(By.id("username")).sendKeys("rameshadepu");
	}
	@And("^User Enter Password$")
	public void Enterpwd() {
	driver.findElement(By.id("password")).sendKeys("ramesh11");
	}
	@And("^User Click on Login Button$")
	public void clicklogin() {
	driver.findElement(By.id("login")).click();
	}
	@Then("^User navigate to login page$")
	public void Home() {
	driver.close();
	}

}
