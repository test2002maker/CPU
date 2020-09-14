package maker1;
//1.导包
import java.util.Scanner;
public class A06从控制台获取数据 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//2.生成一个对象
		Scanner input=new Scanner(System.in);
		System.out.print("输入a：");
		int a=input.nextInt();
		System.out.println(a);
		System.out.print("输入b：");
		float b=input.nextFloat();
		System.out.println(b);
		System.out.print("输入c：");
		String c=input.next();//不管回车
		System.out.println(c);
		System.out.print("输入d：");
		String d=input.nextLine();//会收入回车
		System.out.println(d);
		System.out.println("结束");

		
		
	}

}
