package com.apmTest;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Uiautomaortest extends AndriodTest {

	public static void main(String[] args) throws MalformedURLException {

		
		AndroidDriver<AndroidElement> driver = Capabilities();

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		// in appium u  can find element using AndroidUiautomator
		/* Syntax to find element ....*/
       // driver.findElementByAndroidUIAutomator("text("value")");
		
		
		
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

        
       /* Syntax to getting value by property ..  */
        
            //driver.findElementByAndroidUIAutomator("new uiSelector().property(value)");

        // Validate clickable feature for all options

          //.size is total size of element../
         driver.findElementByAndroidUIAutomator("new uiSelector().clickable(true)").getSize();   // /size();
        
		
		
		
	}

}
