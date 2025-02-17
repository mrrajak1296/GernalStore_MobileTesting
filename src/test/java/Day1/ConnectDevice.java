package Day1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class ConnectDevice {
	
	public static void main(String[] args) throws MalformedURLException {
		
		setup();
		
	}
	
	
	public static void setup() throws MalformedURLException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability("platformName", "Android");
		
		dc.setCapability("platformVersion", "8");
		
		dc.setCapability("deviceName", "anil");
		
		dc.setCapability("appPackage", "com.android.calculator2");
		
		dc.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		dc.setCapability("automationName", "UiAutomator2");
		
		URL url = new URL("http://127.0.0.1:4723");
		AndroidDriver driver = new AndroidDriver(url,dc);
		
		System.out.println("Application Started.....");
		
		
		
	}

}
