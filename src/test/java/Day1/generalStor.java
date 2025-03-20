package Day1;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class generalStor {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
        setup();
    }

    public static void setup() throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "8");
        caps.setCapability("deviceName", "anil");
        caps.setCapability("appPackage", "com.androidsample.generalstore");
        caps.setCapability("appActivity", "com.androidsample.generalstore.SplashActivity");
        caps.setCapability("automationName", "UiAutomator2");

        // Start Appium session
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), caps);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        System.out.println("Application Started.....");

        
        WebElement nameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.EditText")));
        nameField.sendKeys("Anil Rajak");
        System.out.println("Name entered successfully.");

       
        driver.findElement(By.xpath("//android.widget.RadioButton[@resource-id='com.androidsample.generalstore:id/radioMale']")).click();
        driver.findElement(By.className("android.widget.Button")).click();

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));

       
        WebElement addToCartButton = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productAddCart\"])[1]")));

       
        addToCartButton.click();     
        
        driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
        
        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement proceedButton = wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@resource-id=\"com.androidsample.generalstore:id/btnProceed\"]")));

       
        proceedButton.click();
        driver.quit();
    }
}
