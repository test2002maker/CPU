package d4;
import java.util.Scanner;
public class zuoye {
	Scanner input = new Scanner(System.in);
	private String name = "����";
	private String sex = "Ů";
	private int age = 12;
	private String mp = "���Ͱ���";
	String getName() {
		return name;
	}
	String getSex() {
		return sex;
	}
	int getAge() {
		return age;
	}
	String getMp() {
		return mp;
	}
	//�޸�����
	String setName() {
		System.out.println("������Ҫ�޸ĵ�������");
		String setname = input.next();
		name = setname;
		return name;
	}
	String setMp() {
		System.out.println("������Ҫ�޸ĵ����ɣ�");
		String setmp = input.next();
		mp = setmp;
		return mp;
	}
	int setAge() {
		System.out.println("������Ҫ�޸ĵ����䣺");
		int setage = input.nextInt();
		if(0<=setage && setage<=140) {
			age = setage;
		}else {
			System.out.println("�������");
		}
		return age;
	}
	String setSex() {
		System.out.println("������Ҫ�޸ĵ��Ա�");
		String setmp = input.next();
		if (setmp.equals("��")||setmp.equals("Ů")) {
			
			mp = setmp;
		}else {
			System.out.println("�������");
		}
		
		return mp;
	}
}
