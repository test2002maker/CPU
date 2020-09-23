package homework9_17;

public class 调用 {
	public static void main(String[] qwe) {
		Game_user g=new Game_user();
		String name1=g.getName();
		int age1=g.getAge();
		String sex1=g.getSex();
		String sect1=g.getSect();
		System.out.println("姓名："+name1+"\n"+"年龄："+age1+"\n"+"性别："+sex1+"\n"+"门派："+sect1);
		String name2=g.setName();
		int age2=g.setAge();
		String sex2=g.setSex();
		String sect2=g.setSect();
		System.out.println("姓名："+name2+"\n"+"年龄："+age2+"\n"+"性别："+sex2+"\n"+"门派："+sect2);
	}

}
