package SelendroidApp.AutomationFramework.PageModels;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class UserDetailsPageModel {

	public UserDetailsPageModel(AndroidDriver<AndroidElement> driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Verify user']")
	private WebElement UserDetailsHeader;
	
	public WebElement VerifyUserDetailsHeader()
	{
				return UserDetailsHeader;
	}	
	
	
				@AndroidFindBy(id="io.selendroid.testapp:id/label_name_data")
		private WebElement NameReceived;
		
		public WebElement VerifyName()
		{
					return NameReceived;
		}

		@AndroidFindBy(id="io.selendroid.testapp:id/label_preferedProgrammingLanguage_data")
		private WebElement PLangReceived;
		
		public WebElement VerifyPLang()
		{
					return PLangReceived;
		}
		
		@AndroidFindBy(id="io.selendroid.testapp:id/label_username_data")
		private WebElement UserNameReceived;
		
		public WebElement VerifyUserName()
		{
					return UserNameReceived;
		}
		
		
		@AndroidFindBy(id="io.selendroid.testapp:id/label_email_data")
		private WebElement EmailReceived;
		
		public WebElement VerifyEmail()
		{
					return EmailReceived;
		}
		

		@AndroidFindBy(id="io.selendroid.testapp:id/label_password_data")
		private WebElement PasswordReceived;
		
		public WebElement VerifyPassword()
		{
					return PasswordReceived;
		}
		
		@AndroidFindBy(xpath="//android.widget.Button[@text='Register User']")
		private WebElement DetailsPageRegisterButton;
		
		public WebElement ClickDetailsPageRegisterButton()
		{
					return DetailsPageRegisterButton;
		}
		
		
	
	
	
}
