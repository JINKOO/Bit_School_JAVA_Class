package kr.ac.smu.day15;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
 * ������ server
 */
public class RecieverMain {

	public static void main(String[] args) {

		try {
			DatagramSocket socket = new DatagramSocket(10003);
			System.out.println("[���� ����]");

			byte[] bytes = new byte[100];// �� �Ѿ���� ������ ���̰� ��� ���� �𸥴�. ���� �ʿ�
			DatagramPacket packet = new DatagramPacket(bytes, bytes.length); // �������� �ϴ� �ָ� ������ �ȴ�.

			while (true) {
				socket.receive(packet);

				// String msg = String.valueOf(packet.getData()); //����Ʈ ������ String���� //toString
				// �Ұ�.
				String msg = new String(packet.getData());
				System.out.println("[���ŵ� ���� : [" + msg + "]");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
