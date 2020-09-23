package maker6;

public class A03接口继承接口 {
	interface Son extends B01maker1,B02maker2{
		void printson();
	}
	public static class SonSon implements Son{
		public void printson() {
			System.out.println("SON");
		}
		public void printmaker1() {
			System.out.println("MAKER1");
		}
		public void printmaker2() {
			System.out.println("MAKER2");
		}
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		SonSon son= new SonSon();
		son.printmaker1();
		son.printmaker2();
		son.printson();

	}

}
