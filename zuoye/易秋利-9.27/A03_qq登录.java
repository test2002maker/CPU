package day03;

import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

public class A03_qq��¼ {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		//����appium�Ĳ���
		DesiredCapabilities des=new DesiredCapabilities();
		des.setCapability("platformName","android");//�趨�豸��ƽ̨
		des.setCapability("deviceName", "Android Emulator");//�豸��
		des.setCapability("platformVersion", "4.4.4");//ƽ̨�汾
		des.setCapability("noReset", true);//��Ҫ�ٴ���װAPP
		des.setCapability("appPackage", "com.tencent.qqlite");//����
		des.setCapability("appActivity", "com.tencent.mobileqq.activity.RegisterGuideActivity");
		
		//����appium����
		AppiumDriver dr=new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), des);
		Thread.sleep(5000);
		//��λԪ��
		String[] arr={"12345"};//�˺�
		String[] arr1={"ishiwp340"};
		dr.findElementById("com.tencent.qqlite:id/btn_login").click();
		Thread.sleep(5000);
		dr.findElementByAccessibilityId("������QQ������ֻ�������").click();
		dr.findElementByAccessibilityId("������QQ������ֻ�������").clear();
		dr.findElementByAccessibilityId("������QQ������ֻ�������").sendKeys(arr);//�����˺�
		dr.findElementByAccessibilityId("����������").click();
		dr.findElementByAccessibilityId("����������").sendKeys(arr1);//��������
		dr.findElementById("com.tencent.qqlite:id/login").click();
		
	}

}
