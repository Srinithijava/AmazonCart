package amazoncartpages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.amazoncart.demoObjects.AmazonHomePageObjects;

import DataSetup.ConfigFileReader;

public class HomePage extends AmazonHomePageObjects {
	static ConfigFileReader configFileReader;
	 

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	static WebDriver driver;
	static AmazonHomePageObjects amazonpageobject;
	 
	
	public static void LaunchApplication() throws IOException
	{
		configFileReader= new ConfigFileReader();
		
		System.setProperty("webdriver.chrome.driver",ConfigFileReader.getDriverPath());
		driver = new ChromeDriver();	
		amazonpageobject = PageFactory.initElements(driver, AmazonHomePageObjects.class);
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.navigate().refresh();
	}
	
	public static void navigatebestseller() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //navigate best sellers
		
		amazonpageobject.navToUsloc.click();
		if(amazonpageobject.Changebtn.isDisplayed())
		{
			amazonpageobject.Changebtn.click();
			amazonpageobject.updateCode.clear();
			amazonpageobject.updateCode.sendKeys("94545");
			amazonpageobject.Donebtn.click();
			Thread.sleep(2000);
		}
		else if(amazonpageobject.updateCode.isDisplayed())
		{
		amazonpageobject.updateCode.click();
		amazonpageobject.updateCode.sendKeys("94545");
		amazonpageobject.applyZip.click();
		amazonpageobject.continuebutton.click();
		amazonpageobject.Bestsellerslink.click();
		}
	}
}
		
		
		