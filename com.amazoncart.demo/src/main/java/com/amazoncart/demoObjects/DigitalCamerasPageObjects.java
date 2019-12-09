package com.amazoncart.demoObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DigitalCamerasPageObjects {
public static WebDriver driver;
	
	public DigitalCamerasPageObjects(WebDriver driver)
	{
		driver=this.driver;	
	}
	@FindBy(xpath="//h1[contains(text(),'Best Sellers in') and //span[contains(text(),'Digital Point & Shoot Cameras')]]")
	public WebElement digitalcamerapagetitle;
	
	@FindBy(xpath="//*[@id='zg-ordered-list']//li[5]//img")
	public WebElement select5thdigitalcamera;

	@FindBy(xpath="(//*[@id='zg-ordered-list']//li[5]//div)[4]")
	public WebElement digitalcameratitle;
	
	@FindBy(xpath="(//*[@id='zg-ordered-list']//li[5]//div)[6]")
	public WebElement digitalcameraprice;
}
