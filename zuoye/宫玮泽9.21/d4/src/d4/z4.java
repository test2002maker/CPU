package d4;

public class z4 {
	public static void main(String[] args) {
		zuoye a = new zuoye();
		String name=a.getName();
		int age = a.getAge();
		String sex=a.getSex();
		String mp=a.getMp();
		System.out.println("������"+name+"\n"+"���䣺"+age+"\n"+"�Ա�"+sex+"\n"+"���ɣ�"+mp);
		String name2=a.setName();
		int age2=a.setAge();
		String sex2=a.setSex();
		String mp2=a.setMp();
		System.out.println("������"+name2+"\n"+"���䣺"+age2+"\n"+"�Ա�"+sex2+"\n"+"���ɣ�"+mp2);
	}
}
