package appium01;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.remote.DesiredCapabilities;

public class apptest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException{
		// TODO �Զ����ɵķ������
		DesiredCapabilities d=new DesiredCapabilities();
		d.setCapability("platformName","Android");
		d.setCapability("deviceName","Android Emulator");
		d.setCapability("platformVersion","4.4.4");
		d.setCapability("noReset",true);
		d.setCapability("appPackage","com.tencent.qqlite");
		d.setCapability("appActivity","com.tencent.mobileqq.activity.RegisterGuideActivity");
		AppiumDriver dr=new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),d);
		dr.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		dr.findElementById("com.tencent.qqlite:id/btn_login").click();
		dr.findElementByAccessibilityId("������QQ������ֻ�������").click();
		dr.findElementByAccessibilityId("������QQ������ֻ�������").clear();
		String[] arr={"1072145761"};
		dr.findElementByAccessibilityId("������QQ������ֻ�������").sendKeys(arr);
		dr.findElementByAccessibilityId("����������").click();
		dr.findElementByAccessibilityId("����������").clear();
		dr.findElementByAccessibilityId("����������").sendKeys(arr);
		dr.findElementByAccessibilityId("��¼QQ").click();
		
	}

}