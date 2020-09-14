package z914;
import java.util.*;
//六.编程题:
//猜数字,先设定一个数字,然后从控制台输入一个数字,
//如果比设定的数字大,提示你输入的数字大了,如果输入的数字小了,
//显示你输入的数字小了,如果输入正确,显示输入的数字正确
public class zuoye6 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入一个数字：");
		int a=scan.nextInt();
		int b=10;
		if(a>b) {
			System.out.println("输入的数字大了");
		}else if(a<b) {
			System.out.println("输入的数字小了");
		}else {
			System.out.println("输入数字正确");
		}
	}
}
