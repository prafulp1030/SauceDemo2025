package stepDefinitions;

import org.openqa.selenium.By;

import BaseLayer.BaseClass;
import io.cucumber.java.en.When;

public class ProductSteps extends BaseClass {

	@When("user click on Sauce Labs Backpack product")
	public void userClickOnSauceLabsBackpackProduct() {

		driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();

	}
}
