package SelendroidApp.AutomationFramework.PageModels;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PopUpPageModel {

	@AndroidFindBy(id="android:id/button2")
	private WebElement NoButton;
	
	public PopUpPageModel(AndroidDriver<AndroidElement> driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public WebElement getNoButton()
	{
		return NoButton;
	}
	
	
}
