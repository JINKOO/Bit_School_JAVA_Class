package kr.ac.smu.day15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

//https://www.naver.com���� ���۵� ������ naver.html ����
public class URLConnectionMain {

	public static void main(String[] args) {
		
		try (
				FileOutputStream fos = new FileOutputStream("iotest/naver.html");
				OutputStreamWriter ows = new OutputStreamWriter(fos, "utf-8");
				BufferedWriter bw = new BufferedWriter(ows);
				
		) {
			URL urlObj = new URL("https://www.naver.com");
			
			URLConnection uc = urlObj.openConnection();  //data���� ���� �ְ� �� �� �� �ִ�.(�б� ���� �����̴�.)
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
				bw.flush();   //flush�� while�� �ۿ� �ᵵ ��� ����.
			}
			System.out.println("naver.html�� ����Ϸ�");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
