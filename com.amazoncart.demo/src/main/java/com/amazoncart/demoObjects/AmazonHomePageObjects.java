package com.amazoncart.demoObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonHomePageObjects {
	public static WebDriver driver;
	public AmazonHomePageObjects(WebDriver driver) {
		this.driver=driver;
	}
	

	@FindBy(xpath="//a[text()='Best Sellers']")
	public WebElement Bestsellerslink;
	
	@FindBy(xpath="//*[@id='nav-packard-glow-loc-icon']")
	public WebElement navToUsloc;
	
	@FindBy(xpath="//a[text()='Change']")
	public WebElement Changebtn;
	
	@FindBy(xpath="//button[text()='Done']")
	public WebElement Donebtn;
	
	@FindBy(xpath="(//input[@id='GLUXConfirmClose'])[2]")
	public WebElement continuebutton;
	
	@FindBy(xpath="//div[@id='GLOWFeature_AddressList']//input[@id='GLUXZipUpdateInput']")
	public WebElement updateCode;
	
	@FindBy(xpath="//input[@type='submit' and contains(@aria-labelledby,'Update')]")
	public WebElement applyZip;
	//best seller 1 st page
	
	@FindBy(xpath="//div[text()='Amazon Best Sellers']")
	public WebElement Bestsellerpagetitle;
	
	@FindBy(xpath="//a[text()='Camera & Photo']")
	public WebElement cameraphotolink;
	
	@FindBy(xpath="//h1[contains(text(),'Best Sellers in') and //span[contains(text(),'Camera & Photo')]]")
	public WebElement Bestsellerincameraphototitle;
	
	@FindBy(xpath="//h1[contains(text(),'Best Sellers in') and //span[contains(text(),'Digital Point & Shoot Cameras')]]")
	public WebElement digitalcamerapagetitle;
	
	@FindBy(xpath="//a[text()='Point & Shoot Digital Cameras']")
	public WebElement digitalcameralink;
	
	@FindBy(xpath="//*[@id='zg-ordered-list']//li[5]//img")
	public WebElement select5thdigitalcamera;
	
	@FindBy(xpath="(//*[@id='zg-ordered-list']//li[5]//div)[4]")
	public WebElement digitalcameratitle;
	
	@FindBy(xpath="(//*[@id='zg-ordered-list']//li[5]//div)[6]")
	public WebElement digitalcameraprice;
	
	@FindBy(xpath="//div[@id=\"availability\"]//span[contains(text(),'In Stock')]")
	public WebElement checkavailabilitystock;
	
	@FindBy(xpath="(//span[@data-action='a-dropdown-button'])[1]")
	public WebElement dropdowncontainer;
	
	@FindBy(xpath="//ul[@role='listbox']//li[2]")
	public WebElement dropdownqtyselect;
	
	@FindBy(xpath="//input[@title='Add to Shopping Cart']")
	public WebElement clickaddtocart;
	
	
	@FindBy(xpath="//div[@id='attach-warranty']")
	public WebElement Verifypopupbox;
	
	@FindBy(xpath="(//div[@id='attach-warranty']//button)[2]")
	public WebElement Selectnooptioncoverage;
	
	@FindBy(xpath="//div[@id='hlb-subcart']//div[1]")
	public WebElement captureitemdetails;
	
	
	
	
	
	
	
	
	 
}
