package test5;

public class J01_���캯�� {
	
//	public static class Maker{
//		String name;
//		int age;
//		//���캯���Ǳ�����ȥ���õ�,ʵ���������Ȼ�й��캯��������
//		Maker(){
//			System.out.println("�����޲ι��캯��");
//		}
//		Maker(String Name,int Age){
//			name=Name;
//			age=Age;
//		}
//	}
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
//		Maker maker=new Maker();//�����޲ι���
//		Maker maker2=new Maker("С��",18);//�����вι���
//		System.out.println(maker.name+" "+maker.age);//name,age��û��ֵ��
//		System.out.println(maker2.name+" "+maker2.age);//name,age��ֵ
		
//		����:�ڱ���ļ�����һ����,����������name,age,score,����age��ֵʱҪ�жϺϷ���
//		����ͨ�����캯����ֵ,���Ե��ô�ӡ��Щ���Եķ���------Score.java
		Score score=new Score("liu", 18, 98);
		System.out.println(score.name+" "+score.age+" "+score.score);
	}

}
