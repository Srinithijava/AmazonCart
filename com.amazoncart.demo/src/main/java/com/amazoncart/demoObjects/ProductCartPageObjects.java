package com.amazoncart.demoObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductCartPageObjects {

public static WebDriver driver;
	
	public ProductCartPageObjects(WebDriver driver)
	{
		driver=this.driver;	
	}
	@FindBy(xpath="//h1[contains(text(),'Added to Cart')]")
	public WebElement addedtocartmessage;
	
	@FindBy(xpath="//div[contains(@id,'attachDisplayAddBaseAlert')]")
	public WebElement addedtocartmessage2;
	
	@FindBy(xpath="(//a[@role='button' and contains(text(),'Cart')])[1]")
	public WebElement CartButton;
	
	@FindBy(xpath="(//span[contains(@id,'view-cart')])[1]")
	public WebElement CartButton2;
	
	@FindBy(xpath="//span[@class=\"a-list-item\"]//a[contains(@class,'product-link')]")
	public WebElement Captureproducttitle;
	
	@FindBy(xpath="(//div[@data-name='Subtotals'])[2]")
	public WebElement CaptureSubtotal;
	
	@FindBy(xpath="((//div[@data-name='Subtotals'])[2]//span)[1]")
	public WebElement ItemCount;
	
	@FindBy(xpath="((//div[@data-name='Subtotals'])[2]//span)[2]")
	public WebElement Totalprice;
	
	
	
	
}