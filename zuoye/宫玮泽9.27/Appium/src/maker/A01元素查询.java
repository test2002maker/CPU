package maker;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.remote.DesiredCapabilities;

public class A01元素查询 {
	public static void main(String[] qwe) throws MalformedURLException, InterruptedException{
		//1.配置appium的参数
				DesiredCapabilities des=new DesiredCapabilities();
				des.setCapability("platformName","android");//设定设备的平台
				des.setCapability("deviceName","Android Emulator");//设备名
				des.setCapability("platformVersion","5.1.1");//平台版本
				des.setCapability("noReset",true);//不要再次重装app
				des.setCapability("appPackage","com.android.browser");//设定包名
				des.setCapability("appActivity","com.android.browser.BrowserActivity");//设定主页地址
				AppiumDriver driver=new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),des);
				Thread.sleep(3000);
//				String str3=driver.findElementById("com.tencent.mobileqq:id/btn_register").getAttribute("text");
//				System.out.println(str3);
//				driver.findElementById("com.tencent.mobileqq:id/btn_register").click();
				driver.findElementByAndroidUIAutomator("text(\"剑舞乾坤\")").click();
				Thread.sleep(5000);
				driver.findElementByAndroidUIAutomator("text(\"礼包\")").click();
				Thread.sleep(5000);
				driver.findElementByAndroidUIAutomator("text(\"独家礼包\")").click();
				Thread.sleep(5000);
				
				
	}

}
