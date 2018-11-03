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

	// Koala.jpg -> Koala_copy.jpg����
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		//���� ó�� �ʿ�
		try {
			fis = new FileInputStream("iotest/Koala.jpg");
			fos = new FileOutputStream("iotest/Koala_copy.jpg");
			
			long start = System.currentTimeMillis();
			while(true) {
				int c = fis.read();
				if(c == -1) { //������ ���� -1
					break;
				}
				fos.write(c);
			}
			fos.flush();
			long end = System.currentTimeMillis();
			
			System.out.println("���簡 �Ϸ�Ǿ����ϴ�.");
			System.out.println("�ҿ�ð� : " + (end - start) / 1000. + "��");
			
//			fis.close();
//			fos.close();  //�ùٸ��� ������� ������(���絵�� ���ܹ߻��ϸ�) ����� �������� ���Ѵ�.
			
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
//			fis.close();  ���������̱� ������ ��������.
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
