package maker;

import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

public class A02loader {

	public static void main(String[] args) throws MalformedURLException, InterruptedException{
		// TODO Auto-generated method stub
		DesiredCapabilities des=new DesiredCapabilities();
		des.setCapability("platformName","android");//�趨�豸��ƽ̨
		des.setCapability("deviceName","Android Emulator");//�豸��
		des.setCapability("platformVersion","5.1.1");//ƽ̨�汾
		des.setCapability("noReset",true);//��Ҫ�ٴ���װapp
		des.setCapability("appPackage","com.tencent.mobileqq");//�趨����
		des.setCapability("appActivity","com.tencent.mobileqq.activity.LoginActivity");//�趨��ҳ��ַ
		AppiumDriver driver=new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),des);
		Thread.sleep(3000);
		if(driver.findElementByAccessibilityId("������QQ������ֻ�������")==null){
			driver.findElementById("com.tencent.mobileqq:id/btn_login").click();
			Thread.sleep(5000);
		}
		if(driver.findElementByAccessibilityId("������QQ������ֻ�������")==null){
			String[] str1={"804465500"};
			String[] str2={"xinyoubugan."};
			driver.findElementByAccessibilityId("������QQ������ֻ�������").click();
			Thread.sleep(3000);
			driver.findElementByAccessibilityId("������QQ������ֻ�������").sendKeys(str1);
			Thread.sleep(3000);
			driver.findElementByAccessibilityId("���� ��ȫ").click();
			Thread.sleep(3000);
			driver.findElementByAccessibilityId("���� ��ȫ").sendKeys(str2);
			Thread.sleep(3000);
		}
		driver.findElementByAccessibilityId("�� ¼").click();
		Thread.sleep(10000);
		

	}

}