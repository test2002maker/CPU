package d6;

import org.omg.CORBA.PUBLIC_MEMBER;

public class ½Ó¿Ú¼Ì³Ð {
	interface Son extends B01maker1,B02maker2{
		void printson();
	}
	public static class SonSon implements Son{
		public void printson() {
			System.out.println("Son");
		}
		public void printmaker1() {
			System.out.println("MAKER1");
		}
		public void printmaker2() {
			System.out.println("MAKER2");
		}
		
	}
	public static void main(String[] args) {
		
	}

}
