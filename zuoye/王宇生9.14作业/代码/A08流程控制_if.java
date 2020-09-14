package maker1;
import java.util.Scanner;
public class A08流程控制_if {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		boolean a=50>40;
		if(a){//只能填布尔类型或返回布尔类型的表达式
			System.out.println("dsjngdh");
		}
//		案例:从控制台输入一个数据,用变量a接收,如这个变量大于10,就打印"输入的数据大于10"
		Scanner input=new Scanner(System.in);
		System.out.print("输入一个数据：");
		int i=input.nextInt();
		if(i>10) {
			System.out.printf("%d大于10",i);
		}else if(i==10){
			System.out.printf("%d等于10",i);
		}else {
			System.out.printf("%d小于10\n",i);
		}
		

//		案例:从控制台输入三次整数,然后打印出最大的数值
		System.out.print("输入第一个数：");
		int j=input.nextInt();
		System.out.print("输入第二个数：");
		int k=input.nextInt();
		System.out.print("输入第三个数：");
		int l=input.nextInt();
		if(j>k) {
			if(j>l) {
				System.out.println(j);
			}else {
				System.out.println(l);
			}
		}else {
			if(k>l) {
				System.out.println(k);
			}else {
				System.out.println(l);
			}
		}
		
//		案例:输入月份，输出对应的季节：
//		1~3--春季
//		4~6--夏季
//		7~9--秋季
//		10~12--冬季
		System.out.print("输入月份：");
		int m=input.nextInt();
		if(1<=m&&m<=3){
			System.out.println("春季");
		}else if(4<=m&&m<=6){
			System.out.println("夏季");
		}else if(7<=m&&m<=9){
			System.out.println("秋季");
		}else if(10<=m&&m<=12){
			System.out.println("冬季");
		}else {
			System.out.println("错误月份");
		}

		
		
		
		
	}

}
