package junittest;

import junit.framework.TestResult;
import junit.framework.TestSuite;

public class apptest�����׼� {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//TestSuite�ǲ��Լ���,��B02TestJunit,B02TestJunit2��ӵ�������
		TestSuite su=new TestSuite(apptestjunit1.class,apptestjunit2.class);
		//���������װִ�в����������
		TestResult r=new TestResult();
		//ִ�в�������,�ѽ������r������
		su.run(r);
		
		//��ȡ���в��Ե�����
		System.out.println("��������:"+r.runCount());
	}

}
