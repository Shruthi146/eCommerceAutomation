package StepDefinitions;

import com.qa.factory.DriverFactory;

import Actions.LoginPage;
import Actions.ObjectRepository;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDefinitions {
	
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	
	@Given("Launch browser")
	public void launch_browser() {
		System.out.println("Browser launched");
	}

	@When("Navigate to url {string}")
	public void navigate_to_url(String url) {
	    DriverFactory.getDriver().get(url);
	    
	}

	@Then("Verify that home page is visible successfully")
	public void verify_that_home_page_is_visible_successfully() {
		loginPage.isHomePageVisible();
	}
	
	@When("Click on Signup Or Login button")
	public void click_on_signup_or_login_button() {
		loginPage.clickOnSignup();
	}

	@Then("Verify Login to your account is visible")
	public void verify_login_to_your_account_is_visible() {
		loginPage.isLoginToYourAccountVisible();
	}

	@Then("Enter correct email address {string} and password {string}")
	public void enter_correct_email_address_and_password(String email, String pwd) {
		loginPage.enterUserNameAndPassword(email, pwd);
	}

	@Then("Click login button")
	public void click_login_button() {
		loginPage.clickOnLogin();
	}

	@Then("Verify that Logged in as username is visible")
	public void verify_that_logged_in_as_username_is_visible() {
		loginPage.isLoggedInUsernameVisible();
	}
	
	@Then("Click Delete Account button")
	public void click_delete_account_button() {
		loginPage.clickOnDeleteAccount();
	}

	@Then("Verify that ACCOUNT DELETED! is visible")
	public void verify_that_account_deleted_is_visible() {
		loginPage.isAccountDeletedVisible();
	}
	

	@Then("Enter incorrect email address {string} and password {string}")
	public void enter_incorrect_email_address_and_password(String email, String pwd) {
		loginPage.enterUserNameAndPassword(email, pwd);
	}
	
	@Then("Verify error Your email or password is incorrect! is visible")
	public void verify_error_your_email_or_password_is_incorrect_is_visible() {
		loginPage.isIncorrectEmailPwdVisible();
	}
	
	@Then("Click Logout button")
	public void click_logout_button() {
		loginPage.clickOnLogout();
	}

	@Then("Verify that user is navigated to login page")
	public void verify_that_user_is_navigated_to_login_page() {
		loginPage.isLoginToYourAccountVisible();
	}
	
	@Then("Verify New User Signup! is visible")
	public void verify_new_user_signup_is_visible() {
	    
	}

	@Then("Enter name {string} and already registered email address {string}")
	public void enter_name_and_already_registered_email_address(String string, String string2) {
	    
	}

	@Then("Click Signup button")
	public void click_signup_button() {
	    
	}

	@Then("Verify error Email Address already exist! is visible")
	public void verify_error_email_address_already_exist_is_visible() {
	    
	}

}
