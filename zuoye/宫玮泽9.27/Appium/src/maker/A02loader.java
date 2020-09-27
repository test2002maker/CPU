package maker;

import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

public class A02loader {

	public static void main(String[] args) throws MalformedURLException, InterruptedException{
		// TODO Auto-generated method stub
		DesiredCapabilities des=new DesiredCapabilities();
		des.setCapability("platformName","android");//设定设备的平台
		des.setCapability("deviceName","Android Emulator");//设备名
		des.setCapability("platformVersion","5.1.1");//平台版本
		des.setCapability("noReset",true);//不要再次重装app
		des.setCapability("appPackage","com.tencent.mobileqq");//设定包名
		des.setCapability("appActivity","com.tencent.mobileqq.activity.LoginActivity");//设定主页地址
		AppiumDriver driver=new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),des);
		Thread.sleep(3000);
		if(driver.findElementByAccessibilityId("请输入QQ号码或手机或邮箱")==null){
			driver.findElementById("com.tencent.mobileqq:id/btn_login").click();
			Thread.sleep(5000);
		}
		if(driver.findElementByAccessibilityId("请输入QQ号码或手机或邮箱")==null){
			String[] str1={"804465500"};
			String[] str2={"xinyoubugan."};
			driver.findElementByAccessibilityId("请输入QQ号码或手机或邮箱").click();
			Thread.sleep(3000);
			driver.findElementByAccessibilityId("请输入QQ号码或手机或邮箱").sendKeys(str1);
			Thread.sleep(3000);
			driver.findElementByAccessibilityId("密码 安全").click();
			Thread.sleep(3000);
			driver.findElementByAccessibilityId("密码 安全").sendKeys(str2);
			Thread.sleep(3000);
		}
		driver.findElementByAccessibilityId("登 录").click();
		Thread.sleep(10000);
		

	}

}