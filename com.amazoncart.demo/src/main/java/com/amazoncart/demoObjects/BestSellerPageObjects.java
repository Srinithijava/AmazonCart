package com.amazoncart.demoObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BestSellerPageObjects {

	public static WebDriver driver;
	
	public BestSellerPageObjects(WebDriver driver)
	{
		driver=this.driver;	
	}
	@FindBy(xpath="//div[text()='Amazon Best Sellers']")
	public WebElement Bestsellerpagetitle;
	
	@FindBy(xpath="//a[text()='Camera & Photo']")
	public WebElement cameraphotolink;
	
}
