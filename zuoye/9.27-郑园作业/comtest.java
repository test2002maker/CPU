package appium01;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
public class comtest{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		//����DesiredCapabilities�Ķ���
		DesiredCapabilities d= new DesiredCapabilities();
		//des�ķ���setCapability�������ü�ֵ��
		d.setCapability("platformName", "Android");
		d.setCapability("deviceName", "Android Emulator");
		d.setCapability("platformVersion", "4.4.4");
		//�����һ����ֵ�ԣ�����appÿ�β��Զ�����һ��
		d.setCapability("noReset", true);
		d.setCapability("appPackage", "com.lilysgame.calculatorjw");
		d.setCapability("appActivity","com.lilysgame.calculator.MainActivity");
		//����Appium�Ķ���
		AppiumDriver dr=new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),d);
		//����һ��ȫ�ֵȴ��ķ���,Ҫȫ�ֵȴ�10s
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//��ĿǰΪֹ�����Ѿ��ܹ�������app����driver�Ϳ��Զ�app���в�����
		//��λԪ�ص���䣬Ҫָ��id���Զ�λ��Ԫ�ز�������в���
		//ͨ��xpath��λҳ��Ԫ��
		dr.findElementByXPath("//*[@resource-id='com.lilysgame.calculatorjw:id/btnOne']").click();
		//�ڵ�����1����֮�󣬵ȴ�5��
		//Thread.sleep(5000);
		//���+
		dr.findElementById("com.lilysgame.calculatorjw:id/btnAdd").click();
		//���2
		dr.findElementById("com.lilysgame.calculatorjw:id/btnTwo").click();
		//��Ⱥ�
		dr.findElementById("com.lilysgame.calculatorjw:id/btnEqual").click();
		//����Ԥ�ڽ������
		String expectValue="7";
		//��ȡʵ�ʽ����ʹ��getAttribute("text")
		String s=dr.findElementById("com.lilysgame.calculatorjw:id/et_show").getAttribute("text");
		//�ж��Ƿ����
		if(expectValue.equals(s)){
			System.out.println("�ӷ�����ʵ���ǶԵ�");
		}else{
			System.out.println("�ӷ�����ʵ���Ǵ����");
		}
	}

}