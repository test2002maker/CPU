package z914;
import java.util.*;
public class test999 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//三目运算符
		int m=22;
		int n=33;
		int a=m>n?m:n;
		System.out.println(a);
//		案例:从控制台输入三次整数,然后打印出最大的数值
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入第一个数：");
		int x=scan.nextInt();
		System.out.println("请输入第二个数：");
		int y=scan.nextInt();
		System.out.println("请输入第三个数：");
		int z=scan.nextInt();
		int b=x>y?(x>z?x:z):(y>z?y:z);
		System.out.println(b);
//		if语句
		int a1=10;
		if(a1==10) {//为true方能进入
			System.out.println("我是if里面的语句");
		}
		int b1=10;
		int c1=20;
		if(b1>c1) {
			System.out.println("我是if里面的语句");
		}
//		if else-if else语句
		int m1=22;
		int n1=33;
		if(m1>n1) {
			System.out.println("m1>n1");
		}else if(m1<n1) {
			System.out.println("m1<n1");
		}else {
			System.out.println("m1==n1");
		}
//		switch语句
		int x1=99;
		switch(x1) {
		case 99:
			System.out.println("99");
			break;
		case 88:
			System.out.println("88");
			break;
		case 77:
			System.out.println("77");
			break;
		default:
			System.out.println("其他");
			break;
		}
	}
	
}
