package test2;

public class J01_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		案例:小芳的妈妈每天给她2.5元钱，她都会存起来，但是，每当这一天是存钱的第5天或者5的倍数的话，
//		她都会花去6元钱，请问，经过多少天，小芳才可以存到100元钱。
		/*
		 * 1.如果存储钱的数量打印100,那么就跳出循环
		 * 2.day%5==0  钱-6
		 */
		int day=0;  //天数
		double m=0; //钱
		while (m<=100) {//m<100
			day++;
			m+=2.5;
			if (day%5==0) {
				m-=6;
			}
			
		}
		System.out.println(day);
		System.out.println(m);

	}

}
