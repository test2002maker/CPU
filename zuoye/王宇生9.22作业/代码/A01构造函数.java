package maker5;

public class A01���캯�� {
	public static class lei{
//	����:�ڱ���ļ�����һ����,����������name,age,score,����age��ֵʱҪ�жϺϷ���
//	����ͨ�����캯����ֵ,���Ե��ô�ӡ��Щ���Եķ���
		String name;
		int age;
		double score;
			
		lei(String Name,int Age,double Score){
			name=Name;
			if(Age>=0 && Age<=140) {
				age=Age;
			}else {
				System.out.println("���䲻�Ϸ���");
			}
			if(Score>=0 && Score<=100) {
				score=Score;
			}else {
				System.out.println("�������Ϸ���");
			}
		}
		
		void getName() {
			System.out.println("������"+name);
		}
		void getAge() {
			System.out.println("���䣺"+age);
		}
		void getScore() {
			System.out.println("������"+score);
		}
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		lei m=new lei("С��",18,100);
		m.getName();
		m.getAge();
		m.getScore();

	}

}
