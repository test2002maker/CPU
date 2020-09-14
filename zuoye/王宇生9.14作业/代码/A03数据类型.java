package maker1;

public class A03数据类型 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		byte a=20;
//		byte a1=200;超出范围
		
		short b=5000;
//		short b1=40000;超出范围
		
		int c=595959;
//		int c1=5959599595;超出范围,常用
		
		long d=324235532;
//		long d1=2352464363;超出范围
		
//		单精度,超长保留.后六位
		float e=20.32484567f;
//		双精度,常用，超长保留.后14位
		double f=23.45233464565677;
		System.out.println(e);
		System.out.println(f);
		
//		字符型
		char g='w';
//		char g1='ewrew';多个字符报错
//		char g2="d";双引号报错
		
//		布尔型
		boolean h=true;
//		boolean h1=1;不能用1和0表示
		
//		字符串
		String i="wt";
//		String i1='ewrrew';单引号报错
		System.out.println(i);
		
		String.valueOf(c);
		System.out.println(c);
		

	}

}
