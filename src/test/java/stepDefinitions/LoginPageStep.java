package stepDefinitions;

import BaseLayer.BaseClass;
import io.cucumber.java.en.Given;
import pageLayer.LoginPage;

public class LoginPageStep extends BaseClass {
	private static LoginPage loginPage;

	@Given("user is on login Page")
	public void userIsOnLoginPage() {
		BaseClass.initialization();
	}

	@Given("user enter username and password")
	public void userEnterUsernameAndPassword() {
		loginPage = new LoginPage();
		loginPage.enterUsernameAndPassword("standard_user", "secret_sauce");
	}

	@Given("user click on login button")
	public void userClickOnLoginButton() {
		loginPage.clickOnLoginButton();
	}
}
