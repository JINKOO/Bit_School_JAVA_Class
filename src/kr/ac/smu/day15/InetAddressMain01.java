package kr.ac.smu.day15;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * Network API
 * 
 * java.net Package���.
 * 
 * 1.������ ������ �� �ֵ���
 * 2.���� ����� ������� 
 * 
 * ����(socket)
 * ���� �Ѱ� ------- �������� client
 * �� client�� ��ȭ�� �õ� (I/O���)
 * �ϳ��� ��ηδ� ��ȭ �� �� ����.  
 * ���� ��ȭ �� �� �ִ� ����� �������� �ʿ��ϴ�. �� ��ǻ�͸��� ��ΰ� �ʿ��ѵ� �̰��� socket�̶� �Ѵ�.
 * ��θ� �����ϴ� ��.�� client�� �������� ��θ� �����ؾ� �Ѵ�.
 * 
 * 
 * Host == IP
 * ��ǻ�Ϳ� ��ǻ�͸� ������ �� �ִ� ��.
 * 
 * Port
 * �� host���� �������� ���񽺸� �����ϱ� ���ؼ� ����Ѵ�.
 * 
 * IP port�� ���ؼ� socket�� �����.
 * 
 * 
 * 
 */
public class InetAddressMain01 {

	public static void main(String[] args) {
	
		//�ܺο��� ������ ��� ���� ���� ��κ� ����ó��
		try {
			InetAddress localhost = InetAddress.getLocalHost();
			System.out.println("�� ���� ��Ʈ��ũ �̸� : " + localhost.getHostName());
			System.out.println("�� ���� IP�ּ� : " + localhost.getHostAddress());
			System.out.println("localhost : " + localhost.toString());  //toString �������̵�.
			//������ �ּҸ� �̿��ؼ� IP�˾Ƴ���
			InetAddress addr = InetAddress.getByName("www.smu.ac.kr");
			System.out.println("�����б��� IP�ּҴ� : " + addr.getHostAddress());
			
			InetAddress[] addrs = InetAddress.getAllByName("www.naver.com"); //�л꼭��
			System.out.println("==========================================");
			System.out.println("\t���̹� IP���� ����");
			System.out.println("==========================================");
			for(InetAddress address : addrs) {
				System.out.println(address);
			}
			
			System.out.println("==========================================");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
