package dayfive.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterExample {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("D:\\output\\writer.txt");
			fw.write("Hello Everyone Good Morning");
			fw.close();
			
			FileReader fr = new FileReader("D:\\output\\writer.txt");
			int i=0;
			while((i=fr.read())!=-1) {
				System.out.println((char)i);
			}
			fr.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
