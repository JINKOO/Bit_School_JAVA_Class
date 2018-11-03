package kr.ac.smu.day15;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * Network API
 * 
 * java.net Package사용.
 * 
 * 1.웹에서 동작할 수 있도록
 * 2.실제 통신을 기반으로 
 * 
 * 소켓(socket)
 * 서버 한개 ------- 여러개의 client
 * 각 client와 대화를 시도 (I/O방식)
 * 하나의 통로로는 대화 할 수 없다.  
 * 서로 대화 할 수 있는 통로의 지점들이 필요하다. 각 컴퓨터마다 통로가 필요한데 이것을 socket이라 한다.
 * 통로를 구분하는 것.각 client는 서버와의 통로를 구분해야 한다.
 * 
 * 
 * Host == IP
 * 컴퓨터와 컴퓨터를 구분할 수 있는 것.
 * 
 * Port
 * 한 host에서 여러개의 서비스를 구분하기 위해서 사용한다.
 * 
 * IP port를 통해서 socket을 만든다.
 * 
 * 
 * 
 */
public class InetAddressMain01 {

	public static void main(String[] args) {
	
		//외부에서 정보를 얻어 오는 것은 대부분 예외처리
		try {
			InetAddress localhost = InetAddress.getLocalHost();
			System.out.println("내 컴의 네트워크 이름 : " + localhost.getHostName());
			System.out.println("내 컴의 IP주소 : " + localhost.getHostAddress());
			System.out.println("localhost : " + localhost.toString());  //toString 오버라이딩.
			//도메인 주소를 이용해서 IP알아내기
			InetAddress addr = InetAddress.getByName("www.smu.ac.kr");
			System.out.println("상명대학교의 IP주소는 : " + addr.getHostAddress());
			
			InetAddress[] addrs = InetAddress.getAllByName("www.naver.com"); //분산서버
			System.out.println("==========================================");
			System.out.println("\t네이버 IP정보 보기");
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
