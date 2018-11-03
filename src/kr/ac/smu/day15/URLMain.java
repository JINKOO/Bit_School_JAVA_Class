package kr.ac.smu.day15;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/*
 * 
 * ��������://host�ּ�:port��ȣ/��θ�
 * http://117.16.40.180:10000/Lecture/setup/�����ð�image/���ڿ�.png
 * 
 */
public class URLMain {

	public static void main(String[] args) {
		
		try {
//			URL urlObj = new URL("http://117.16.40.180:10000");
//			URL urlObj = new URL("http://117.16.40.180:10000/Lecture/setup/�����ð�image/���ڿ�.png");
			
			URL urlObj = new URL("https://www.naver.com");
			
			System.out.println("�������� : " + urlObj.getProtocol());
			System.out.println("ȣ��Ʈ�ּ� : " + urlObj.getHost());
			System.out.println("��Ʈ�ּ� : " + urlObj.getPort());
			System.out.println("����ּ� : " + urlObj.getPath());
			System.out.println("------------------------------------");
			
			InputStream is = urlObj.openStream();  //������ �б�����. ����Ʈ�� �о�´�. urlŬ�󽺴� data �б⸸ ����.
			InputStreamReader isr = new InputStreamReader(is, "utf-8"); //����Ʈ�� ���ƿ°��� 3����Ʈ�� (�ѱ�)
			
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
