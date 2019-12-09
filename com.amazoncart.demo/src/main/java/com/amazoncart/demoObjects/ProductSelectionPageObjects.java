package com.amazoncart.demoObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class ProductSelectionPageObjects {
int quantity;
	public static WebDriver driver;
	public ProductSelectionPageObjects(WebDriver driver) {
		this.driver=driver;
	}
	@FindBy(xpath="//div[@id='availability']")
	public WebElement checkavailabilitystock;
	
	@FindBy(xpath="(//span[@data-action='a-dropdown-button'])[1]")
	public WebElement dropdowncontainer;
	
	@FindBy(xpath="//div[contains(@class,'dropdown')]//ul[@role='listbox']//li")
	public List<WebElement> AvailableQuantity;
	
	@FindBy(xpath="//div[contains(@class,'dropdown')]//ul[@role='listbox']//li[8]")
	public WebElement dropdownqtyselect;
	
	@FindBy(xpath="//input[@title='Add to Shopping Cart']")
	public WebElement clickaddtocart;
	
	
	@FindBy(xpath="(//*[text()='Add to your order'])[2]")
	public WebElement Verifypopupbox;
	
	@FindBy(xpath="//h1[text()='Add to your order']")
	public WebElement verifypopupbox2;
	
	@FindBy(xpath="//button[contains(@id,'NoCoverage')]")
	public WebElement Selectnooptioncoverage;
	
	@FindBy(xpath="//button[contains(@id,'NoCoverage')]")
	public WebElement Selectnooptioncoverage2;
	
	@FindBy(xpath="//div[@id='hlb-subcart']//div[1]")
	public WebElement captureitemdetails;
	
}
