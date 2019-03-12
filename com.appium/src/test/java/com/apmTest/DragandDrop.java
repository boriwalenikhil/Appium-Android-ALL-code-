package com.apmTest;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;
public class DragandDrop extends AndriodTest {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
		
		WebElement source = driver.findElementsByClassName("android.view.View").get(0);

		WebElement Destination = driver.findElementsByClassName("android.view.View").get(1); 

		//Longpreess(Source)//Move(Destination) //Release 
		
		TouchAction t = new TouchAction(driver);
//t.longPress(longPressOptions().withElement(element(source))).moveTo(element(Destination)).release().perform();
		
// OR  
 
t.longPress((element(source))).moveTo(element(Destination)).release().perform();

		
		
		
		
		
		
		

	}

}
