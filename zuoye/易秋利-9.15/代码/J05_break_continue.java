package test2;

public class J05_break_continue {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int a=1;
		//��a==6ʱ,����ѭ��,break;
		while(true) {
			a+=1;
			if(a==6) {
				break;
			}
			System.out.println(a);
			
		}
		
		for(int i=0;i<10;i++) {
			if(i==6) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("------------");
		int b=0;
		while(true) {	
			while(true) {
				b+=1;
				if(b==6) {
					break;//һ��breakֻ������һ��ѭ��
				}		
			}
			System.out.println(b);
			break;
			
		}
		System.out.println("---------");
		//��ӡ0-9������,��Ҫ��ӡ��5��
		for(int i=0;i<10;i++) {
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("----------");
		aa:for(int i=1;i<3;i++) {
			for(int j=1;j<3;j++) {
				if(j%2==0) {
					break aa;//���ַ�ʽ,һ��break����2��ѭ��,˫��ѭ������
				}
				System.out.println("i="+i);
				System.out.println("j="+j);
				
			}
		}
		
		System.out.println("˫ѭ������");
		aa:for(int i=1;i<3;i++) {
			for(int j=1;j<3;j++) {
				if(j%2==0) {
					continue aa;//���ַ�ʽ,һ��continue����1��ѭ��,��ѭ������,������ѭ��
				}
				System.out.println("i="+i);
				System.out.println("j="+j);
				
			}
		}
	}

}
