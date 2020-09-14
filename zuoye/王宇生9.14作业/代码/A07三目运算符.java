package maker1;
import java.util.Scanner;
public class A07三目运算符 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		案例:从控制台输入三次整数,然后打印出最大的数值
		Scanner input=new Scanner(System.in);
		System.out.print("输入第1个数：");
		int a=input.nextInt();
		System.out.print("输入第2个数：");
		int b=input.nextInt();
		System.out.print("输入第3个数：");
		int c=input.nextInt();
		int g=a>b?a:b;
		int g1=c>g?c:g;
		System.out.println(g1);
		
		
		
	}

}
