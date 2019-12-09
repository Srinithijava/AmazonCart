package amazoncartpages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.amazoncart.demoObjects.BestSellerPageObjects;

public class BestSellerPage extends HomePage{
	
	
	
	static BestSellerPageObjects sellerPg=new BestSellerPageObjects(driver);
	public BestSellerPage(WebDriver driver) {
		super(driver);
		
	}
	//best seller landing page
	public static void navigatetoCameraspg()
	{
		sellerPg = PageFactory.initElements(driver, BestSellerPageObjects.class);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			if(sellerPg.Bestsellerpagetitle.isDisplayed())
			
			{
				sellerPg.cameraphotolink.click();
			}
	}
}
