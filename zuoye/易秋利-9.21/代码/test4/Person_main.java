package test4;

public class Person_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person();
		int age=18;
		char sex='女';
		if(age>0&&age<100) {
			p.setAge(age);
		}
		if(sex=='女' || sex=='男') {
			p.setSex(sex);
		}
		p.setName("liu");
		p.setSect("华山派");
		System.out.println(p.getName());
		System.out.println(p.getSex());
		System.out.println(p.getAge());
		System.out.println(p.getSect());
		

	}

}
