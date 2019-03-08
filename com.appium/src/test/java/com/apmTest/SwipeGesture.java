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



public class SwipeGesture extends AndriodTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver = Capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElementByXPath("//android.widget.TextView[@text='Views']");
Thread.sleep(1000);
driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
Thread.sleep(1000);

driver.findElementByXPath("//android.widget.TextView[@text='2. Inline']").click();
Thread.sleep(1000);

driver.findElementByXPath("//*[@content-desc='9']").click();
TouchAction t  = new TouchAction(driver);

// long press // on element // 2 sec //move to another element and you release
WebElement First = driver.findElementByXPath("//*[@content-desc='15']");
WebElement Second = driver.findElementByXPath("//*[@content-desc='45']");

t.longPress(longPressOptions().withElement(element(First)).withDuration(ofSeconds(2))).moveTo(element(Second)).release().perform(); 



	}

}
