package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {


	@Given("user is on register page")
	public void user_is_on_register_page() {
		System.out.println("user is on sart page");
	}
	@When("click on reg button")      
	public void click_on_reg_button() {
	    System.out.println("user will click on reg button");
	}

	@And("user have to reg with details")
	public void user_have_to_reg_with_details() {
	   System.out.println("User have to fill the details");
	}

	@Then("user is logged in")
	public void user_is_logged_in() {
	    System.out.println("user have to click on login button to get logged in");
	}
	
}
