package maker5;

public class A04�̳� {
	public static class Father{
//		Father(){
//			System.out.println("����father�е��޲ι��캯��");
//		}
//		Father(int a){
//			System.out.println("����father�е��вι��캯��");
//		}
		void test() {
			System.out.println("����father�е�test����");
		}
		void test02() {
			System.out.println("����father�е�test02����");
		}
		private int a=30;
		public int getA() {
			return a;
		}
	}
	
	public static class Son extends Father {
		Son(){
			super();//Father��û���޲ι���ʱʹ�ã�
			System.out.println("����son�е��޲ι��캯��");
		}
		void test() {
			super.test();
			System.out.println("����son�е�test����");
		}
		void test02() {
			System.out.println("����son�е�test02����");
		}
		void test03() {
			System.out.println(super.getA());
		}
		int setA(int b) {
			super.a=b;
			return super.a;
		}
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Son son=new Son();
		son.test();
		son.test02();
		son.test03();
		son.setA(200);
		son.test03();
		
		Father f=new Father();
		System.out.println(f.getA());//20

	}

}
