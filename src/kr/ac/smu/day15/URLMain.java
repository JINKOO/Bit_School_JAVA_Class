package kr.ac.smu.day15;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/*
 * 
 * 프로토콜://host주소:port번호/경로명
 * http://117.16.40.180:10000/Lecture/setup/수업시간image/문자열.png
 * 
 */
public class URLMain {

	public static void main(String[] args) {
		
		try {
//			URL urlObj = new URL("http://117.16.40.180:10000");
//			URL urlObj = new URL("http://117.16.40.180:10000/Lecture/setup/수업시간image/문자열.png");
			
			URL urlObj = new URL("https://www.naver.com");
			
			System.out.println("프로토콜 : " + urlObj.getProtocol());
			System.out.println("호스트주소 : " + urlObj.getHost());
			System.out.println("포트주소 : " + urlObj.getPort());
			System.out.println("경로주소 : " + urlObj.getPath());
			System.out.println("------------------------------------");
			
			InputStream is = urlObj.openStream();  //정보를 읽기위한. 바이트로 읽어온다. url클라스는 data 읽기만 가능.
			InputStreamReader isr = new InputStreamReader(is, "utf-8"); //바이트로 날아온것을 3바이트씩 (한글)
			
			while(true) {
				int c = isr.read();
				if(c == -1) {
					break;
				}
				System.out.print((char)c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
