package com.amazoncart.demoObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BestSellerinCamerasPageObjects {

public static WebDriver driver;
	
	public BestSellerinCamerasPageObjects(WebDriver driver)
	{
		driver=this.driver;	
	}
	@FindBy(xpath="//h1[contains(text(),'Best Sellers in') and //span[contains(text(),'Camera & Photo')]]")
	public WebElement Bestsellerincameraphototitle;
	
	@FindBy(xpath="//h1[contains(text(),'Best Sellers in') and //span[contains(text(),'Digital Point & Shoot Cameras')]]")
	public WebElement digitalcamerapagetitle;
	
	@FindBy(xpath="//a[text()='Point & Shoot Digital Cameras']")
	public WebElement digitalcameralink;
}
