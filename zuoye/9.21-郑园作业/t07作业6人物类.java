package z921;
//6.��дһ����Ϸ������,�����ļ���д,��Ϸ���������������,����,����,�Ա�,
//д����Щ���Ե�getter��setter����,������Ա�Ҫ������ܸ�ֵ
public class t07��ҵ6������ {
	
		String name="����";
		int age=18;
		String sex="��";
		String sect="ؤ��";
		String getname() {
			return name;
		}
		String getsex() {
			return sex;
		}
		String getsect() {
			return sect;
		}
		int getage() {
			return age;
		}
		void setname(String name1) {
			name=name1;
		}
		void setsect(String sect1) {
			sect=sect1;
		}
		void setage(int age1) {
			if(age1>0&&age1<150) {
				age=age1;
			}else {
				System.out.println("��������");
			}
		}
		void setsex(String sex1) {
			if(sex1=="Ů" || sex1=="��") {
				sex=sex1;
			}else {
				System.out.println("��������");
			}
		}
		
}
