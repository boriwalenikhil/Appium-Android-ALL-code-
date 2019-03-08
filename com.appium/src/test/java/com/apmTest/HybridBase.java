package com.apmTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class HybridBase {
	
	

	

	public static AndroidDriver<AndroidElement> Capabilities()throws MalformedURLException{
		// TODO Auto-generated method stub
			File f = new File("src/test/resources");
			File fs = new File(f, "ApiDemos-debug.apk");

			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "NikhilEmulator");
			cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
			

			//  set up connection with Server Appium
			
			AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);

			return driver;
			/// UIANDRIOD AUTOMATIO : To get Object specfic path 
			
			

		}
		
		
		
	}


