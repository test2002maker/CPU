package maker4;

public class anli_use {

	public static void main(String[] args) {
		//案例:设计一个用户类,类里有私有成员姓名和密码,电话号码.设计这三个私有属性的setter和getter函数
		//其中修改密码需要验证电话号码
		User m=new User();
		String name1=m.getName();
		String pwd1=m.getPwd();
		String phone1=m.getPhone();
		System.out.println(name1+" "+pwd1+" "+phone1);
		String name2=m.setName();
		String pwd2=m.setPwd();
		String phone2=m.setPhone();
		System.out.println(name2+" "+pwd2+" "+phone2);
		
	}

}
