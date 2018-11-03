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
			dos.writeInt(65); //여기까지 7바이트
			dos.writeDouble(65); //정수형 변수를 더블형 변수에 넣으면 속도가 느려진다.
			//바이트가 타입별 다르기 때문에 읽어올때 순서를 무조건 명시해야한다.
			System.out.println("저장 완료...");
			
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
		
		int c = dis.read(); //바이트 형태.
		char c2 = dis.readChar();
		int c3 = dis.readInt();
		double c4 = dis.readDouble();
		
		System.out.println("첫번째 문자 : " + (char)c);
		System.out.println("두번째 문자 : " + c2);
		System.out.println("세번째 정수 : " + c3);
		System.out.println("네번째 실수 : " + c4);
		//DataInput/output쓸거면 순서가 중요한다 -> 타입이 다르기 때문에.
		
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
