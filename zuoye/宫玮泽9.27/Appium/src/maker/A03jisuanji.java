package maker;

import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

public class A03jisuanji {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities des = new DesiredCapabilities();
			des.setCapability("platformName","Android");//指定平台是android
			des.setCapability("deviceName","Android Emulator");//指定的是模拟器
			des.setCapability("platformVersion","4.4.4");//指定平台的版本号
			des.setCapability("appPackage","com.lilysgame.calculatorjw");//指定要测试的应用的包名
			des.setCapability("appActivity","com.lilysgame.calculator.MainActivity");//指定入口页面
		
		//创建DesiredCapabilities的对象
		DesiredCapabilities des1 = new DesiredCapabilities();
		//des的方法setCapability（）设置键值对
		des1.setCapability("platformName", "Android");
		des1.setCapability("deviceName", "Android Emulator");
		des1.setCapability("platformVersion", "4.4.4");
		//再添加一个键值对，不让app每次测试都重置一遍
		des1.setCapability("noReset", true);
		des1.setCapability("appPackage", "com.lilysgame.calculatorjw");
		des1.setCapability("appActivity","com.lilysgame.calculator.MainActivity");
		
		//创建Appium的对象
		AppiumDriver driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),des1);
		//设置一个全局等待的方法,要全局等待10s
		Thread.sleep(5000);
		//到目前为止，就已经能够连接上app啦，driver就可以对app进行操作啦
		//定位元素的语句，要指定id属性定位到元素并对其进行操作
		//定位到计算器的按键1，并点击
		//driver.findElementById("com.lilysgame.calculatorjw:id/btnOne").click();
		
		//使用class属性定位按键1,但是由于所有的按键都是一个class name，就点了默认的del,一般不用
		//driver.findElementByClassName("android.widget.Button").click();
		
		//通过text属性定位到元素
		//driver.findElementByAndroidUIAutomator("text(\"5\")").click();
		
		//通过xpath定位页面元素
		driver.findElementByXPath("//*[@resource-id='com.lilysgame.calculatorjw:id/btnOne']").click();
		//在点击完成1按键之后，等待5秒
		//Thread.sleep(5000);
		//点击+
		driver.findElementById("com.lilysgame.calculatorjw:id/btnAdd").click();
		//点击2
		driver.findElementById("com.lilysgame.calculatorjw:id/btnTwo").click();
		//点等号
		driver.findElementById("com.lilysgame.calculatorjw:id/btnEqual").click();
		//定义预期结果变量
		String expectValue = "7";
		//获取实际结果，使用getAttribute("text")
		String acutalValue = driver.findElementById("com.lilysgame.calculatorjw:id/et_show").getAttribute("text");
		
		//判断是否相等
		if(expectValue.equals(acutalValue)){
			System.out.println("加法运算实现是对的");
		}else{
			System.out.println("加法运算实现是错误的");
		}
	}

}