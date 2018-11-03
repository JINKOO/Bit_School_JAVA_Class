package kr.ac.smu.day13File;

import java.io.FileReader;
import java.io.FileWriter;

public class FileIOMain06_1 {

	//iotest/FileIOMain03.java --> FileIOMain03.java.txt ����
	
	public static void main(String[] args) {
	
		FileReader fr = null;
		FileWriter fw = null;
		
//		System.out.println("args.length : " + args.length);
//		for(int i = 0; i<args.length; i++) {
//			System.out.println(args[i]);
//		}
		
		if(args.length != 2) {
			System.out.println("--------------------------");
			System.out.println("\t������ �߸��Ǿ����ϴ�.");
			System.out.println("\t���� : java FileIOMain06_1 ���� ���ϸ� ������ ���ϸ�.");
			System.out.println("--------------------------");
			System.exit(0);
		}
//		
		try {
//			fr = new FileReader("iotest/FileIOMain03.java");
//			fw = new FileWriter("iotest/FileIOMain03.txt");
			fr = new FileReader(args[0]);
			fw = new FileWriter(args[1]);
			
			while(true) {
				int c = fr.read();
				if(c == -1) 
					break;
				fw.write(c);
			}
			fw.flush();
			System.out.println("���� �Ϸ�...");
			
		
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
