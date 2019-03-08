package com.apmTest;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class Gesture extends AndriodTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {


		AndroidDriver<AndroidElement> driver = Capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
                              // OR 
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		
		
		// TAP Gesture  
		
		TouchAction t =new TouchAction(driver);
		Thread.sleep(1000);

		WebElement expandList=	driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
		Thread.sleep(1000);
		//You can use this method with complex gesture like drag and drop and  sliding  u can use this way
		t.tap(tapOptions().withElement(element(expandList))).perform();
		
		// For long Presss gesture
		
		WebElement pn=	driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
		Thread.sleep(1000);

		t.longPress(longPressOptions().withElement(element(pn)).withDuration(ofSeconds(2))).release().perform();
		Thread.sleep(2000);
		driver.findElementById("android:id/title");

		System.out.println(driver.findElementById("android:id/title").isDisplayed());
		
		
		
	}

}
