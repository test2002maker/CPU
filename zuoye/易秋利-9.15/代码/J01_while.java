package test2;

public class J01_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		����:С��������ÿ�����2.5ԪǮ������������������ǣ�ÿ����һ���Ǵ�Ǯ�ĵ�5�����5�ı����Ļ���
//		�����Ứȥ6ԪǮ�����ʣ����������죬С���ſ��Դ浽100ԪǮ��
		/*
		 * 1.����洢Ǯ��������ӡ100,��ô������ѭ��
		 * 2.day%5==0  Ǯ-6
		 */
		int day=0;  //����
		double m=0; //Ǯ
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
