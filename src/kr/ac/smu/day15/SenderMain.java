package kr.ac.smu.day15;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

/*
 * UDP���(�ܹ������) cf) TCP���(��������)(server�� socket�ʿ�)
 * 
 * �����غ� �Ǿ������ʾƵ� ������. �����忡�� �׳� �����ϸ� ��.
 * ���� socket�� ����.
 * ������ �����ϴ� ������ packet������
 * 
 */
public class SenderMain {

	public static void main(String[] args) {

		try {
			DatagramSocket socket = new DatagramSocket();
			System.out.println("[�۽� ����]");
			
			for(int i = 1; i<=5; i++) {
				String msg = "hello -" + i;
				byte[] bytes = msg.getBytes();
				DatagramPacket packet = new DatagramPacket(bytes, bytes.length, new InetSocketAddress("localhost",10003)); //����Ʈ ����.
				
				
				socket.send(packet);
				System.out.println(i + "��° ������ ���� �Ϸ�...");
				Thread.sleep(1000);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
