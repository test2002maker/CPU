package d4;

public class z4 {
	public static void main(String[] args) {
		zuoye a = new zuoye();
		String name=a.getName();
		int age = a.getAge();
		String sex=a.getSex();
		String mp=a.getMp();
		System.out.println("姓名："+name+"\n"+"年龄："+age+"\n"+"性别："+sex+"\n"+"门派："+mp);
		String name2=a.setName();
		int age2=a.setAge();
		String sex2=a.setSex();
		String mp2=a.setMp();
		System.out.println("姓名："+name2+"\n"+"年龄："+age2+"\n"+"性别："+sex2+"\n"+"门派："+mp2);
	}
}
