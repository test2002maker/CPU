package maker2;
import java.util.Scanner;
public class A02for {

	public static void main(String[] args) {
//		����:����һ������,Ȼ���ӡ0���������,����ӡ0���������֮��
		//5
		//0 1 2 3 4 5
		//15
		Scanner input=new Scanner(System.in);
		System.out.print("������һ�����֣�");
		int a=input.nextInt();
		int sum=0;
		for(int i=0;i<=a;i++) {
			System.out.println(i);
			sum+=i;
		}
		System.out.println("��Ϊ��"+sum);
//		����:n�Ľ׳ˣ����ⲿ��������һ������n
//		5
//		5*24=120
		System.out.print("������һ�����֣�");
		int n=input.nextInt();
		int ji=1;
		for(int i=1;i<=n;i++) {
			ji*=i;
		}
		System.out.print("��Ϊ��"+ji);

	}

}
