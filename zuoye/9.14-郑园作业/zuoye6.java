package z914;
import java.util.*;
//��.�����:
//������,���趨һ������,Ȼ��ӿ���̨����һ������,
//������趨�����ִ�,��ʾ����������ִ���,������������С��,
//��ʾ�����������С��,���������ȷ,��ʾ�����������ȷ
public class zuoye6 {
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner scan=new Scanner(System.in);
		System.out.println("������һ�����֣�");
		int a=scan.nextInt();
		int b=10;
		if(a>b) {
			System.out.println("��������ִ���");
		}else if(a<b) {
			System.out.println("���������С��");
		}else {
			System.out.println("����������ȷ");
		}
	}
}
