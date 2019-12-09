package com.amazoncart.stepDefinitions;
import java.util.concurrent.TimeUnit;

import amazoncartpages.*;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amazoncart.demoObjects.AmazonHomePageObjects;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserStepDefinition {
	
	@Given("^user is on homepage$")
	public void user_on_homepage() throws Throwable
	{	
		HomePage.LaunchApplication();
		HomePage.navigatebestseller();
	}
	@When("^user navigates to bestseller page$")
	public void user_navigates_to_bestseller_page()
	{
		BestSellerPage.navigatetoCameraspg();
	}
	@When("^user selects camera and photo page$")
	public void user_selects_cameranphoto_page()
	{
		BestSellers_CameranPhotoPage.camerasPg();
	}
	
	@When("^user selects digital camera page followed by \"(.*)\" th product$")
	public void user_selects_digital_cameras(int product)
	{
		DigitalCamerasPage.digitalcameras(product);
	}
	
	@When("^user selects product quantity \"(.*)\"$")
	public void user_selects_product_quantity(int quantity) throws InterruptedException
	{
		ProductSelectionPage.prodSelection(quantity);
	}
	
	@Then("^cart displays selected product and sub-total$")
	public void validate_cart_product_and_subtotal() throws InterruptedException
	{
		CartPage.cartpagevalidation();
	}
	
}
