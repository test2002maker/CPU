package test5;

public class J02_this {
	
//		public static class Maker{
//			String name;
//			int age;
//			
//			Maker(String name,int age){
//				this.name=name;
//				this.age=age;
//			}
//			void printMaker() {
//				System.out.println(name+" "+age);
//			}
//			void setName(String name) {
//				this.name=name;
//			}
//		}

//	���һ��������,�����з����,��λ��,������,�����������Ե�setter��getter����,Ҫ���β�����������һ��
	//----Classroom.java
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Maker maker=new Maker("С��", 22);
//		maker.printMaker();
//		maker.setName("С��");
//		
		Classroom c=new Classroom();
		c.setName("����1");
		c.setRoom_num(23);
		c.setSeat_num(12);
		System.out.println("������:"+c.getName()+" "+"�����:"+c.getRoom_num()+" "
				+"��λ��:"+c.getSeat_num());

	}

}
