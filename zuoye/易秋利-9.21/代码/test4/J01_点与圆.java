package test4;

public class J01_����Բ {
//	����:���һ��Բ���ࣨCircle������һ�����ࣨPoint����������Բ�Ĺ�ϵ��
//	����Բ������Ϊx0, y0, �뾶Ϊr���������Ϊx1, y1��
//	1������Բ�ϣ�(x1-x0)*(x1-x0) + (y1-y0)*(y1-y0) == r*r
//	2������Բ�ڣ�(x1-x0)*(x1-x0) + (y1-y0)*(y1-y0) < r*r
//	3������Բ�⣺(x1-x0)*(x1-x0) + (y1-y0)*(y1-y0) > r*r
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle();
		circle.setP(10, 10);
		circle.setR(8);
		Point point=new Point();
		point.setX(25);
		point.setY(20);
		circle.fun(point);
	}
	
}
