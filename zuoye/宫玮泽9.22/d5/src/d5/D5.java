package d5;

import org.omg.CORBA.PUBLIC_MEMBER;

public class D5 {
	public static class dd{
		String name;
		int age;
		dd(){
			System.out.println("�����޲ι��캯��");
		}
		dd(String Name,int Age){
			name=Name;
			age=Age;
			
		}
	}
	public static void main(String[] args) {
		dd dc = new dd();
		dd de = new dd("С��",18);
		System.out.println(dc.name+""+dc.age);
		System.out.println(de.name+""+de.age);	
	}

}
