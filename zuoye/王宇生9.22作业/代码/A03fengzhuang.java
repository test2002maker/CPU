package maker5;

public class A03fengzhuang {
//	����:��װһ������,����������,����,Ʒ��,�ṩ����ӿ�,ͨ���ӿڲ��ܷ������Ժ��޸�����,
//	�޸���������ʱ��Ҫ��֤�Ϸ���.�й��캯���ȸ���Щ���Ը�ֵ
	public static class Dog{
		private String name;
		private int age;
		private String cate;
		
		Dog(String name,int age,String cate){
			this.name=name;
			if(age>=0 && age<=20) {
				this.age=age;
			}else {
				System.out.println("���䲻����");
			}
			this.cate=cate;
		}
		
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
		public String getCate() {
			return cate;
		}
		public void setName(String name) {
			this.name=name;
		}
		public void setAge(int age) {
			if(age>=0 && age<=20) {
				this.age=age;
			}else {
				System.out.println("���䲻����");
			}
		}
		public void setCate(String cate) {
			this.cate=cate;
		}
		
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Dog d=new Dog("С�̹�",18,"������");
		System.out.println("������"+d.getName()+"\n"+"���䣺"+d.getAge()+"\n"+"���ࣺ"+d.getCate()+"\n");
		d.setName("С�̌�");
		d.setAge(19);
		d.setCate("��ةة");
		System.out.println("������"+d.getName()+"\n"+"���䣺"+d.getAge()+"\n"+"���ࣺ"+d.getCate()+"\n");

	}

}
