package SelendroidApp.AutomationFramework.PageModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class HomePageModel {


	public HomePageModel(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id="android:id/title")
	private WebElement Title;
	
	
	public WebElement getTitle()
	{
		System.out.println("Getting Home screen Title");
		return Title;
	}
	
	@AndroidFindBy(id="io.selendroid.testapp:id/buttonTest")
	private WebElement ENButton;
	
	public WebElement getENButton()
	{
		System.out.println("Getting EN Button in Home Page");
		return ENButton;
	}
	

	@AndroidFindBy(xpath="//android.widget.ImageButton[@resource-id='io.selendroid.testapp:id/buttonStartWebview']")
	private WebElement ChromeLogo;

	public WebElement getChromeLogo()
	{
		System.out.println("Getting Chrome Logo");
		return ChromeLogo;
	}
	
	@AndroidFindBy(id="io.selendroid.testapp:id/exceptionTestButton")
	private WebElement ExceptionButton;

	public WebElement UnhandledExceptionButton()
	{
		System.out.println("Getting the exception");
		return ExceptionButton;
	}
	
	
	@AndroidFindBy(id="io.selendroid.testapp:id/exceptionTestField")
	private WebElement ExceptionTextBox;
	
	public WebElement SendExceptionText()
	{
		System.out.println("Sending data in Exception Text Box");
		return ExceptionTextBox;
	}
	
	@AndroidFindBy(xpath="//android.widget.ImageButton[@index='1']")
			public WebElement FileLogoButton;
	
	public WebElement FileLogoButtonClick()
	{
		return FileLogoButton;
	}
	
	
	@AndroidFindBy(id="io.selendroid.testapp:id/showToastButton")
	private WebElement ToastButton;
	
	public WebElement ToastButtonClick()
	{
		return ToastButton;
	}
	
	@AndroidFindBy(xpath="//android.widget.Toast[1]")
	private WebElement ToastMessage;
	
	public WebElement ToastButtonMessage()
	{
		return ToastMessage;
	}
	
	@AndroidFindBy(id="io.selendroid.testapp:id/waitingButtonTest")
	private WebElement ProgressBar;
	
	public WebElement PageProgressBar()
	{
		return ProgressBar;
	}
	
	
	


			
	

	
	
	
	
	
	
	
	
}
