package kr.ac.smu.day15;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/*
 * 
 * client 작업 순서
 * 1.접속할 서버 ip, port를 이용하여 socket생성 후 , 서버에 요청.
 * 2.연결이 완료되면 서버와의 data송수신을 위한 inputStream outputStream객체 생성.
 * 3.데이터 송수신을 수행
 * 4.데이터 송수신 완료시 서버와의 연결을 해제.
 * 
 */
public class AppClientMain {

	public static void main(String[] args) {
		
		try {
			//서버에 연결 요청함.
//			Socket socket = new Socket("117.16.40.180", 10001); //IP주소를 써도 된다.
			Socket socket = new Socket("localhost", 10001); //IP주소를 써도 된다.
			
			//서버에서 보내준 메세지를 수신하여 화면에 출력.
			InputStream is = socket.getInputStream();
			//방법2
//			DataInputStream dis = new DataInputStream(is);
//			String str = dis.readUTF();
			
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			BufferedReader br = new BufferedReader(isr);
			String msg = br.readLine();
			System.out.println("서버에서 받은 메세지 : " + msg);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
