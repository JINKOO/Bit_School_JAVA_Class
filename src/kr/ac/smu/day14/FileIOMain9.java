package kr.ac.smu.day14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import kr.ac.smu.util.FileClose;

/*
 * ��ü�� ������ �մ� ���� �����ϰ� �а�ʹ�.
 * ObjectOutputStream : ��ü�� ���� �ִ� ���� ���(����class) ����Ʈ ��Ʈ���̴�.
 * ObjecrInputStream : 
 */
public class FileIOMain9 {

	public static void write() {
		
		UserInfo user = new UserInfo("ȫ�浿", 25, "���ʱ�"); //�̰��� ���Ͽ� �����ϰ� �ʹ�.
		
		try (
				FileWriter fw = new FileWriter("iotest/userinfo.txt");
				BufferedWriter bw = new BufferedWriter(fw);
				
		) {
			
			bw.write(user.getName() + ":" + user.getAge() + ":" + user.getAddr());
			bw.newLine();
			bw.flush();  //�� �������� �ִ� ���� flush
			
			System.out.println("userInfo.txt�� ���� �Ϸ�!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void read() {
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			
			fr = new FileReader("iotest/userInfo.txt");
			br = new BufferedReader(fr);
			
			String data = br.readLine();
			String[] dataArr = data.split(":"); //0�������� �̸� 1���� ���� 2���� �ְ�

			//���� ���� ������ �ʹ� ������..??
			
			UserInfo user = new UserInfo(dataArr[0], Integer.parseInt(dataArr[1]),dataArr[2]);
			
			System.out.println("�ε� �Ϸ�");
			System.out.println("user : " + user);
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(br,fr);
		}
	}
	
	public static void main(String[] args) {
		
		//write();
		read();
//		System.out.println(info); //�ڵ����� toStringȣ��. 
	}
}
