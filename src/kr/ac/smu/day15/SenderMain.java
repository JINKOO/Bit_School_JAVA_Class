package kr.ac.smu.day15;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

/*
 * UDP통신(단방향통신) cf) TCP통신(양방향통신)(server랑 socket필요)
 * 
 * 받을준비가 되어있지않아도 보낸다. 내입장에서 그냥 전송하면 끝.
 * 한쪽 socket만 만듬.
 * 정보를 전달하는 단위가 packet단위로
 * 
 */
public class SenderMain {

	public static void main(String[] args) {

		try {
			DatagramSocket socket = new DatagramSocket();
			System.out.println("[송신 시작]");
			
			for(int i = 1; i<=5; i++) {
				String msg = "hello -" + i;
				byte[] bytes = msg.getBytes();
				DatagramPacket packet = new DatagramPacket(bytes, bytes.length, new InetSocketAddress("localhost",10003)); //바이트 단위.
				
				
				socket.send(packet);
				System.out.println(i + "번째 데이터 전송 완료...");
				Thread.sleep(1000);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
