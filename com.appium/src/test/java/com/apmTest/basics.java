package com.apmTest;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class basics extends AndriodTest {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver = Capabilities();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Xpath id,class name,Android automator
		// //tagname[@attribute='value']

		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();

		// Suppose row all value are same the how to identify 2 ro value
		// BY using index

		// click on checkbox

		driver.findElementById("android:id/checkbox").click();

		// select row second index element..///

		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		// sending text to text box....//
		driver.findElementByClassName("android.widget.EditText").sendKeys("hello");

		// for button select multiple object with index..//
		driver.findElementsByClassName("android.widget.Button").get(1).click();

	}

}
