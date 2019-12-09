package amazoncartpages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amazoncart.demoObjects.DigitalCamerasPageObjects;
import com.amazoncart.demoObjects.ProductSelectionPageObjects;
import com.cucumber.listener.Reporter;

public class ProductSelectionPage extends HomePage{
	
	static ProductSelectionPageObjects prodSelection=new ProductSelectionPageObjects(driver);
	public ProductSelectionPage(WebDriver driver) {
		super(driver);
	}

	public static void prodSelection(int quantity) throws InterruptedException
	{
		prodSelection = PageFactory.initElements(driver, ProductSelectionPageObjects.class);
		Thread.sleep(5000);
		if(prodSelection.checkavailabilitystock.isDisplayed())
		{
			WebDriverWait wait=new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(prodSelection.dropdowncontainer));
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", prodSelection.dropdowncontainer);
			//Verification of available quantity:
			int availableqty = prodSelection.AvailableQuantity.size();
			if(availableqty>=quantity)
			{
				//select quantity through feature file
				driver.findElement(By.xpath("//div[contains(@class,'dropdown')]//ul[@role='listbox']//li["+quantity+"]")).click();
				Reporter.addStepLog("Expected quantity is available and selected");
			}
			else
			{
				Reporter.addStepLog("Available quatity is lesser than expected Quantity");
			}
			
			prodSelection.clickaddtocart.click();
		}
		Thread.sleep(5000);
			if(prodSelection.Verifypopupbox.isDisplayed())
			{
				prodSelection.Selectnooptioncoverage.click();
			}
			else if(prodSelection.verifypopupbox2.isDisplayed())
					{
				prodSelection.Selectnooptioncoverage2.click();
					}
		
		
		
		
	}
}
