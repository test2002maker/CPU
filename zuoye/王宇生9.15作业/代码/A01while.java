package maker2;

public class A01while {

	public static void main(String[] args) {
		
		int a=10;
		while(a<=20) {
			System.out.println(a);
			a++;
		}
//		����:С��������ÿ�����2.5ԪǮ������������������ǣ�ÿ����һ���Ǵ�Ǯ�ĵ�5�����5�ı����Ļ���
//		�����Ứȥ6ԪǮ�����ʣ����������죬С���ſ��Դ浽100ԪǮ��
		float money=0;
		int day=0;
		while(money<100) {
			money+=2.5;
			day++;
			if(day%5==0) {
				money-=6;
			}
		}
		System.out.println("����Ϊ��"+day);
		System.out.println("Ǯ��Ϊ��"+money);
		
//		����:���1-100�ĵ���
		int b=0;
		do {
			if (b%2==1){
				System.out.println(b);
			}
			b++;
		}while(b<=100);
		
//		����:ʹ��whileǶ��ѭ����ӡ����ͼ��
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
