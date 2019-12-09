package amazoncartpages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.amazoncart.demoObjects.ProductCartPageObjects;
import com.cucumber.listener.Reporter;

public class CartPage extends HomePage {
	
	

	static ProductCartPageObjects cartpg=new ProductCartPageObjects(driver);
	public CartPage(WebDriver driver) {
		super(driver);
	}
	public static void cartpagevalidation() throws InterruptedException
	{
		cartpg = PageFactory.initElements(driver, ProductCartPageObjects.class);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(4000);
		if(cartpg.addedtocartmessage.isDisplayed())
		{
			cartpg.CartButton.click();
		}
		else if(cartpg.addedtocartmessage2.isDisplayed())
		{
		
			cartpg.CartButton2.click();
		}
		Thread.sleep(5000);
		//cart page captured items
		String cartpageProductTitle = cartpg.Captureproducttitle.getText();
		Reporter.addStepLog("Cartpage product title is " + cartpageProductTitle);
		String SubTotal = cartpg.CaptureSubtotal.getText();
		String ItemCount1 = cartpg.ItemCount.getText();
	     String[] words = ItemCount1.split("[(]");
	     String ItemCount2 = words[1];
	     String[]  ItemCount3 = ItemCount2.split(" ");
	     String ItemCount4 = ItemCount3[0];
	     int Itemqtyselected = Integer.parseInt(ItemCount4);
	     Reporter.addStepLog("selected item quantities are " + Itemqtyselected);
	     //final cart page total price
		String Totalprice = cartpg.Totalprice.getText();
		String[] pri1 = Totalprice.split("[$]");
		double capturedtotalprice = Double.parseDouble(pri1[1]);
		Reporter.addStepLog("Captured total price on cart page is " + capturedtotalprice);
		//gathering values from previous pages(product selection) values like name ,price of product
				DigitalCamerasPage dcpage = null;
				String productpageproductname = dcpage.Productname;
				Reporter.addStepLog("Product name selected from product page is  " + productpageproductname);
				String productpageproductprice = dcpage.ProductPrice;
				String[] act1 = productpageproductprice.split("[$]");
				double individualprice = Double.parseDouble(act1[1]);
				Reporter.addStepLog("Individual price of selected product is  " + individualprice);
				Thread.sleep(5000);
		//calculation of total price based on items selected and individual values of each
		double expectedtotalprice = Itemqtyselected*individualprice;
		Reporter.addStepLog("Expected total price is " + expectedtotalprice );
		//validation of total price
		if(expectedtotalprice==capturedtotalprice)
		{
			Reporter.addStepLog("Captured total price is matches with expected total amount");
		}
		//validation for product selected
		if(productpageproductname.equalsIgnoreCase(cartpageProductTitle))
		{
		Reporter.addStepLog("Product names are matching as expected");
		}
		//close driver
		driver.close();
		
		
		

	
	
	
	

}
	}

