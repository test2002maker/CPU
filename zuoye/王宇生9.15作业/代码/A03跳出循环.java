package maker2;

public class A03����ѭ�� {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		haha:for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				if (j%2==0) {
					continue haha;
				}
				System.out.printf("%d��%d=%d\t",j,i,i*j);
			}
			System.out.println("");
		}
	}

}
