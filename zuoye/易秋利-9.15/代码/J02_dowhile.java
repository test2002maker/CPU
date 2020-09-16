package test2;

public class J02_dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		案例:输出1-100的单数
//		int a=1;
//		do {
//			if (a%2!=0) {
//				System.out.print(a+" ");
//			}
//			a++;
//		} while (a<=100);
		
		
//			案例:使用while嵌套循环打印如下图形
//			*
//			* *
//			* * *
//			* * * *
//			* * * * *
		int b=1;//行数
		do {
//			for (int i = 0; i < b; i++) {
//				System.out.print('*');
//			}
			int i=0;
			while (i<b) {
				System.out.print('*');
				i+=1;
			}
			System.out.println();
			b+=1;
		} while (b<=5);
		

	}

}
