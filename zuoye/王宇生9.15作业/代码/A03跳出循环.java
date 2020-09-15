package maker2;

public class A03跳出循环 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		haha:for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				if (j%2==0) {
					continue haha;
				}
				System.out.printf("%d×%d=%d\t",j,i,i*j);
			}
			System.out.println("");
		}
	}

}
