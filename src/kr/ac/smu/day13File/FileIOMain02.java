package kr.ac.smu.day13File;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * 1.Stream open
 * 2.read or write
 * 3.stream close
 * 
 */
public class FileIOMain02 {

	// Koala.jpg -> Koala_copy.jpg복사
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		//예외 처리 필요
		try {
			fis = new FileInputStream("iotest/Koala.jpg");
			fos = new FileOutputStream("iotest/Koala_copy.jpg");
			
			long start = System.currentTimeMillis();
			while(true) {
				int c = fis.read();
				if(c == -1) { //파일의 끝은 -1
					break;
				}
				fos.write(c);
			}
			fos.flush();
			long end = System.currentTimeMillis();
			
			System.out.println("복사가 완료되었습니다.");
			System.out.println("소요시간 : " + (end - start) / 1000. + "초");
			
//			fis.close();
//			fos.close();  //올바르게 복사되지 않으면(복사도중 예외발생하면) 여기는 실행하지 못한다.
			
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
//			fis.close();  지역변수이기 때문에 에러난다.
			if(fis != null) {
				try {
					fis.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			if(fos != null) {
				try {
					fis.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
