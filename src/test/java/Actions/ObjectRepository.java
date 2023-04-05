package Actions;

import org.openqa.selenium.By;

public class ObjectRepository {
	
	public static class LoginPageElements {
		
		public static By Homepage = By.xpath("//a[normalize-space()='Home']");
		public static By Signup = By.xpath("//a[normalize-space()='Signup / Login']");
		public static By LoginToYourAccount = By.xpath("//h2[normalize-space()='Login to your account']");
		public static By EmailAddress = By.xpath("//input[@data-qa='login-email']");
		public static By Password = By.xpath("//input[@placeholder='Password']");
		public static By Login = By.xpath("//button[normalize-space()='Login']");
		public static By LoggedInUsername = By.xpath("//li[10]//a[1]");
		public static By DeleteAccount = By.xpath("//a[normalize-space()='Delete Account']");
		public static By Logout = By.xpath("//a[normalize-space()='Logout']");
		public static By AccountDeleted = By.xpath("//b[normalize-space()='Account Deleted!']");
		public static By IncorrectEmailPwdText = By.xpath("//p[normalize-space()='Your email or password is incorrect!']");
		
	}

}
