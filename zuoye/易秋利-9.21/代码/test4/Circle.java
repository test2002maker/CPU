package test4;


public class Circle {
	int mR;//�뾶
	Point mHera=new Point();
	//int mHx;//Բ��x����
	//int mHy;//Բ��y����
	void setR(int r) {
		mR=r;
	}
	
	void setP(int x,int y) {
		mHera.setX(x);
		mHera.setY(y);
	}
	int getR() {
		return mR;
	}
	Point getP() {
		return mHera;
	}
	void fun(Point p) {
		int a=(p.getX()-mHera.getX())*(p.getX()-mHera.getX())+(p.getY()-mHera.getY())*(p.getY()-mHera.getY());
		int r=mR*mR;
		if(a==r) {
			System.out.println("����Բ��");
		}else if (a>r) {
			System.out.println("����Բ��");
		}else if (a<r) {
			System.out.println("����Բ��");
		}
	}
}
