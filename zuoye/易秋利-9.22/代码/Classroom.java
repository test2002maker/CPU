package test5;

public class Classroom {
//	设计一个教室类,属性有房间号,座位数,房间名,类有三个属性的setter和getter属性,要求形参名和属性名一样
	private String name;//房间名
	private int room_num;//房间号
	private int seat_num;//座位号


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getRoom_num() {
		return room_num;
	}


	public void setRoom_num(int room_num) {
		this.room_num = room_num;
	}


	public int getSeat_num() {
		return seat_num;
	}


	public void setSeat_num(int seat_num) {
		this.seat_num = seat_num;
	}

}
