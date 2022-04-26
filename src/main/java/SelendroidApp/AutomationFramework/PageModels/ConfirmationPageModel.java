package SelendroidApp.AutomationFramework.PageModels;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ConfirmationPageModel {
	
	
	public ConfirmationPageModel(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	@AndroidFindBy(xpath="//android.view.View[@text='This is my way of saying hello']")
	private WebElement ConfirmationHeader;
	
	public WebElement getConfirmationPageHeader()
	{
		System.out.println("Capturing the header");
		return ConfirmationHeader;
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@index='3']")
	private WebElement GetName;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@index='5']")
	private WebElement GetPreferredCar;
	
	public WebElement getConfirmationPageDetails()
	{
		System.out.println("Getting the Name and Preferred Car entered and displayed");
		return GetName;
	}
	
	public WebElement getCarDetails()
	{
		System.out.println("Getting the Name and Preferred Car entered and displayed");
		return GetPreferredCar;
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='here']")
	private WebElement LinkHere;
	
	public WebElement doClickHere()
	{
		System.out.println("Clicking on the link here");
		return LinkHere;
	}
	
	@AndroidFindBy(uiAutomator="text(\"Volvo\")")
	private WebElement DefaultCar;
	
	public WebElement DefaultCar()
	{
		System.out.println("Getting the Default Car details");
		return DefaultCar;
	}
	
	
	

}
