package SelendroidApp.AutomationFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import SelendroidApp.AutomationFramework.PageModels.ChromeLogoPageModel;
import SelendroidApp.AutomationFramework.PageModels.ConfirmationPageModel;
import SelendroidApp.AutomationFramework.PageModels.HomePageModel;
import SelendroidApp.AutomationFramework.PageModels.PopUpPageModel;
import SelendroidApp.AutomationFramework.PageModels.RegisterUserModel;
import SelendroidApp.AutomationFramework.PageModels.UserDetailsPageModel;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePage extends LaunchApp {
	
	AndroidDriver<AndroidElement> driver;

	
	public HomePage() throws IOException
	{
	driver = capabilities("SelendroidApp");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
	}

	
	@Test(priority=1, description="Verification of title")
	
	public void VerifyHomePageTitle() throws IOException
	{
	    
		 HomePageModel home = new HomePageModel(driver);
		 String TitleText = home.getTitle().getText();
		 Assert.assertEquals(TitleText,"selendroid-test-app"); 
		 
	}
	
	@Test(priority=2, description="Verification of EN Button")
	public void VerifyENButton()
	{
		HomePageModel home = new HomePageModel(driver);
		home.getENButton().click();
		
		PopUpPageModel PopUp = new PopUpPageModel(driver);
		PopUp.getNoButton().click();
		
		 String TitleText = home.getTitle().getText();
		 Assert.assertEquals(TitleText,"selendroid-test-app"); 
		
	}
	
	@Test(priority=3, description="Verification of Title displayed in Web View screen on clicking Chrome Logo Button")
	public void VerifyChromeLogoTitle()
	{
		HomePageModel home = new HomePageModel(driver);
		home.getChromeLogo().click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		ChromeLogoPageModel CLogo = new ChromeLogoPageModel(driver);
		String CLogoTitleText = CLogo.getChromePageTitle().getText();
		
		Assert.assertEquals(CLogoTitleText,"selendroid-test-app"); 
	}
	
	@Test(priority=4, description="Verification of header in Web View Interaction screen")
	public void VerifyChromeLogoButton()
	{
	/*	HomePageModel home = new HomePageModel(driver);
		home.getChromeLogo().click();
	*/
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ChromeLogoPageModel CLogo = new ChromeLogoPageModel(driver);
		String CLogoHeader = CLogo.getChromePageHeader().getText();
		Assert.assertEquals(CLogoHeader,"Hello, can you please tell me your name?"); 
	}
	
	@Test(priority=5, description="Verification of Confirmation screen displayed on clicking Send Me your name")
	public void VerifyConfirmationText()
	{
		ChromeLogoPageModel CLogo = new ChromeLogoPageModel(driver);
		CLogo.doSendName().sendKeys("Nageena");
		
		CLogo.PreferredCarOption().click();
		CLogo.doSelectPreferredCar().click();
		CLogo.doSendButton().click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		ConfirmationPageModel ConfirmPage = new ConfirmationPageModel(driver);
		String ConfirmationHeader = ConfirmPage.getConfirmationPageHeader().getText();
		Assert.assertEquals(ConfirmationHeader,"This is my way of saying hello"); 
	}
	
	@Test(priority=6, description="Verification of Confirmation screen details")
	public void VerifyConfirmationDetails()
	{
		
	/*	ChromeLogoPageModel CLogo = new ChromeLogoPageModel(driver);
		CLogo.doSendName().sendKeys("Nageena");
		String NameSent = CLogo.doSendName().getText();
		CLogo.PreferredCarOption().click();
		CLogo.doSelectPreferredCar().click();
		String CarSelected = CLogo.doSelectPreferredCar().getText();
	*/
		
		ConfirmationPageModel ConfirmPage = new ConfirmationPageModel(driver);
		String NameDisplayed = ConfirmPage.getConfirmationPageDetails().getText();
		
		String PrefCarDisplayed = ConfirmPage.getCarDetails().getText();
		
		Assert.assertEquals(NameDisplayed,"\"Nageena\"");
		Assert.assertEquals(PrefCarDisplayed,"\"mercedes\"");
		
	}
	
	@Test(priority=7, description="Verification of clicking the link 'here'")
	public void VerifyHereLink()
	{
		ConfirmationPageModel ConfirmPage = new ConfirmationPageModel(driver);
		ConfirmPage.doClickHere().click();
		String DefaultTitle = ConfirmPage.DefaultCar().getText();
		Assert.assertEquals(DefaultTitle, "Volvo");
	}
	
	@Test(priority = 8)
	public void VerifyToastMessage()
	{
		ChromeLogoPageModel CLogo = new ChromeLogoPageModel(driver);
		CLogo.BackToHomeScreen().click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	    HomePageModel home = new HomePageModel(driver);
	    
	    home.ToastButtonClick().click();
	    
	    String Message = home.ToastButtonMessage().getAttribute("name");
	    System.out.println("The toast message is: " +Message);
	    Assert.assertEquals(Message, "Hello selendroid toast!");
	}
	
	@Test(priority = 9, description = "Verify user registration page Title")
    public void VerifyRegisterUserTitle()
    {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		HomePageModel home = new HomePageModel(driver);
		home.FileLogoButtonClick().click();
		RegisterUserModel register = new RegisterUserModel(driver);
				String FileTitle = register.getRegisterPageTitle().getText();
				System.out.println("The register page title is: " +FileTitle);
			    Assert.assertEquals(FileTitle, "selendroid-test-app");
		
	}
	
	@Test(priority = 10, description = "Verify user registration page header")
    public void VerifyRegisterUserHeader()
    {
			
			RegisterUserModel register = new RegisterUserModel(driver);
				String FileHeader = register.getRegisterPageHeader().getText();
				System.out.println("The register page title is: " +FileHeader);
			    Assert.assertEquals(FileHeader, "Welcome to register a new User");
		
	}
	
	@Test(priority = 11, description = "Verify Name field value displayed by default")
    public void VerifyRegisterUserNameValue() throws InterruptedException
    {
			
			RegisterUserModel register = new RegisterUserModel(driver);
			
			driver.hideKeyboard();
		    Thread.sleep(2000);
		    
				String NameValue = register.getInputName().getText();
				System.out.println("The default Name field value is: " +NameValue);
			    Assert.assertEquals(NameValue, "Mr. Burns");
			}
	
	@Test(priority = 12, description = "Verify Programming Language field value displayed by default")
    public void VerifyRegisterUerPLangValue()
    {
			
			RegisterUserModel register = new RegisterUserModel(driver);
				String PLangValue = register.getDefaultPLang().getText();
				System.out.println("The default Prog Lang field value is: " +PLangValue);
			    Assert.assertEquals(PLangValue, "Ruby");
			}
	
	@Test(priority = 13, description = "Verify user registration")
    public void VerifyRegisterUser()
    {
			
			RegisterUserModel register = new RegisterUserModel(driver);
				register.SendUserName().sendKeys("Nageena");
				register.SendEmail().sendKeys("nageena.shafi@gmail.com");
				register.SendPassword().sendKeys("Test@123");
				register.SelectCheckBox().click();
				register.RegisterUserButton().click();
				System.out.println("User registration is successful");
				UserDetailsPageModel userdetails = new UserDetailsPageModel(driver);
				String UserDetailsHeader = userdetails.VerifyUserDetailsHeader().getText();
				System.out.println("The header displayed is : "+UserDetailsHeader);
			    Assert.assertEquals(UserDetailsHeader, "Verify user");
			}
	
	@Test(priority = 14, description = "Verify user registration")
    public void VerifyRegisterUserDetails()
    {
				UserDetailsPageModel userdetails = new UserDetailsPageModel(driver);
				String Name = userdetails.VerifyName().getText();
				String Username = userdetails.VerifyUserName().getText();
				String Email = userdetails.VerifyEmail().getText();
				String Password = userdetails.VerifyPassword().getText();
				String ProgLang = userdetails.VerifyPLang().getText();
			//	Assert.assertEquals(Username,"Nageena");
				Assert.assertEquals(Email, "nageena.shafi@gmail.com");
				Assert.assertEquals(Password, "Test@123");
				Assert.assertEquals(Name, "Mr. Burns");
				Assert.assertEquals(ProgLang, "Ruby");
			}
	
	@Test(priority = 15, description = "Verify register button click in User registration page")
    public void VerifyUserDetailsRegisterUserButton()
    {
				UserDetailsPageModel userdetails = new UserDetailsPageModel(driver);
				userdetails.ClickDetailsPageRegisterButton().click();
				HomePageModel home = new HomePageModel(driver);
				String ProgressBar = home.PageProgressBar().getText();
				Assert.assertEquals(ProgressBar, "Show Progress Bar for a while");
    }
	
	@Test(priority = 16, description = "Verify Progress bar in home screen")
    public void VerifyProgressBar()
    {
		HomePageModel home = new HomePageModel(driver);
				home.PageProgressBar().click();
				 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				 RegisterUserModel register = new RegisterUserModel(driver);
				String ExpectedTitle = register.getRegisterPageHeader().getText();
				Assert.assertEquals(ExpectedTitle, "Welcome to register a new User");
    }
	

	@Test(priority=17, description="Negative Test - TypeExceptionField")
	public void VerifyExceptionTextBox()
	{
		ChromeLogoPageModel CLogo = new ChromeLogoPageModel(driver);
		CLogo.BackToHomeScreen().click();
		HomePageModel home = new HomePageModel(driver);
		home.SendExceptionText().sendKeys("TestException");
		String HomePageTitle = home.getTitle().getText();
		Assert.assertNotEquals(HomePageTitle,"selendroid-test-app");
		
	}
	
	@Test(priority=18, description="Negative Test - Exception")
	public void VerifyUnhandledException() throws IOException
	{
		driver = capabilities("SelendroidApp");
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		HomePageModel home = new HomePageModel(driver);
		home.UnhandledExceptionButton().click();
		String HomePageTitle = home.getTitle().getText();
		Assert.assertNotEquals(HomePageTitle,"selendroid-test-app");
		
	}
	
	
	
	
	
	
	
	
	

}
