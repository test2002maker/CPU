package maker4;
import java.util.Scanner;
public class User {
	//案例:设计一个用户类,类里有私有成员姓名和密码,电话号码.设计这三个私有属性的setter和getter函数
			//其中修改密码需要验证电话号码
	Scanner input=new Scanner(System.in);
	private String name="xiaowang";
	private String passwd="heiheihei";
	private String phone="12345678912";
	
	//获取属性
	String getName() {
		return name;
	}
	String getPwd() {
		return passwd;
	}
	String getPhone() {
		return phone;
	}
	
	//修改属性
	String setName() {
		System.out.print("请输入要修改的姓名：");
		String setname=input.next();
		name=setname;
		return name;
	}
	String setPwd() {
		System.out.print("请验证电话号码：");
		String myphone=input.next();
		if(myphone.equals(phone)) {
			System.out.print("请输入要修改的密码：");
			String setpwd=input.next();
			passwd=setpwd;
		}else {
			System.out.println("电话号码错误，不可修改密码！");
		}
		return passwd;
	}
	String setPhone() {
		System.out.print("请输入要修改的电话号码：");
		String setphone=input.next();
		phone=setphone;
		return phone;
	}
	
}
