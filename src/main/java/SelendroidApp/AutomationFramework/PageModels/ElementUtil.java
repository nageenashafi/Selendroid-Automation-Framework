package SelendroidApp.AutomationFramework.PageModels;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ElementUtil {
	
	private AndroidDriver<AndroidElement> driver;
	
	public ElementUtil(AndroidDriver<AndroidElement> driver)
	{
		this.driver = (AndroidDriver<AndroidElement>) driver;
	}
	
	public WebElement getElement(By Locator)
	{
		 return driver.findElement(Locator);
	}
	
	public void doSendKeys(By Locator, String Value)

	{
		getElement(Locator).sendKeys(Value);
			
	}
	
	public void doClick(By Locator)
	{
		getElement(Locator).click();
	}
	
	public void doGetText(By Locator,String Value)
	{
		String TextReceived = getElement(Locator).getText();
		if (TextReceived.equals(Value))
		{
			System.out.println("Test case passed. The data displayed is same as data entered. "+TextReceived);
		}
		else
		{
			System.out.println("Test case failed");
		}
		
	}
	
		public void doGetText(By Locator)
		{
			String HomeScreenHeader = getElement(Locator).getText();	
			 if(HomeScreenHeader.contains("Hello Default"))
		     {
		    	 System.out.println("User is navigated back to Home screen on clicking Register User");
		     }
			 else
			 {
				 System.out.println("TC Failed");
			 }
		}

}
