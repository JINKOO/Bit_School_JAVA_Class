package kr.ac.smu.day13File;

import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * Scanner class���� ��� Ű�������� �Է� �޾�����.
 * 
 */
public class FileIOMain01 {

	public static void main(String[] args) {
		

//		try {
//			InputStream is = System.in; //Ű����� ���� �о��.
//			System.out.println("�Է��ϼ���(ctrl + z�Է½� ����");
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
			InputStream is = System.in; //���� ����Ʈ ���·� �޴´�.
			//byte stream -> char stream���� ��ȯ
			InputStreamReader isr = new InputStreamReader(is); //������ �Ű������� �־���Ѵ�. ���� class�� �����ɋ� �Ű������־��.
			
			System.out.println("Ű���� �Է�(ctrl + z�Է½� ����)");
			
			while(true) {
				int c = isr.read(); //�о���� ����� is->isr
				if(c == -1)
					break;
				System.out.print((char)c);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
