package day03;

import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

public class A03_qq登录 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		//配置appium的参数
		DesiredCapabilities des=new DesiredCapabilities();
		des.setCapability("platformName","android");//设定设备的平台
		des.setCapability("deviceName", "Android Emulator");//设备名
		des.setCapability("platformVersion", "4.4.4");//平台版本
		des.setCapability("noReset", true);//不要再次重装APP
		des.setCapability("appPackage", "com.tencent.qqlite");//包名
		des.setCapability("appActivity", "com.tencent.mobileqq.activity.RegisterGuideActivity");
		
		//创建appium对象
		AppiumDriver dr=new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), des);
		Thread.sleep(5000);
		//定位元素
		String[] arr={"12345"};//账号
		String[] arr1={"ishiwp340"};
		dr.findElementById("com.tencent.qqlite:id/btn_login").click();
		Thread.sleep(5000);
		dr.findElementByAccessibilityId("请输入QQ号码或手机或邮箱").click();
		dr.findElementByAccessibilityId("请输入QQ号码或手机或邮箱").clear();
		dr.findElementByAccessibilityId("请输入QQ号码或手机或邮箱").sendKeys(arr);//输入账号
		dr.findElementByAccessibilityId("请输入密码").click();
		dr.findElementByAccessibilityId("请输入密码").sendKeys(arr1);//输入密码
		dr.findElementById("com.tencent.qqlite:id/login").click();
		
	}

}
