package maker2;
import java.util.Scanner;
public class A05Êı×é {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("ÇëÊäÈë·¶Î§£º");
		int a=input.nextInt();
		int[] arr1=new int[10];
		for(int i=0;i<10;i++) {
			arr1[i]=(int)(Math.random()*50);
		}
		for(int i:arr1) {
			System.out.println(i);
		}
		System.out.println("----------------------");
		int arr2[]= {32,54,32,542,5,326,34,65,436,4,235,32,5,32,5};
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}

	}

}
