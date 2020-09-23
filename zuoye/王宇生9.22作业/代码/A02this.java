package maker5;

public class A02this {
	public static class jiaoshi{
//		设计一个教室类,属性有房间号,座位数,房间名,类有三个属性的setter和getter属性,要求形参名和属性名一样
		int room_num;
		int seat_num;
		String room_name;
		
		int setroomnum(int room_num) {
			this.room_num=room_num;
			return this.room_num;
		}
		int setseatnum(int seat_num) {
			this.seat_num=seat_num;
			return this.seat_num;
		}
		String setroomname(String room_name) {
			this.room_name=room_name;
			return this.room_name;
		}
		int getroomnum() {
			return this.room_num;
		}
		int getseatnum() {
			return this.seat_num;
		}
		String getroomname() {
			return this.room_name;
		}
		
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		jiaoshi m=new jiaoshi();
		m.setroomname("宫玮泽");
		m.setroomnum(200);
		m.setseatnum(180);
		System.out.println("房间名："+m.getroomname()+"\n"+"座位数："+m.getseatnum()+"\n"+"房间号："+m.getroomnum()+"\n");
		
		jiaoshi n=new jiaoshi();
		n.setroomname("卢远芳");
		n.setroomnum(180);
		n.setseatnum(170);
		System.out.println("房间名："+n.getroomname()+"\n"+"座位数："+n.getseatnum()+"\n"+"房间号："+n.getroomnum()+"\n");
		
		jiaoshi k=new jiaoshi();
		k.setroomname("易秋利");
		k.setroomnum(210);
		k.setseatnum(130);
		System.out.println("房间名："+k.getroomname()+"\n"+"座位数："+k.getseatnum()+"\n"+"房间号："+k.getroomnum()+"\n");

	}

}
