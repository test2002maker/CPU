package test1;

import java.util.Scanner;

public class J09_ifelseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		°¸Àý:ÊäÈëÔÂ·Ý£¬Êä³ö¶ÔÓ¦µÄ¼¾½Ú£º
//		1~3--´º¼¾
//		4~6--ÏÄ¼¾
//		7~9--Çï¼¾
//		10~12--¶¬¼¾
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ÊäÈëÔÂ·Ý:");
		int month=sc.nextInt();
//		if (month>=1 && month<=3) {
//			System.out.println("´º¼¾");
//		}else if (month>=4 && month<=6) {
//			System.out.println("ÏÄ¼¾");
//		}else if (month>=7 && month<=9) {
//			System.out.println("Çï¼¾");
//		}else if (month>=10 && month<=12) {
//			System.out.println("¶¬¼¾");
//		}else {
//			System.out.println("ÊäÈë´íÎó");
//		}
		
		
		switch(month) {
		case 1:
		case 2:
		case 3:
			System.out.println("´º¼¾");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("ÏÄ¼¾");
			break;
		case 7:
		case 8:
		case 9:
			System.out.println("Çï¼¾");
			break;
		case 10:
		case 11:
		case 12:
			System.out.println("¶¬¼¾");
			break;
		default:
			System.out.println("ÊäÈë´íÎó");
			break;
			
		}

	}

}
