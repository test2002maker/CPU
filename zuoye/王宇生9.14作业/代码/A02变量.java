package maker1;

public class A02变量 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a;
		a=10;
		int b=10;
		System.out.println("sum="+(b+a));
		System.out.println("cha="+(b-a));
		
		int c1,c2,c3;
		c1=5;
		c2=25;
		c3=125;
		System.out.printf("sum(c1,c2)=%d\n"+"cha(c3,c2)=%d\n"+"ji(c1,c2)=%d\n", (c1+c2), (c3-c2), (c1*c2));
		
		int d1,d2,d3;
		d1=10;
		d2=20;
		d3=40;
		System.out.println("d1="+d1+"	"+"d2="+d2+"	"+"d3="+(d3/d1));
		d3=d3/d2;
		System.out.printf("d3=%d", d3);
		


	}
}
