package maker6;

public class A05static {
//	����:����10��ĳ������,��������һ��������������ú��������ö��ٴ�
	static int a=0;
	static void test() {
		a++;
	}
	public static void main(String[] qwe) {
		for(int i=0;i<10;i++) {
			test();
		}
		System.out.println(a);
	}

}
