package kr.ac.smu.day13File;

import java.io.FileOutputStream;

public class FileIOMain04 {

	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("iotest/test.txt", true); //true�� �Ⱦ��� �׳� ����δ�
			
			fos.write('A');
			fos.write('B');
			fos.write('C');
			fos.write('D');
			fos.write(65);
			//read write�� ������ 1����Ʈ�� �Ѵ�. ����Ʈ�� ���ڷ� ���.
			//
			
			System.out.println("���� ���� �Ϸ�...");
			
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
