package maker4;

public class anli_use {

	public static void main(String[] args) {
		//����:���һ���û���,������˽�г�Ա����������,�绰����.���������˽�����Ե�setter��getter����
		//�����޸�������Ҫ��֤�绰����
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
