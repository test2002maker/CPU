package maker5;

public class A02this {
	public static class jiaoshi{
//		���һ��������,�����з����,��λ��,������,�����������Ե�setter��getter����,Ҫ���β�����������һ��
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
		// TODO �Զ����ɵķ������
		jiaoshi m=new jiaoshi();
		m.setroomname("������");
		m.setroomnum(200);
		m.setseatnum(180);
		System.out.println("��������"+m.getroomname()+"\n"+"��λ����"+m.getseatnum()+"\n"+"����ţ�"+m.getroomnum()+"\n");
		
		jiaoshi n=new jiaoshi();
		n.setroomname("¬Զ��");
		n.setroomnum(180);
		n.setseatnum(170);
		System.out.println("��������"+n.getroomname()+"\n"+"��λ����"+n.getseatnum()+"\n"+"����ţ�"+n.getroomnum()+"\n");
		
		jiaoshi k=new jiaoshi();
		k.setroomname("������");
		k.setroomnum(210);
		k.setseatnum(130);
		System.out.println("��������"+k.getroomname()+"\n"+"��λ����"+k.getseatnum()+"\n"+"����ţ�"+k.getroomnum()+"\n");

	}

}
