package homework9_17;

import java.util.Scanner;

public class Game_user {
//	6.��дһ����Ϸ������,�����ļ���д,
//	��Ϸ���������������,����,����,�Ա�,д����Щ���Ե�getter��setter����,
//	������Ա�Ҫ������ܸ�ֵ
	Scanner input=new Scanner(System.in);
	private String name="�Ÿ�����";
	private String sex="��";
	private int age=18;
	private String sect="�찲��";
	
	
	//��ȡ����
	String getName() {
		return name;
	}
	String getSex() {
		return sex;
	}
	int getAge() {
		return age;
	}
	String getSect() {
		return sect;
	}
	
	//�޸�����
	String setName() {
		System.out.print("������Ҫ�޸ĵ�������");
		String setname=input.next();
		name=setname;
		return name;
	}
	
	String setSex() {
		System.out.print("������Ҫ�޸ĵ��Ա�");
		String mysex=input.next();
		if(mysex.equals("��") || mysex.equals("Ů")) {
			sex=mysex;
		}else {
			System.out.println("�Ա���д����");
		}
		return sex;
	}
	
	int setAge() {
		System.out.print("������Ҫ�޸ĵ����䣺");
		int setage=input.nextInt();
		if(0<=setage && setage<=140) {
			age=setage;
		}else{
			System.out.println("���䳬����Χ��");
		}
		return age;
	}
	
	String setSect() {
		System.out.print("������Ҫ�޸ĵ����ɣ�");
		String setsect=input.next();
		sect=setsect;
		return sect;
	}

}
