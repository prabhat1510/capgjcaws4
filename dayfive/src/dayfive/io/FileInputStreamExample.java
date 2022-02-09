package dayfive.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamExample {

	public static void main(String[] args) {
			//InputStream and OutputStream api or classes to perform IO in your program
			//InputStream to read data from source and OutputStream to write data to destination
		//Read a byte from  a file
		try {
			FileInputStream fis = new FileInputStream("D:\\output\\output2.txt");
			/**
			//Read single character from a file
			System.out.println(fis.read());
			int i = fis.read();
			System.out.println(i);
			System.out.println((char)i);
			**/
			//Read all characters
			int i=0;
			while((i=fis.read())!=-1) {
				System.out.println((char)i);
			}
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
