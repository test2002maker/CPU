package maker4;
import java.util.Scanner;
public class User {
	//����:���һ���û���,������˽�г�Ա����������,�绰����.���������˽�����Ե�setter��getter����
			//�����޸�������Ҫ��֤�绰����
	Scanner input=new Scanner(System.in);
	private String name="xiaowang";
	private String passwd="heiheihei";
	private String phone="12345678912";
	
	//��ȡ����
	String getName() {
		return name;
	}
	String getPwd() {
		return passwd;
	}
	String getPhone() {
		return phone;
	}
	
	//�޸�����
	String setName() {
		System.out.print("������Ҫ�޸ĵ�������");
		String setname=input.next();
		name=setname;
		return name;
	}
	String setPwd() {
		System.out.print("����֤�绰���룺");
		String myphone=input.next();
		if(myphone.equals(phone)) {
			System.out.print("������Ҫ�޸ĵ����룺");
			String setpwd=input.next();
			passwd=setpwd;
		}else {
			System.out.println("�绰������󣬲����޸����룡");
		}
		return passwd;
	}
	String setPhone() {
		System.out.print("������Ҫ�޸ĵĵ绰���룺");
		String setphone=input.next();
		phone=setphone;
		return phone;
	}
	
}
