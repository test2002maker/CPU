package maker1;
import java.util.Scanner;
public class A09流程控制_switch {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input=new Scanner(System.in);
		System.out.print("输入数值：");
		int a=input.nextInt();
		switch(a){
			case 1:
				System.out.println("hahah");
				break;
			case 2:
				System.out.println("heheheh");
				break;
			case 3:
				System.out.println("gagagagga");
				break;
			default:
				System.out.println("error");
				break;
		}

//		案例:定义两个整型变量,然后从控制台获取一个字符,如果是+那么这两个变量就相加,输入什么符号就对应运算什么
//		//从控制台获取一个字符
		int a1=10;
		int a2=20;
		System.out.printf("请输入符号：");
		char j=input.next().charAt(0);
		switch(j) {
			case '+':
				System.out.printf("和为：%d\n",a1+a2);
				break;
			case '-':
				System.out.printf("差为：%d\n",a1-a2);
				break;
			case '*':
				System.out.printf("积为：%d\n",a1*a2);
				break;
			case '/':
				System.out.printf("商为：%d\n",a1/a2);
				break;
			case '%':
				System.out.printf("余数为：%d\n",a1%a2);
				break;
			default:
				System.out.println("错误符号");
				break;
		}
		
		
		
		
		
		
	}

}
