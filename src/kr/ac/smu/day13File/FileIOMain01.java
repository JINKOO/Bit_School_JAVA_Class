package kr.ac.smu.day13File;

import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * Scanner class전에 어떻게 키보드통해 입력 받았을까.
 * 
 */
public class FileIOMain01 {

	public static void main(String[] args) {
		

//		try {
//			InputStream is = System.in; //키보드로 부터 읽어옴.
//			System.out.println("입력하세요(ctrl + z입력시 종료");
//			while(true) {
//				int c = is.read();
//				if(c == -1) 
//					break;
//				System.out.print((char)c);
//			}
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
		
		try {
			InputStream is = System.in; //현재 바이트 형태로 받는다.
			//byte stream -> char stream으로 변환
			InputStreamReader isr = new InputStreamReader(is); //무조건 매개변수가 있어야한다. 필터 class는 생성될떄 매개변수있어야.
			
			System.out.println("키보드 입력(ctrl + z입력시 종료)");
			
			while(true) {
				int c = isr.read(); //읽어오는 대상이 is->isr
				if(c == -1)
					break;
				System.out.print((char)c);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
