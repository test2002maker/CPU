package test4;

public class J05_set��get���� {
	//����:���һ���û���,������˽�г�Ա����������,�绰����.���������˽�����Ե�setter��getter����
	//�����޸�������Ҫ��֤�绰����
	
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
//		System.out.println("�绰���޸ĵĸ�ʽ����,�޷��޸�");
		System.out.println(u.getName());
		System.out.println(u.getPassword());
		System.out.println(u.getPhone());
	}

}
