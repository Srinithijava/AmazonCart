package amazoncartpages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.amazoncart.demoObjects.BestSellerPageObjects;
import com.amazoncart.demoObjects.BestSellerinCamerasPageObjects;

public class BestSellers_CameranPhotoPage extends HomePage{

	
	static BestSellerinCamerasPageObjects camerasPg=new BestSellerinCamerasPageObjects(driver);
	public BestSellers_CameranPhotoPage(WebDriver driver) {
		super(driver);
	}

	public static void camerasPg()
	{
		camerasPg = PageFactory.initElements(driver, BestSellerinCamerasPageObjects.class);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		if(camerasPg.Bestsellerincameraphototitle.isDisplayed())
		{
			camerasPg.digitalcameralink.click();
		}
	}
}
