package maker6;
import java.io.FileWriter;
import java.io.FileReader;

public class A07filewrite {
	//����:���Լ�������,����,�Ա�д���ļ���,���ļ�������д�����ͬ��Ŀ¼��
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String filename="src/inf.txt";
//		try {
//			FileWriter fw=new FileWriter(filename);
//			fw.write("shuai\n");
//			fw.write(18+"\n");
//			fw.write("��\n");
//			fw.close();
//		}catch(Exception a){
//			
//		}
		try {
			FileReader fr=new FileReader(filename);
			int c=0;
			c=fr.read();
			while(c!=-1) {
				System.out.print((char)c);
				c=fr.read();
			}
			fr.close();
		}catch(Exception a){
			
		}
		

	}

}
