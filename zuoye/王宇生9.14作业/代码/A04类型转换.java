package maker1;

public class A04类型转换 {
	public static void main(String[] args) {
		byte a=10;
		short b=a;
		int c=b;
		long d=c;
		float e=d;
		double f=e;
		System.out.println(e);
		System.out.println(f);
//		小型转大型需要强转；结果要用户自己控制
		double g=23.432582335;
		float g1=(float)g;
		
		int h=23425;
		byte h1=(byte)h;
		System.out.println(h1);
//		byte为一字节，会抛弃超出位数的数据，转为原码
		
		boolean i=5>3;
		System.out.println(i);
		
		
	}
}
