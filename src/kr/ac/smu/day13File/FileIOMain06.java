package kr.ac.smu.day13File;

import java.io.FileReader;
import java.io.FileWriter;

public class FileIOMain06 {

	//iotest/FileIOMain03.java --> FileIOMain03.java.txt 복사
	
	public static void main(String[] args) {
	
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("iotest/FileIOMain03.java");
			fw = new FileWriter("iotest/FileIOMain03.txt");
			
			while(true) {
				int c = fr.read();
				if(c == -1) 
					break;
				fw.write(c);
			}
			fw.flush();
			System.out.println("복사 완료...");
			
		
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			
//			if(fr!=null) {
//				try {
//					fr.close();
//				}catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//			
//			if(fw!=null) {
//				try {
//					fw.close();
//				}catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
		}
	}
}
