package maker2;
import java.util.Scanner;
public class A06字符数组 {

	public static void main(String[] args) {
//		字符数组可直接用println打印
//		字符串可根据下标用.charAt(下标)分为单个字符串打印
//		.length()可获取字符串长度
		String str="eyusgfs";
		System.out.println(str.charAt(0));
		System.out.println(str.length());
		
		
//		案例:从控制台输入字符串,然后把字符串中的字符存储到字符数组中,
//		然后打印出来
		Scanner input=new Scanner(System.in);
		System.out.print("请输入字符串：");
		String str1=input.next();
		int a=str1.length();
		char[] char_arr=new char[a];
		for(int i=0;i<a;i++) {
			char_arr[i]=str1.charAt(i);
		}
		System.out.println(char_arr);
		

	}

}
