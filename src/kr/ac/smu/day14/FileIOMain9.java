package kr.ac.smu.day14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import kr.ac.smu.util.FileClose;

/*
 * 객체가 가지고 잇는 값을 저장하고 읽고싶다.
 * ObjectOutputStream : 객체가 갖고 있는 값을 출력(필터class) 바이트 스트림이다.
 * ObjecrInputStream : 
 */
public class FileIOMain9 {

	public static void write() {
		
		UserInfo user = new UserInfo("홍길동", 25, "서초구"); //이것을 파일에 저장하고 싶다.
		
		try (
				FileWriter fw = new FileWriter("iotest/userinfo.txt");
				BufferedWriter bw = new BufferedWriter(fw);
				
		) {
			
			bw.write(user.getName() + ":" + user.getAge() + ":" + user.getAddr());
			bw.newLine();
			bw.flush();  //맨 마지막에 있는 것을 flush
			
			System.out.println("userInfo.txt에 저장 완료!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void read() {
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			
			fr = new FileReader("iotest/userInfo.txt");
			br = new BufferedReader(fr);
			
			String data = br.readLine();
			String[] dataArr = data.split(":"); //0번지에는 이름 1번지 나이 2번지 주고

			//만약 들어가는 정보가 너무 많으면..??
			
			UserInfo user = new UserInfo(dataArr[0], Integer.parseInt(dataArr[1]),dataArr[2]);
			
			System.out.println("로드 완료");
			System.out.println("user : " + user);
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(br,fr);
		}
	}
	
	public static void main(String[] args) {
		
		//write();
		read();
//		System.out.println(info); //자동으로 toString호출. 
	}
}
