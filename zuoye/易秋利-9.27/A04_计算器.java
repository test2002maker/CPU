package day03;

import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Time;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;

public class A04_������ {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities des=new DesiredCapabilities();
		des.setCapability("platformName","android");//�趨�豸��ƽ̨
		des.setCapability("deviceName", "Android Emulator");//�豸��
		des.setCapability("platformVersion", "4.4.2");//ƽ̨�汾
		des.setCapability("noReset", true);//��Ҫ�ٴ���װAPP
		des.setCapability("appPackage", "com.android.calculator2");//����
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
		//��ʾ��
		String s=dr.findElementByClassName("android.widget.EditText").getAttribute("text");
		System.out.print(s);
		
		
		
		
		

	}

}
