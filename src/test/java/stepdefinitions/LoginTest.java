package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginTest {

	@Given("User is Navigate to the {string} and click on LoginButton")
	public void user_is_navigate_to_the_and_click_on_login_button(String string) {
	    
		System.out.println("User entered into qaclickacademy website");
	}

	@Then("User Have to Enter {string} and {string}")
	public void use_have_to_enter_and(String username, String Password) {
	    
		System.out.println("User entered multiple set login details");
	}

	@And("User Have to Click on Forgotpassword button")
	public void user_have_to_click_on_forgotpassword_button() {
	    
		System.out.println("user clcickon forgotpassword link");
	}

	@Then("User Have to Enter Recover Mial ID")
	public void user_have_to_enter_recover_mial_id() {
	    
		System.out.println("user enetered recovery mailid");
	}

	@And("close Browser")
	public void close_browser() {
	    System.out.println("user close browser");
	}

	
}
