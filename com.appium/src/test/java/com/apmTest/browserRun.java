package com.apmTest;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class browserRun extends BaseChromebrowser {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {


		
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.get("https://www.facebook.com/");
		
		driver.findElementByXPath("//input[@id='m_login_email']").sendKeys("n.boriwale@gmail.com");
		Thread.sleep(1000);

		driver.findElementByXPath("//input[@id='m_login_password']").sendKeys("Apple@452");
		Thread.sleep(1000);

		
		driver.findElementByXPath("//button[@value='Log In']").click();
		Thread.sleep(1000);
		
	}

}
