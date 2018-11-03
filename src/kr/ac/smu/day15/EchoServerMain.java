package kr.ac.smu.day15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

//Ŭ���̾�Ʈ�� ������ �ٽ� ����
public class EchoServerMain {

	public static void main(String[] args) {

		try {
			ServerSocket server = new ServerSocket(10002);
			System.out.println("���� ������... Ŭ���̾�Ʈ�� ������ ��ٸ��ϴ�.");
			
			Socket client = server.accept();
			System.out.println("����� Ŭ���̾�Ʈ ���� : [ " + client.getInetAddress().getHostAddress() + "]");
			
			//client���� ������ �޼��� �����ϴ� ��ü
			InputStream is = client.getInputStream();
			InputStreamReader isr = new InputStreamReader(is,"utf-8");
			BufferedReader br = new BufferedReader(isr);
			
			
			//������ �޼����� client���� �������� ��ü
			OutputStream os = client.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os,"utf-8");
//			BufferedWriter bw = new BufferedWriter(osw);
			PrintWriter pw = new PrintWriter(osw);
			
			while(true) {
				String msg = br.readLine();
				if(msg == null) {
					System.out.println("Ŭ���̾�Ʈ[" + client.getInetAddress().getHostAddress() + "]���� ��������");
					client.close();
					break;
				}
				System.out.println("[" + client.getInetAddress().getHostAddress() + "]" + msg);
				pw.println(msg);
				pw.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
