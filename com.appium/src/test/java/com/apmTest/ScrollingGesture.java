package com.apmTest;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ScrollingGesture extends AndriodTest {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = Capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
   	 //  agr device pay run krke scroll krna hey to u can write this code  any device size pay scroll krega.

   /*    Dimension size = driver.manage().window().getSize();
            System.out.println(size);

        int x = size.getWidth()/2;

        int starty = (int) (size.getHeight() * 0.60);
        int endy = (int) (size.getHeight() * 0.10);
        System.out.println("starty = " + starty + " ,endy = " + endy + " , x = " + x);

         driver.swipe(x, starty, x, endy,2000);
       
       
        Thread.sleep(2000);   
        
        */
        
        driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		
		
		//Appium not supported any Scrolling method 
		
		
		//if u want  scroll  then u can do this way   (agr ye code emulator pay run karoge to run ho ga mgr real device pay kroge to  nhi hoga.
		// dimension issue (screenlayout)  deivice size key upar hota hey ye  Most facing problem .... (check jr hot asel device vr aani emulator vr tr he method rahu dya)
		
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Spinner\").instance(0))");	}

	
	  
	  
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
