package test2;

public class J02_dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		����:���1-100�ĵ���
//		int a=1;
//		do {
//			if (a%2!=0) {
//				System.out.print(a+" ");
//			}
//			a++;
//		} while (a<=100);
		
		
//			����:ʹ��whileǶ��ѭ����ӡ����ͼ��
//			*
//			* *
//			* * *
//			* * * *
//			* * * * *
		int b=1;//����
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
