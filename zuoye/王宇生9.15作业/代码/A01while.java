package maker2;

public class A01while {

	public static void main(String[] args) {
		
		int a=10;
		while(a<=20) {
			System.out.println(a);
			a++;
		}
//		案例:小芳的妈妈每天给她2.5元钱，她都会存起来，但是，每当这一天是存钱的第5天或者5的倍数的话，
//		她都会花去6元钱，请问，经过多少天，小芳才可以存到100元钱。
		float money=0;
		int day=0;
		while(money<100) {
			money+=2.5;
			day++;
			if(day%5==0) {
				money-=6;
			}
		}
		System.out.println("天数为："+day);
		System.out.println("钱数为："+money);
		
//		案例:输出1-100的单数
		int b=0;
		do {
			if (b%2==1){
				System.out.println(b);
			}
			b++;
		}while(b<=100);
		
//		案例:使用while嵌套循环打印如下图形
//		*
//		* *
//		* * *
//		* * * *
//		* * * * *
		int i=0;
		while(i<5) {
			int j=0;
			while (j<=i) {
				System.out.print("* ");
				j++;
			}
			i++;
			System.out.println("");
		}

	}

}
