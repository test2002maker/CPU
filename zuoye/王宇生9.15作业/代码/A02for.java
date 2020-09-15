package maker2;
import java.util.Scanner;
public class A02for {

	public static void main(String[] args) {
//		案例:输入一个整数,然后打印0到这个整数,最后打印0到这个整数之和
		//5
		//0 1 2 3 4 5
		//15
		Scanner input=new Scanner(System.in);
		System.out.print("请输入一个数字：");
		int a=input.nextInt();
		int sum=0;
		for(int i=0;i<=a;i++) {
			System.out.println(i);
			sum+=i;
		}
		System.out.println("和为："+sum);
//		案例:n的阶乘，从外部键盘输入一个数字n
//		5
//		5*24=120
		System.out.print("请输入一个数字：");
		int n=input.nextInt();
		int ji=1;
		for(int i=1;i<=n;i++) {
			ji*=i;
		}
		System.out.print("积为："+ji);

	}

}
