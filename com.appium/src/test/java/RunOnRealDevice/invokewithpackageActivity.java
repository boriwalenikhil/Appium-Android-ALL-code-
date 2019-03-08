package RunOnRealDevice;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class invokewithpackageActivity {

	public static void main(String[] args)  {

		/* jr application already asel device madhe  tr package cha name add 
		kryach (mobile vr apk info name cha apps download kryach aani  tya madhe
				je application pahije tya madhun apk cha packge dyach aani run kryach..  */
		 
		File appdir = new File("src/test/resources");
		File app = new File(appdir, "bcom.btnshow.apk");

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");

		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		//AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);

		//return driver;

		
		
		
		
	}

}
