package maker;

import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

public class A03jisuanji {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities des = new DesiredCapabilities();
			des.setCapability("platformName","Android");//ָ��ƽ̨��android
			des.setCapability("deviceName","Android Emulator");//ָ������ģ����
			des.setCapability("platformVersion","4.4.4");//ָ��ƽ̨�İ汾��
			des.setCapability("appPackage","com.lilysgame.calculatorjw");//ָ��Ҫ���Ե�Ӧ�õİ���
			des.setCapability("appActivity","com.lilysgame.calculator.MainActivity");//ָ�����ҳ��
		
		//����DesiredCapabilities�Ķ���
		DesiredCapabilities des1 = new DesiredCapabilities();
		//des�ķ���setCapability�������ü�ֵ��
		des1.setCapability("platformName", "Android");
		des1.setCapability("deviceName", "Android Emulator");
		des1.setCapability("platformVersion", "4.4.4");
		//�����һ����ֵ�ԣ�����appÿ�β��Զ�����һ��
		des1.setCapability("noReset", true);
		des1.setCapability("appPackage", "com.lilysgame.calculatorjw");
		des1.setCapability("appActivity","com.lilysgame.calculator.MainActivity");
		
		//����Appium�Ķ���
		AppiumDriver driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),des1);
		//����һ��ȫ�ֵȴ��ķ���,Ҫȫ�ֵȴ�10s
		Thread.sleep(5000);
		//��ĿǰΪֹ�����Ѿ��ܹ�������app����driver�Ϳ��Զ�app���в�����
		//��λԪ�ص���䣬Ҫָ��id���Զ�λ��Ԫ�ز�������в���
		//��λ���������İ���1�������
		//driver.findElementById("com.lilysgame.calculatorjw:id/btnOne").click();
		
		//ʹ��class���Զ�λ����1,�����������еİ�������һ��class name���͵���Ĭ�ϵ�del,һ�㲻��
		//driver.findElementByClassName("android.widget.Button").click();
		
		//ͨ��text���Զ�λ��Ԫ��
		//driver.findElementByAndroidUIAutomator("text(\"5\")").click();
		
		//ͨ��xpath��λҳ��Ԫ��
		driver.findElementByXPath("//*[@resource-id='com.lilysgame.calculatorjw:id/btnOne']").click();
		//�ڵ�����1����֮�󣬵ȴ�5��
		//Thread.sleep(5000);
		//���+
		driver.findElementById("com.lilysgame.calculatorjw:id/btnAdd").click();
		//���2
		driver.findElementById("com.lilysgame.calculatorjw:id/btnTwo").click();
		//��Ⱥ�
		driver.findElementById("com.lilysgame.calculatorjw:id/btnEqual").click();
		//����Ԥ�ڽ������
		String expectValue = "7";
		//��ȡʵ�ʽ����ʹ��getAttribute("text")
		String acutalValue = driver.findElementById("com.lilysgame.calculatorjw:id/et_show").getAttribute("text");
		
		//�ж��Ƿ����
		if(expectValue.equals(acutalValue)){
			System.out.println("�ӷ�����ʵ���ǶԵ�");
		}else{
			System.out.println("�ӷ�����ʵ���Ǵ����");
		}
	}

}