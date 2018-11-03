package kr.ac.smu.day07;

import java.util.Arrays;

public class StringMain04 {

	public static void main(String[] args) {
		
		String str = "Hello world";
		
		int searchIdx = str.indexOf("e");  //0번지서 부터 검사
		System.out.println("\'e\' 시작위치 " + searchIdx);
		
		searchIdx = str.indexOf("o"); //제일 처음 o를 만나는 index 값 리턴
		System.out.println("\'o\' 시작위치 " + searchIdx);
		
		searchIdx = str.indexOf("p"); //찾고자하는 것이 없다면 -1리턴
		System.out.println("\'p\' 시작위치 " + searchIdx);
		
		searchIdx = str.lastIndexOf("o");  //끝에서 부터 하나씩 검사. 
		System.out.println("\'o\' 마지막 위치 " + searchIdx);
		
		searchIdx = str.lastIndexOf("world");
		System.out.println("\"world\" 시작 위치 : " + searchIdx);
		
		//str에서 o의 위치를 모두 알고 싶음. => 반복문을 쓴다.
		
		char ch = 'l';
//		searchIdx = str.indexOf(ch);
//		searchIdx = str.indexOf(ch,0);
//		while(searchIdx != -1) {
//			System.out.println("\'" + ch + "\" 위치 : " + searchIdx);
//			searchIdx = str.indexOf(ch,searchIdx + 1); //0번지 부터 검사하는 것이 아니라 검사한것 다음 위치부터 검사.
//		}
		
		System.out.println("--------------------");
		
		searchIdx = -1;
		while((searchIdx = str.indexOf(ch, searchIdx + 1)) != -1) {
			System.out.println("\'" + ch + "\" 위치 : " + searchIdx);
			//searchIdx = str.indexOf(ch, searchIdx + 1); //0번지 부터 검사하는 것이 아니라 검사한것 다음 위치부터 검사.
		}
		
//		System.out.println("--------------------");
//		searchIdx = str.length();
//		while((searchIdx = str.lastIndexOf(ch, searchIdx - 1)) != -1) {
//			System.out.println("\'" + ch + "\" 위치 : " + searchIdx);
//			searchIdx = str.lastIndexOf(ch, searchIdx - 1);
//		}
		
		
		System.out.println("=======================================");
		
		str = "hello world";
		
		String sub = str.substring(0,5); //0-4번지 까지
		sub = str.substring(3,7);
		sub = str.substring(4);  //4번지 부터 맨 끝까지 
		
		System.out.println("sub : [" + sub + "]");
		
		str = "hello";  //"hello!!!";
		str = str + "!!!";
		
		System.out.println("str : [" + str + "]");
		
		str = str.replace("l", "rt");
		System.out.println("변경후 str : " + str);
		
		str = "     hello     ";
		System.out.println("trim() 후 [" +  str + "]길이 : "  + str.length());
		
		str = str.trim(); //문자열 내부의 공백은 지우지 못한다. 파일을 긁어올때 trim많이 쓴다.
		System.out.println("trim() 후 [" +  str + "]길이 : "  + str.length());
		
		
		str = "Hello World";
		str = str.toUpperCase(); //자신이 값이 바뀌려면 = 써야한다. ++ -- 만 자신의 값 바뀜.
		System.out.println("대문자 변경 : " + str);
		
		str = str.toLowerCase();
		System.out.println("소문자 변경 : " + str);
		
		str = "홍길동전:허균:조선시대"; //:기준으로 3개의 문자열로 분리. 리턴 타입은 배열타입이다.
		String[] sArr = str.split(":");
		System.out.println(Arrays.toString(sArr));
		
		int num = 123; // 123 -> "123" 정수를 문자열로 바꿔줌.
		//String strNum = num + "";
		String strNum = String.valueOf(num);
		System.out.println("strNum : " + strNum);

		
		char[] chars = {'H', 'e', 'l', 'l', 'o', '!'};
		str = String.valueOf(chars);
		
		System.out.println("str : "  + str);
		
		//"123" -> 123
		int num2 = Integer.valueOf("12345");//참조 자료형(int)으로 바꿔준다.
		num2 = Integer.parseInt("12345");  //기본 자료형(int)으로 바꿔준다.
		System.out.println(num2);
	}
}

class MyString1 {
	
	String str;
	
	String concat(String addstr) {
		char[] arr = new char[str.length() + addstr.length()];
		str.getChars(0, str.length(), arr, 0);
		
		for(int i = str.length(), j = 0; i<addstr.length(); i++) {
			arr[i] = addstr.charAt(j++);
		}
		
		return new String(arr); //??
	}
}
