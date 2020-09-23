package d6;

import java.io.FileReader;
import java.io.FileWriter;

public class Static {
		
			public static void main(String[] args) {
				String filename="./inf.txt";
//				try {
//					FileWriter fw = new FileWriter(filename);
//					fw.write("sb");
//					fw.write(1);
//					fw.write("»À");
//					fw.close();
//					
//				}catch (Exception e) {
//					// TODO: handle exception
//				}
//		}
		try {
			FileReader fr = new FileReader(filename);
			int c=0;
			c=fr.read();
			while (c!=-1) {
				System.out.print((char)c);
				c=fr.read();
			}
			fr.close();
			
		}catch(Exception a) {
			
		}
			}
}
