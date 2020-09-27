package day03;

import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Time;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;

public class A04_计算器 {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities des=new DesiredCapabilities();
		des.setCapability("platformName","android");//设定设备的平台
		des.setCapability("deviceName", "Android Emulator");//设备名
		des.setCapability("platformVersion", "4.4.2");//平台版本
		des.setCapability("noReset", true);//不要再次重装APP
		des.setCapability("appPackage", "com.android.calculator2");//包名
		des.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		AppiumDriver dr=new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),des);
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//9
		dr.findElementById("com.android.calculator2:id/digit9").click();
		//+
		dr.findElementById("com.android.calculator2:id/plus").click();
		//7
		dr.findElementById("com.android.calculator2:id/digit7").click();
		//=
		dr.findElementById("com.android.calculator2:id/equal").click();
		//显示屏
		String s=dr.findElementByClassName("android.widget.EditText").getAttribute("text");
		System.out.print(s);
		
		
		
		
		

	}

}
