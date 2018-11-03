package kr.ac.smu.day13File;

import java.io.FileOutputStream;

public class FileIOMain04 {

	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("iotest/test.txt", true); //true를 안쓰면 그냥 덮어쓰인다
			
			fos.write('A');
			fos.write('B');
			fos.write('C');
			fos.write('D');
			fos.write(65);
			//read write는 무조건 1바이트씩 한다. 바이트를 문자로 출력.
			//
			
			System.out.println("파일 저장 완료...");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(fos != null) {
				try {
					fos.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
