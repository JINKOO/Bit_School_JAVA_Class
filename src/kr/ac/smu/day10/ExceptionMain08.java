package kr.ac.smu.day10;

import java.util.Scanner;

public class ExceptionMain08 {

	public static void registerID() throws Exception {
		
		System.out.println("등록할 ID를 입력 하세요");
		
		Scanner sc = new Scanner(System.in);
		String id = sc.nextLine();
		
		if(id.length() > 8) {//id길이가 8이상이면 예외를 강제적으로 부여하고 싶다.(사용자 정의)
//			throw new Exception("ID는 최대 8글자만 가능합니다."); //직접 처리하는 try catch나 간접 처리
			throw new CheckIDException(); //내가 원하는 이름의 exception만들 수 있다.
		}
		
		System.out.println("ID를 등록 하였습니다.");
	}
	
	public static void main(String[] args) {
		
		try {
			registerID();
		} catch (Exception e) {
			System.out.println("예외 사유 : " + e.getMessage());
			e.printStackTrace();
		}
	}
}
