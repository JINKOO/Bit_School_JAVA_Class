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
			System.out.println("명령어가 잘못되없습니다.");
			System.out.println("사용법 : java EchoClientMain 서버IP포트");
			System.exit(0);
		}
		
		try {
			Socket socket = new Socket(args[0], Integer.parseInt(args[1]));
			
			//키보드로 전송할 메세지를 입력받는 객체
			InputStream is = System.in;
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader keyboard = new BufferedReader(isr);
//			BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
			
			//키보드로 입력한 메세지를 서버로 전송하는 객체
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osr = new OutputStreamWriter(os, "utf-8");
			PrintWriter pw = new PrintWriter(osr);
					
			//서버에서 재전송한 메세지를 수신하는 객체
			is = socket.getInputStream();
			isr = new InputStreamReader(is, "utf-8");
			BufferedReader br = new BufferedReader(isr);
			
			while(true) {
				
				System.out.println("서버에 전송할 메세지를 입력(quit입력시 종료)");
				String msg = keyboard.readLine();
				
				if(msg.equalsIgnoreCase("quit")) {
					System.out.println("서버와의 연결 해제");
					socket.close();
					break;
				}
				
				pw.println(msg);
				pw.flush();
				
				String echmsg = br.readLine();
				System.out.println("서버에서 재전송한 메세지 : [" + echmsg + "]");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
