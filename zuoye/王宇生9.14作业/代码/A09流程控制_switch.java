package maker1;
import java.util.Scanner;
public class A09���̿���_switch {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner input=new Scanner(System.in);
		System.out.print("������ֵ��");
		int a=input.nextInt();
		switch(a){
			case 1:
				System.out.println("hahah");
				break;
			case 2:
				System.out.println("heheheh");
				break;
			case 3:
				System.out.println("gagagagga");
				break;
			default:
				System.out.println("error");
				break;
		}

//		����:�����������ͱ���,Ȼ��ӿ���̨��ȡһ���ַ�,�����+��ô���������������,����ʲô���žͶ�Ӧ����ʲô
//		//�ӿ���̨��ȡһ���ַ�
		int a1=10;
		int a2=20;
		System.out.printf("��������ţ�");
		char j=input.next().charAt(0);
		switch(j) {
			case '+':
				System.out.printf("��Ϊ��%d\n",a1+a2);
				break;
			case '-':
				System.out.printf("��Ϊ��%d\n",a1-a2);
				break;
			case '*':
				System.out.printf("��Ϊ��%d\n",a1*a2);
				break;
			case '/':
				System.out.printf("��Ϊ��%d\n",a1/a2);
				break;
			case '%':
				System.out.printf("����Ϊ��%d\n",a1%a2);
				break;
			default:
				System.out.println("�������");
				break;
		}
		
		
		
		
		
		
	}

}
