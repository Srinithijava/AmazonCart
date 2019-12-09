package amazoncartpages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.amazoncart.demoObjects.BestSellerinCamerasPageObjects;
import com.amazoncart.demoObjects.DigitalCamerasPageObjects;
import com.cucumber.listener.Reporter;

public class DigitalCamerasPage extends HomePage{
 
	static String Productname;
	static String ProductPrice;
	
	static DigitalCamerasPageObjects dgCamerapg=new DigitalCamerasPageObjects(driver);
	public DigitalCamerasPage(WebDriver driver) {
		super(driver);
	}
	public static void digitalcameras(int product) {
		dgCamerapg = PageFactory.initElements(driver, DigitalCamerasPageObjects.class);
		if(dgCamerapg.digitalcamerapagetitle.isDisplayed())
		{
		    JavascriptExecutor js = (JavascriptExecutor) driver; 
			js.executeScript("window.scrollBy(0,1000)");
			js.executeScript("arguments[0].scrollIntoView();",dgCamerapg.select5thdigitalcamera );
			Productname = dgCamerapg.digitalcameratitle.getText();
			ProductPrice = dgCamerapg.digitalcameraprice.getText();
			//select 5th product through feature file
			driver.findElement(By.xpath("//*[@id='zg-ordered-list']//li["+product+"]//img")).click();
			Reporter.addStepLog("5th product has been selected as expected");
			}
	}
		

	
}
