package maker1;

public class A05����� {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
//		���������
		int a=40;
		int b=20;
		int c=a+b;
		int c1=a-b;
		int c2=a*b;
		int c3=a/b;
		int c4=a%b;
		c4++;
		--c4;
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
//		��ֵ�����
		int x=10;
		x+=35;
		x-=2;
		x*=4;
		x/=6;
		x%=7;
		System.out.println(x);
		
//		�Ƚ������
		int y=30;
		int z=20;
		System.out.println(y==z);
		System.out.println(y>=z);
		System.out.println(y<=z);
		System.out.println(y<z);
		System.out.println(y>z);
		System.out.println(y!=z);
		
//		�߼������
		boolean d=true;
		boolean f=false;
		System.out.println(d&f);
		System.out.println(d&&f);
		System.out.println(d|f);
		System.out.println(d||f);
		System.out.println(d^f);
		System.out.println(!f);
		
//		�߼�λ����
		int h=20;//0001 0100
		int j=30;//0001 1110
		System.out.println(h&j);
		System.out.println(h|j);
		System.out.println(h^j);//������Ϊ0������Ϊ1;
		
//		instanceof�����ж�һ��ʵ���Ƿ���ĸ��������ɵ�
		System.out.println("ewr" instanceof String);//t
		
		
	}

}
