package test5;

public class J04_super {
//	1.������û���޲ι���ʱ,������ʱ�������˶���,����������Ĺ��캯����ʹ��super���ø���Ĺ��캯��
	public static class Father {
		Father(int a) {//���������вι��캯��,�����������ṩ�޲ι���
			System.out.println("Father�еĹ��캯��");
			System.out.println("a="+a);
		}
		void test() {
			System.out.println("Father��test����");
		}
		private int aa=20;
		
		int getAge() {
			return aa;
		}
	}
	
	public static class Son extends Father{
		Son() {//2.super����д������Ĺ��캯����һ��
			super(30);//���ø�����вι���
		}
		//3.������͸�����ͬ����Աʱ,���ȵ��������,������ʹ��super���ôӸ���̳й����ĳ�Ա
		void test() {
			System.out.println("Son�е�test����");
		}
		
		void test01() {
			System.out.println("Son�е�test01����");
			super.test();//���ø����ͬ������
		}
		
		void test02() {
			System.err.println(super.aa);//aa�������,�ǴӸ���̳е�
		}
		
		void setAA(int AA) {
			super.aa=AA;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son son=new Son();
		son.test();
		son.test01();
		
		//4.����Ӹ���̳й�����˽�б���֤��
		son.test02();//20
		son.setAA(100);
		son.test02();//100
		System.out.println("------------");
		
		Father f=new Father(10);
		System.out.println(f.getAge());//20

	}

}
