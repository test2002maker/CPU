package d4;

public class relation {
	static void relation(point m,circle n) {
		if ((m.mX-n.a_x)*(m.mX-n.a_x)+(m.mY-n.a_y)*(m.mY-n.a_y)==(n.a_r)*(n.a_r)){
			System.out.println("����Բ��");
		}
		if ((m.mX-n.a_x)*(m.mX-n.a_x)+(m.mY-n.a_y)*(m.mY-n.a_y)>(n.a_r)*(n.a_r)){
			System.out.println("����Բ��");
		}
		if ((m.mX-n.a_x)*(m.mX-n.a_x)+(m.mY-n.a_y)*(m.mY-n.a_y)<(n.a_r)*(n.a_r)){
			System.out.println("����Բ��");
		}
	}
}
