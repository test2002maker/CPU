package maker;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.remote.DesiredCapabilities;

public class A01Ԫ�ز�ѯ {
	public static void main(String[] qwe) throws MalformedURLException, InterruptedException{
		//1.����appium�Ĳ���
				DesiredCapabilities des=new DesiredCapabilities();
				des.setCapability("platformName","android");//�趨�豸��ƽ̨
				des.setCapability("deviceName","Android Emulator");//�豸��
				des.setCapability("platformVersion","5.1.1");//ƽ̨�汾
				des.setCapability("noReset",true);//��Ҫ�ٴ���װapp
				des.setCapability("appPackage","com.android.browser");//�趨����
				des.setCapability("appActivity","com.android.browser.BrowserActivity");//�趨��ҳ��ַ
				AppiumDriver driver=new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),des);
				Thread.sleep(3000);
//				String str3=driver.findElementById("com.tencent.mobileqq:id/btn_register").getAttribute("text");
//				System.out.println(str3);
//				driver.findElementById("com.tencent.mobileqq:id/btn_register").click();
				driver.findElementByAndroidUIAutomator("text(\"����Ǭ��\")").click();
				Thread.sleep(5000);
				driver.findElementByAndroidUIAutomator("text(\"���\")").click();
				Thread.sleep(5000);
				driver.findElementByAndroidUIAutomator("text(\"�������\")").click();
				Thread.sleep(5000);
				
				
	}

}
