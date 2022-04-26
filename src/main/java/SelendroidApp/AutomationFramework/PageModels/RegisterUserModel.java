package SelendroidApp.AutomationFramework.PageModels;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RegisterUserModel {
	
		
		public RegisterUserModel(AndroidDriver<AndroidElement> driver) {
			
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(uiAutomator="text(\"selendroid-test-app\")")
	private WebElement FileTitle;
	
	public WebElement getRegisterPageTitle()
	{
				return FileTitle;
	}
	
	@AndroidFindBy(uiAutomator="text(\"Welcome to register a new User\")")
	private WebElement FileHeader;
	
	public WebElement getRegisterPageHeader()
	{
				return FileHeader;
	}
	
	@AndroidFindBy(id="io.selendroid.testapp:id/inputName")
	private WebElement Name;
	
	public WebElement getInputName()
	{
				return Name;
	}

	@AndroidFindBy(id="android:id/text1")
	private WebElement PLang;
	
	public WebElement getDefaultPLang()
	{
				return PLang;
	}
	
	@AndroidFindBy(id="io.selendroid.testapp:id/inputUsername")
	private WebElement UserName;
	
	public WebElement SendUserName()
	{
				return UserName;
	}
	
	
	@AndroidFindBy(id="io.selendroid.testapp:id/inputEmail")
	private WebElement Email;
	
	public WebElement SendEmail()
	{
				return Email;
	}
	

	@AndroidFindBy(id="io.selendroid.testapp:id/inputPassword")
	private WebElement Password;
	
	public WebElement SendPassword()
	{
				return Password;
	}
	
	@AndroidFindBy(id="io.selendroid.testapp:id/input_adds")
	private WebElement Checkbox;
	
	public WebElement SelectCheckBox()
	{
				return Checkbox;
	}
	
	@AndroidFindBy(id="io.selendroid.testapp:id/btnRegisterUser")
	private WebElement RegisterUserBtn;
	
	public WebElement RegisterUserButton()
	{
				return RegisterUserBtn;
	}
	




}
	
	
	
	
	
	
	
	
	
	

	

	
	
	
	

