package StepDefinition;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch {

	WebDriver driver = null;

	@Given("Browser is open")
	public void browser_is_open() {
		System.out.println("inside step - Browser is open");
		System.setProperty("webdriver.chrome.driver", "F:\\Software\\New\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://google.com");
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("inside step - user is on google search page");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Liverpool");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys(Keys.ENTER);

	}

	@When("user enter a text in search box")
	public void user_enter_a_text_in_search_box() {
		System.out.println("inside step - User enters a text in search-box");
	}

	@And("hits Enter")
	public void hits_enter() {
		System.out.println("inside step - user hits Enter");
	}

	@Then("User is navigated to search results")
	public void user_is_navigated_to_search_results() {
		System.out.println("inside step - user got the vaild search result");
	}

}
