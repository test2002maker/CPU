package maker2;
import java.util.Random;
public class A04Ëæ»úÊı {

	public static void main(String[] args) {
		int i=0;
		while(true) {
			i=(int)(Math.random()*20);
			if (i==10) {
				System.out.println("½áÊø");
				break;
			}
			System.out.println(i);
		}
		
		Random ran=new Random();
		System.out.println(ran.nextInt(20));
		
		System.out.println(Math.abs(-10));
		System.out.println(Math.pow(9, 6));
		System.out.println(Math.tan(2));
		System.out.println(Math.sqrt(3456));

	}

}
