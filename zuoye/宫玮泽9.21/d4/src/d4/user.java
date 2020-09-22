package d4;
import java.util.Scanner;
public class user {
	private String name="xiaowang";
	private String passwd="123";
	private String phone="123123";
	String getName() {
		return name;
		
	}
	String getPwd() {
		return passwd;
	}
	String getPhone() {
		return phone;
	}
	String setName(String a) {
		name=a;
		return name;
	}
	String setPasswd(String b) {
		Scanner input = new Scanner(String );
		passwd=b;
		return passwd;
	}
	String setPhone(String c) {
		phone=c;
		return phone;
	}
	
}
