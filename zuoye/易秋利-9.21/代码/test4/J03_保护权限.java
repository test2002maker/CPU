package test4;

import test.J0031_����Ȩ��;
import test.J003_����Ȩ��;

public class J03_����Ȩ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ڱ��ļ�
		pro();
		System.out.println(a);
		
		//��ͬ����
		J003_���� b=new J003_����();
		b.test02();
		
		//�ڲ�ͬ����,ͨ���м亯��
		J003_����Ȩ�� s=new J003_����Ȩ��();
		s.ttt();
		System.out.println(s.ttt1());
		
		//��ͬ����,ͨ���̳�
		J0031_����Ȩ�� s1=new J0031_����Ȩ��();
		s1.fun();

	}
	
	protected static void pro() {
		System.out.println("����Ȩ��1,ͬ�ļ���");
	}
	
	protected static int a=10;
}
