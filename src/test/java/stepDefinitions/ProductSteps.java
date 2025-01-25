package stepDefinitions;

import org.openqa.selenium.By;

import BaseLayer.BaseClass;
import io.cucumber.java.en.When;

public class ProductSteps extends BaseClass {

	@When("user click on Sauce Labs Backpack product")
	public void userClickOnSauceLabsBackpackProduct() {

		driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();

	}

	@When("user click on Sauce Labs bike light product")
	public void userClickOnSauceLabsBikeLightProduct() {
		driver.findElement(By.name("add-to-cart-sauce-labs-bike-light")).click();

	}

	@When("user click on Sauce Labs t shirt product")
	public void userClickOnSauceLabsTShirtProduct() {
		driver.findElement(By.name("add-to-cart-sauce-labs-bolt-t-shirt")).click();
	}

}
