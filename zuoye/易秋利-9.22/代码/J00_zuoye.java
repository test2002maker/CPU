package test5;

public class J00_zuoye {
	public static class Car{
		String model;//�ͺ�
		String color;
		double pirce;
		void introduce() {//����
			
		}
	}
	
	public static class Baoma extends Car{
		public Baoma(String Model,String Color,double Pirce) {
			model=Model;
			color=Color;
			pirce=Pirce;
		}
		void introduce() {//����
			System.out.println("�ó����ͺ�Ϊ: "+model+" "+"��ɫ��: "+color+" "
					+"�۸���: "+pirce);
		}
	}
	
	public static class Benzhi extends Car{
		public Benzhi(String Model,String Color,double Pirce) {
			model=Model;
			color=Color;
			pirce=Pirce;
		}
		void introduce() {//����
			System.out.println("�ó����ͺ�Ϊ: "+model+" "+"��ɫ��: "+color+" "
					+"�۸���: "+pirce);
		}
	}
	
	public static void test(Car c) {
		c.introduce();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Baoma b=new Baoma("xxx","black",39483);
		Benzhi z=new Benzhi("xx32","black",39833);
		test(b);
		test(z);
		

	}

}
