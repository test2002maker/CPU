package d6;

public class �ӿ� {
	interface jk{
		int a=30;
		void test00();
		void test01();
		void test02();
		void test03();
	}
	interface jk1{
		int b=30;
		void test04();
		void test05();
		void test06();
		void test07();
	}
	public static class FF1 implements jk,jk1 {
		public void test00() {
			System.out.println("���ǽӿ��е�test00");
		}
		public void test01() {
			System.out.println("���ǽӿ��е�test01");
		}
		public void test02() {
			System.out.println("���ǽӿ��е�test02");
		}
		public void test03() {
			System.out.println("���ǽӿ��е�test03");
		}
		public void test04() {
			System.out.println("���ǽӿ��е�test04");
		}
		public void test05() {
			System.out.println("���ǽӿ��е�test05");
		}
		public void test06() {
			System.out.println("���ǽӿ��е�test06");
		}
		public void test07() {
			System.out.println("���ǽӿ��е�test07");
		}
	}
	public static void main(String[] args) {
		FF1 f = new FF1();
		f.test00();
		f.test01();
		f.test02();
		f.test03();
		f.test04();
		f.test05();
		f.test06();
		f.test07();
		System.out.println(f.a);
		System.out.println(f.b);
	}
}
