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

//	设计一个教室类,属性有房间号,座位数,房间名,类有三个属性的setter和getter属性,要求形参名和属性名一样
	//----Classroom.java
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Maker maker=new Maker("小王", 22);
//		maker.printMaker();
//		maker.setName("小花");
//		
		Classroom c=new Classroom();
		c.setName("教室1");
		c.setRoom_num(23);
		c.setSeat_num(12);
		System.out.println("房间名:"+c.getName()+" "+"房间号:"+c.getRoom_num()+" "
				+"座位号:"+c.getSeat_num());

	}

}
