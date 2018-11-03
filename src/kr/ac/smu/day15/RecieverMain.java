package kr.ac.smu.day15;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
 * 일종의 server
 */
public class RecieverMain {

	public static void main(String[] args) {

		try {
			DatagramSocket socket = new DatagramSocket(10003);
			System.out.println("[수신 시작]");

			byte[] bytes = new byte[100];// 단 넘어오는 정보의 길이가 어떻게 될지 모른다. 제어 필요
			DatagramPacket packet = new DatagramPacket(bytes, bytes.length); // 받으려고 하는 애만 있으면 된다.

			while (true) {
				socket.receive(packet);

				// String msg = String.valueOf(packet.getData()); //바이트 단위를 String으로 //toString
				// 불가.
				String msg = new String(packet.getData());
				System.out.println("[수신된 내용 : [" + msg + "]");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
