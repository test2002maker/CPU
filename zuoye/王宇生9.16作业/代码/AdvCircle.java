package maker3;

public class AdvCircle{
//	����:���һ��Բ���ࣨAdvCircle������һ�����ࣨPoint����������Բ�Ĺ�ϵ��
//	����Բ������Ϊx0, y0, �뾶Ϊr���������Ϊx1, y1��
//	1������Բ�ϣ�(x1-x0)*(x1-x0) + (y1-y0)*(y1-y0) == r*r
//	2������Բ�ڣ�(x1-x0)*(x1-x0) + (y1-y0)*(y1-y0) < r*r
//	3������Բ�⣺(x1-x0)*(x1-x0) + (y1-y0)*(y1-y0) > r*r
	double a_x;
	double a_y;
	double a_r;
	
	void set_Ad(double x,double y,double r){
		a_x=x;
		a_y=y;
		a_r=r;
	}
	
}

