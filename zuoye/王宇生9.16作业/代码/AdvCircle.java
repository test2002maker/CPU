package maker3;

public class AdvCircle{
//	案例:设计一个圆形类（AdvCircle），和一个点类（Point），计算点和圆的关系。
//	假如圆心坐标为x0, y0, 半径为r，点的坐标为x1, y1：
//	1）点在圆上：(x1-x0)*(x1-x0) + (y1-y0)*(y1-y0) == r*r
//	2）点在圆内：(x1-x0)*(x1-x0) + (y1-y0)*(y1-y0) < r*r
//	3）点在圆外：(x1-x0)*(x1-x0) + (y1-y0)*(y1-y0) > r*r
	double a_x;
	double a_y;
	double a_r;
	
	void set_Ad(double x,double y,double r){
		a_x=x;
		a_y=y;
		a_r=r;
	}
	
}

