package test5;
//����:��װһ������,����������,����,Ʒ��,�ṩ����ӿ�,ͨ���ӿڲ��ܷ������Ժ��޸�����,
//�޸���������ʱ��Ҫ��֤�Ϸ���.�й��캯���ȸ���Щ���Ը�ֵ
public class Dog {
	private String name;
	private int age;
	private String type;//Ʒ��
	
	Dog(String Name,int Age,String Type){
		name=Name;
		age=Age;
		type=Type;
	}
	
	void Prindog() {//��ӡ
		System.out.println("����: "+getName()+" "+"����: "+getAge()+" "
				+"Ʒ��: "+getType());
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>0 && age<=15) {
			this.age = age;
		}
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
