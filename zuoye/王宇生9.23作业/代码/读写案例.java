package maker6;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
public class ��д���� {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//����:��ǰ���FileWrite�ļ�д����,Ȼ��д��һ����׺Ϊ.java���ļ�,Ȼ���ڶ�����ӡ
		String filename1="E:\\java_worker\\A06day\\src\\maker6\\A07filewrite.java";
		String filename2="E:\\java_worker\\A06day\\src\\maker6\\anli.txt";
		String r="";
		String r2="";
		try {
			BufferedReader re=new BufferedReader(new FileReader(filename1));
			BufferedWriter wr=new BufferedWriter(new FileWriter(filename2));
			r=re.readLine();
			while(r!=null) {
				wr.write(r+"\n");
				r=re.readLine();
			}
			wr.close();
			re.close();
			
			BufferedReader re2=new BufferedReader(new FileReader(filename2));
			r2=re2.readLine();
			while(r2!=null) {
				System.out.println(r2);
				r2=re.readLine();
			}
			re2.close();
		}catch(Exception a) {
			
		}

	}

}
