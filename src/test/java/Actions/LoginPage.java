package Actions;

import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;

	// 2. Constructor of the page class:
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean isHomePageVisible() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return driver.findElement(ObjectRepository.LoginPageElements.Homepage).isDisplayed();
		 
	}
	
	public void clickOnSignup() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(ObjectRepository.LoginPageElements.Signup).click();
	}
	
	public boolean isLoginToYourAccountVisible() {
		 return driver.findElement(ObjectRepository.LoginPageElements.LoginToYourAccount).isDisplayed();
	}
	
	public void enterUserNameAndPassword(String username, String pwd) {
		driver.findElement(ObjectRepository.LoginPageElements.EmailAddress).sendKeys(username);
		driver.findElement(ObjectRepository.LoginPageElements.Password).sendKeys(pwd);
	}

	public void clickOnLogin() {
		driver.findElement(ObjectRepository.LoginPageElements.Login).click();
	}
	
	public boolean isLoggedInUsernameVisible() {
		 return driver.findElement(ObjectRepository.LoginPageElements.LoggedInUsername).isDisplayed();
	}
	
	public void clickOnDeleteAccount() {
		driver.findElement(ObjectRepository.LoginPageElements.DeleteAccount).click();
	}
	
	public boolean isAccountDeletedVisible() {
		 return driver.findElement(ObjectRepository.LoginPageElements.AccountDeleted).isDisplayed();
	}
	
	public void clickOnLogout() {
		driver.findElement(ObjectRepository.LoginPageElements.Logout).click();
	}
	
	public boolean isIncorrectEmailPwdVisible() {
		 return driver.findElement(ObjectRepository.LoginPageElements.IncorrectEmailPwdText).isDisplayed();
	}

}
