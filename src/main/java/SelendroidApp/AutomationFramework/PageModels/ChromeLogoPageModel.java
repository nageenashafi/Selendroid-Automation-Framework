package SelendroidApp.AutomationFramework.PageModels;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ChromeLogoPageModel {

	
		public ChromeLogoPageModel(AndroidDriver<AndroidElement> driver) {
			
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}


		@AndroidFindBy(xpath="//android.widget.TextView[@text='selendroid-test-app']")
	private WebElement ChromeTitle;
	
	public WebElement getChromePageTitle()
	{
		System.out.println("Getting the title in Web View Interaction screen title");
		return ChromeTitle;
	}
	
	@AndroidFindBy(uiAutomator="text(\"Hello, can you please tell me your name?\")")
	private WebElement ChromeHeader;
	
	public WebElement getChromePageHeader()
	{
		System.out.println("Getting the Web View Interaction screen header");
		return ChromeHeader;
	}
	
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='name_input']")
    private WebElement EnterName;
	
	public WebElement doSendName()
	{
		System.out.println("Entering Name in enter your name field");
		return EnterName;
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Prefered Car:']")
    private WebElement PreferredCar;
	
		
	@AndroidFindBy(uiAutomator="text(\"Mercedes\")")
    private WebElement SelectedCar;
	
	
	public WebElement PreferredCarOption()
	{
	   	  return PreferredCar;
	}
	
	public WebElement doSelectPreferredCar()
	{
	   	System.out.println("Selecting the Preferred car");
	 		return SelectedCar;
	}
	
	@AndroidFindBy(uiAutomator="text(\"Send me your name!\")")
    private WebElement SendButton;
        
	public WebElement doSendButton()
	{
	 	System.out.println("Sending the details");
		return SendButton;
	}
	
	@AndroidFindBy(id="io.selendroid.testapp:id/goBack")
    private WebElement GoToHOmeScreen;
        
	public WebElement BackToHomeScreen()
	{
	 	
		return GoToHOmeScreen;
	}
	
	 
	
	
	
	
}
