package kr.ac.smu.day14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import kr.ac.smu.util.FileClose;

/*
 * Object outputstream : ��ü�� ������� ����Ʈ ������ ����ȭ ���Ѿ��Ѵ�.
 */
public class FIleIOMain10 {

	public static void write() {
		
		UserInfo user = new UserInfo("ȫ�浿", 25, "����� ���ʱ�");
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;  //����Ʈ ���� ��Ʈ���̹Ƿ� ������ ���� ����
		
		
		try {
			
//			fos = new FileOutputStream("iotest/object.txt");
			fos = new FileOutputStream("iotest/object_transient.txt");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(user);
			oos.flush();
			
			System.out.println("object.txt�� ����Ϸ�");
			
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
			
			UserInfo user = (UserInfo)ois.readObject(); //����� ����ȯ�� �ʿ��ϴ�.
			
			System.out.println("�ε� �Ϸ�...");
			
			System.out.println("name : " + user.getName());
			System.out.println("age : " + user.getAge());
			System.out.println("addr : " + user.getAddr());
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		//write();
		//������ ���·� �о���°� �ùٸ� ����̴�. (bufferedWriter => BufferedReader)
		read();
	}
}
