package kr.ac.smu.day13File;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileIOMain05 {

	public static void write() {
		
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream("iotest/data.txt");
			dos = new DataOutputStream(fos);
			
			dos.write('A');   //01000001
			dos.writeChar('A'); //00000000 01000001
			dos.writeInt(65); //������� 7����Ʈ
			dos.writeDouble(65); //������ ������ ������ ������ ������ �ӵ��� ��������.
			//����Ʈ�� Ÿ�Ժ� �ٸ��� ������ �о�ö� ������ ������ ����ؾ��Ѵ�.
			System.out.println("���� �Ϸ�...");
			
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			if(dos != null) {
				try {
					dos.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			if(fos != null) {
				try {
					fos.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	static void read() throws Exception {
		
		FileInputStream fis = new FileInputStream("iotest/data.txt");
		DataInputStream dis = new DataInputStream(fis);
		
		int c = dis.read(); //����Ʈ ����.
		char c2 = dis.readChar();
		int c3 = dis.readInt();
		double c4 = dis.readDouble();
		
		System.out.println("ù��° ���� : " + (char)c);
		System.out.println("�ι�° ���� : " + c2);
		System.out.println("����° ���� : " + c3);
		System.out.println("�׹�° �Ǽ� : " + c4);
		//DataInput/output���Ÿ� ������ �߿��Ѵ� -> Ÿ���� �ٸ��� ������.
		
//		while(true) {
//			int c = dis.read();
//			if(c == -1) {
//				break;
//			}
//			System.out.println((char)c);
//		}
//	
		dis.close();
		fis.close();
	}
	
	
	public static void main(String[] args) {
		
//		write();
		try {
			read();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
