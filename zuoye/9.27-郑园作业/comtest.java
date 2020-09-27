package appium01;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
public class comtest{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		//创建DesiredCapabilities的对象
		DesiredCapabilities d= new DesiredCapabilities();
		//des的方法setCapability（）设置键值对
		d.setCapability("platformName", "Android");
		d.setCapability("deviceName", "Android Emulator");
		d.setCapability("platformVersion", "4.4.4");
		//再添加一个键值对，不让app每次测试都重置一遍
		d.setCapability("noReset", true);
		d.setCapability("appPackage", "com.lilysgame.calculatorjw");
		d.setCapability("appActivity","com.lilysgame.calculator.MainActivity");
		//创建Appium的对象
		AppiumDriver dr=new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),d);
		//设置一个全局等待的方法,要全局等待10s
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//到目前为止，就已经能够连接上app啦，driver就可以对app进行操作啦
		//定位元素的语句，要指定id属性定位到元素并对其进行操作
		//通过xpath定位页面元素
		dr.findElementByXPath("//*[@resource-id='com.lilysgame.calculatorjw:id/btnOne']").click();
		//在点击完成1按键之后，等待5秒
		//Thread.sleep(5000);
		//点击+
		dr.findElementById("com.lilysgame.calculatorjw:id/btnAdd").click();
		//点击2
		dr.findElementById("com.lilysgame.calculatorjw:id/btnTwo").click();
		//点等号
		dr.findElementById("com.lilysgame.calculatorjw:id/btnEqual").click();
		//定义预期结果变量
		String expectValue="7";
		//获取实际结果，使用getAttribute("text")
		String s=dr.findElementById("com.lilysgame.calculatorjw:id/et_show").getAttribute("text");
		//判断是否相等
		if(expectValue.equals(s)){
			System.out.println("加法运算实现是对的");
		}else{
			System.out.println("加法运算实现是错误的");
		}
	}

}