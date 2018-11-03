package kr.ac.smu.day15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

//https://www.naver.com에서 전송된 내용을 naver.html 저장
public class URLConnectionMain {

	public static void main(String[] args) {
		
		try (
				FileOutputStream fos = new FileOutputStream("iotest/naver.html");
				OutputStreamWriter ows = new OutputStreamWriter(fos, "utf-8");
				BufferedWriter bw = new BufferedWriter(ows);
				
		) {
			URL urlObj = new URL("https://www.naver.com");
			
			URLConnection uc = urlObj.openConnection();  //data읽을 수도 있고 쓸 수 도 있다.(읽기 쓰기 목적이다.)
			InputStream is = uc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is,"utf-8");
			BufferedReader br = new BufferedReader(isr);
			
			while(true) {
				String data = br.readLine();
				if(data == null) {
					break;
				}
				bw.write(data);
				bw.newLine();
				bw.flush();   //flush는 while문 밖에 써도 상관 없다.
			}
			System.out.println("naver.html에 저장완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
