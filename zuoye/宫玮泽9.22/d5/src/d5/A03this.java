package d5;

public class A03this {
	public static class js {
		
		int room;
		int seat;
		String name;
		int setRoom(int room) {
			this.room=room;
			return room;
		}
		int setSeat(int seat) {
			this.seat=seat;
			return seat;
		}
		String setName(String name) {
			this.name=name;
			return name;
		}
		int getRoom() {
			return this.room;
		}
		int getSeat() {
			return this.seat;
		}
		String getName() {
			return this.name;
		}
		
	}
	
	
	public static void main(String[] args) {
		js s = new js();
		s.setRoom(1);
		s.setSeat(1);
		s.setName("a");
		System.out.println("房间名:"+s.getName()+"\n"+"房间号:"+s.getRoom()+"\n"+"座位号:"+s.getSeat());
	}
}
