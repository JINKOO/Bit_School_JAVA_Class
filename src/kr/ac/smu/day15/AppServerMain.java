package kr.ac.smu.day15;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 
 * Server �۾� ����:
 * 1. port�� ���� client�� ������ ��ٸ���.
 * 2. Ŭ���̾�Ʈ�� ������ ��û�ϸ� data�ۼ����� ���� socket��ü ����.
 * 3. data�ۼ����� ���� inputStream/outputStream��ü�� ������.
 * 4. data �ۼ��� ����.
 * 5. data�ۼ����� �Ϸ�Ǹ� clinet���ǿ��� ����
 * 
 */
public class AppServerMain {

	public static void main(String[] args) {
		
		try {
			ServerSocket server = new ServerSocket(10001);
			System.out.println("���ø����̼� ���� ����");
			Socket client = server.accept();
			System.out.println("������ Ŭ���̾�Ʈ ���� : " + client);
			
			//Ŭ���̾�Ʈ�� ������ �����ϸ� ȯ���޼��� Ŭ���Ʈ�� ����.
			String msg = "������ ȯ���մϴ�.";
			OutputStream os = client.getOutputStream();
			
//			//���2
//			DataOutputStream dos = new DataOutputStream(os);
//			dos.writeUTF(msg);  //UTF-������� ����.
//			dos.flush();
			
			//��� 1
			OutputStreamWriter osw = new OutputStreamWriter(os,"utf-8");
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write(msg);
			bw.newLine();
			bw.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
