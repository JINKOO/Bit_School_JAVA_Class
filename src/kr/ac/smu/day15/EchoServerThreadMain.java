package kr.ac.smu.day15;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

class EchoThread extends Thread {

	private Socket client;

	public EchoThread(Socket client) {
		this.client = client;
	}

	@Override
	public void run() {

		try {
			System.out.println("����� Ŭ���̾�Ʈ ���� : [ " + client.getInetAddress().getHostAddress() + "]");

			// client���� ������ �޼��� �����ϴ� ��ü
			InputStream is = client.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			BufferedReader br = new BufferedReader(isr);

			// ������ �޼����� client���� �������� ��ü
			OutputStream os = client.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os, "utf-8");
			// BufferedWriter bw = new BufferedWriter(osw);
			PrintWriter pw = new PrintWriter(osw);

			while (true) {
				String msg = br.readLine();
				if (msg == null) {
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

public class EchoServerThreadMain {

	public static void main(String[] args) {

		System.out.println("EchoServer�� ���� �մϴ�.");

		try {
			ServerSocket server = new ServerSocket(10002);
			while (true) {
				Socket client = server.accept();
				EchoThread et = new EchoThread(client);
				et.start();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
