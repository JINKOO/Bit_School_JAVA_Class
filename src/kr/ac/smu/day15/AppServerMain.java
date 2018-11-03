package kr.ac.smu.day15;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 
 * Server 작업 순서:
 * 1. port를 열고 client의 연결을 기다린다.
 * 2. 클라이언트가 연결을 요청하면 data송수신을 위한 socket객체 생성.
 * 3. data송수신을 위한 inputStream/outputStream객체를 얻어오기.
 * 4. data 송수신 수행.
 * 5. data송수신이 완료되면 clinet와의연결 해제
 * 
 */
public class AppServerMain {

	public static void main(String[] args) {
		
		try {
			ServerSocket server = new ServerSocket(10001);
			System.out.println("애플리케이션 서버 구동");
			Socket client = server.accept();
			System.out.println("접속한 클라이언트 정보 : " + client);
			
			//클라이언트가 서버에 접속하면 환영메세지 클라언트로 전송.
			String msg = "접속을 환영합니다.";
			OutputStream os = client.getOutputStream();
			
//			//방법2
//			DataOutputStream dos = new DataOutputStream(os);
//			dos.writeUTF(msg);  //UTF-방식으로 전송.
//			dos.flush();
			
			//방법 1
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
