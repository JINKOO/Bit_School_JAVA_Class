package kr.ac.smu.day15;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/*
 * 
 * client �۾� ����
 * 1.������ ���� ip, port�� �̿��Ͽ� socket���� �� , ������ ��û.
 * 2.������ �Ϸ�Ǹ� �������� data�ۼ����� ���� inputStream outputStream��ü ����.
 * 3.������ �ۼ����� ����
 * 4.������ �ۼ��� �Ϸ�� �������� ������ ����.
 * 
 */
public class AppClientMain {

	public static void main(String[] args) {
		
		try {
			//������ ���� ��û��.
//			Socket socket = new Socket("117.16.40.180", 10001); //IP�ּҸ� �ᵵ �ȴ�.
			Socket socket = new Socket("localhost", 10001); //IP�ּҸ� �ᵵ �ȴ�.
			
			//�������� ������ �޼����� �����Ͽ� ȭ�鿡 ���.
			InputStream is = socket.getInputStream();
			//���2
//			DataInputStream dis = new DataInputStream(is);
//			String str = dis.readUTF();
			
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			BufferedReader br = new BufferedReader(isr);
			String msg = br.readLine();
			System.out.println("�������� ���� �޼��� : " + msg);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
