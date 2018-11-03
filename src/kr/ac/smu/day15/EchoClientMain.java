package kr.ac.smu.day15;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClientMain {

	public static void main(String[] args) {
		
		if(args.length != 2) {
			System.out.println("��ɾ �߸��Ǿ����ϴ�.");
			System.out.println("���� : java EchoClientMain ����IP��Ʈ");
			System.exit(0);
		}
		
		try {
			Socket socket = new Socket(args[0], Integer.parseInt(args[1]));
			
			//Ű����� ������ �޼����� �Է¹޴� ��ü
			InputStream is = System.in;
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader keyboard = new BufferedReader(isr);
//			BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
			
			//Ű����� �Է��� �޼����� ������ �����ϴ� ��ü
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osr = new OutputStreamWriter(os, "utf-8");
			PrintWriter pw = new PrintWriter(osr);
					
			//�������� �������� �޼����� �����ϴ� ��ü
			is = socket.getInputStream();
			isr = new InputStreamReader(is, "utf-8");
			BufferedReader br = new BufferedReader(isr);
			
			while(true) {
				
				System.out.println("������ ������ �޼����� �Է�(quit�Է½� ����)");
				String msg = keyboard.readLine();
				
				if(msg.equalsIgnoreCase("quit")) {
					System.out.println("�������� ���� ����");
					socket.close();
					break;
				}
				
				pw.println(msg);
				pw.flush();
				
				String echmsg = br.readLine();
				System.out.println("�������� �������� �޼��� : [" + echmsg + "]");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
