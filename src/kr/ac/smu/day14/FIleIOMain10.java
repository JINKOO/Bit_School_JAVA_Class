package kr.ac.smu.day14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import kr.ac.smu.util.FileClose;

/*
 * Object outputstream : 객체의 멤버변수 바이트 단위로 직렬화 시켜야한다.
 */
public class FIleIOMain10 {

	public static void write() {
		
		UserInfo user = new UserInfo("홍길동", 25, "서울시 서초구");
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;  //바이트 단위 스트림이므로 리더는 쓸수 없음
		
		
		try {
			
//			fos = new FileOutputStream("iotest/object.txt");
			fos = new FileOutputStream("iotest/object_transient.txt");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(user);
			oos.flush();
			
			System.out.println("object.txt에 저장완료");
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			
			FileClose.close(oos, fos);
			
		}
	}
	
	public static void read() {
		
		try (
				
//				FileInputStream fis = new FileInputStream("iotest/object.txt");
				FileInputStream fis = new FileInputStream("iotest/object_transient.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);
		) {
			
			UserInfo user = (UserInfo)ois.readObject(); //명시적 형변환이 필요하다.
			
			System.out.println("로드 완료...");
			
			System.out.println("name : " + user.getName());
			System.out.println("age : " + user.getAge());
			System.out.println("addr : " + user.getAddr());
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		//write();
		//저장한 형태로 읽어오는게 올바른 방식이다. (bufferedWriter => BufferedReader)
		read();
	}
}
