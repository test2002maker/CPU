package d4;
import bb02.BB02����;

public class A03����Ȩ�� {
	protected static void test() {
		System.out.println("���Ǳ���Ȩ�޵�test");
		
	}
	protected static int a=10;
		
	public static void main(String[] args) {
		//1.���ñ��ļ��ı�����Ա
		B02���� m=new B02����();
		m.test02();
		System.out.println(m.b);
		//3.������һ�����е�����ı�����Ա
		BB02���� m2 = new BB02����();
		//m2.tset02();//����ֱ�ӷ�����һ������ı�����Ա
		//System.out.println(m2.myb);
		//����ֱ�ӷ�����һ��������ı�����Ա
		//���Լ�ӵĵ��ø���Ĺ��г�Ա�����ñ�����Ա
		m2.test003();
	System.out.println(m2.getMyb());
	//4.ͨ������BB02������������еĹ��г�Ա����ӵ���BB02�������еı�����Ա
		aa m3 = new aa();
		m3.test022();
	}
}
