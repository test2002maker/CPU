package test4;

public class J05_set与get函数 {
	//案例:设计一个用户类,类里有私有成员姓名和密码,电话号码.设计这三个私有属性的setter和getter函数
	//其中修改密码需要验证电话号码
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u=new User();
		System.out.println(u.getName());
		System.out.println(u.getPassword());
		System.out.println(u.getPhone());
		System.out.println("----------------");
		String phone="13172839742";
		if(u.getPhone()==phone) {
			u.setPassword("345678");
		}
//		System.out.println("电话号修改的格式错误,无法修改");
		System.out.println(u.getName());
		System.out.println(u.getPassword());
		System.out.println(u.getPhone());
	}

}
