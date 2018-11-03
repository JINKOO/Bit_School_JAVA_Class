package kr.ac.smu.day13File;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import kr.ac.smu.util.FileClose;

/*
 * 1.Stream open
 * 2.read or write
 * 3.stream close
 * 
 */
public class FileIOMain03 {

	// Koala.jpg -> Koala_copy.jpg복사
	// Buffer사용.
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		//파일 복사할때 buffer를 같이 쓰는 것이 좋다.
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		
		//예외 처리 필요
		try {
			fis = new FileInputStream("iotest/Koala.jpg");
			fos = new FileOutputStream("iotest/Koala_copy.jpg");
			
			
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			long start = System.currentTimeMillis();
			while(true) {
				int c = bis.read();
				if(c == -1) { //파일의 끝은 -1
					break;
				}
				bos.write(c);  //여기선 byte이니까
			}
			fos.flush();
			long end = System.currentTimeMillis();
			
			System.out.println("복사가 완료되었습니다.");
			System.out.println("소요시간 : " + (end - start) / 1000. + "초");
			
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
//			
			FileClose.close(bis,fis);
			FileClose.close(bos,fos);
			
//			FileClose.close(bis);
//			FileClose.close(bos);
//			FileClose.close(fis);
//			FileClose.close(fos);
//지울 때는 필터 class부터 지운다.
//			if(bis != null) {
//				try {
//					bis.close();
//				} catch(Exception e) {
//					e.printStackTrace();
//				}
//			}
//			if(bos != null) {
//				try {
//					bos.close();
//				} catch(Exception e) {
//					e.printStackTrace();
//				}
//			}
//			
//			if(fis != null) {
//				try {
//					fis.close();
//				} catch(Exception e) {
//					e.printStackTrace();
//				}
//			}
//			if(fos != null) {
//				try {
//					fis.close();
//				}catch(Exception e) {
//					e.printStackTrace();
//				}
//			}
		}
	}
}
