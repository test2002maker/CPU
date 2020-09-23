package test4;

public class J06_私有权限 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//同文件中
		test();
		System.out.println(a);
		//同包中,不能访问私有成员
		J06_私有 a=new J06_私有();
		

	}
	
	private static void test() {
		System.out.println("私有成员");
	}
	private static int a=10;

}
