package SelendroidApp.AutomationFramework;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.ServerSocket;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;


public class LaunchApp {
	
	public static AndroidDriver<AndroidElement> capabilities(String appName) throws IOException
{
		
	FileInputStream fis = new FileInputStream("C:\\Users\\nagee\\Desktop\\Nageena\\Nagarro Assignment\\AutomationFramework\\src\\main\\java\\SelendroidApp\\AutomationFramework\\global.properties");
	Properties prop = new Properties();
	prop.load(fis);
	
	AndroidDriver<AndroidElement> driver;	
		
	File appDir = new File("src");
	File app = new File(appDir, (String) prop.get(appName));
	
	DesiredCapabilities capabilities = new DesiredCapabilities();
	
	String device= System.getProperty("deviceName");
	capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,device);
	
	//UI Automator to automate the apps --> UIAutomator2
	
	capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
	
	capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 14);
	
	
	capabilities.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());
	
	driver = new AndroidDriver<>(new URL("http://172.29.128.1:4723/wd/hub"),capabilities);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	return driver;
	
}

/*	public static void getScreenshot(String s) throws IOException
	{
	File scrfile=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrfile,new File(System.getProperty("user.dir")+"\\"+s+".png"));
	
	}
*/	
	
}

