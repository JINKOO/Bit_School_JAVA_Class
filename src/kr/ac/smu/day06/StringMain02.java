package kr.ac.smu.day06;
import java.util.Arrays;

public class StringMain02 {

	public static void main(String[] args) {
		String str = new String("ABCDEFGHIJ");
		int len = str.length();   //문자열의 길이 반환.
		
		System.out.println("[" + str + "] 길이 : " + len);
		System.out.println("0번지에 위치한 문자 : " + str.charAt(0));
		System.out.println("--------------------------------");
		
		for(int i = 0; i< str.length(); i++) {
			System.out.println(i + "번지 문자 : " + str.charAt(i));  //charAt() 많이 쓴다.
		}
		
		System.out.println("--------------------------------");
		
		//문자열 => 문자배열
		char[] chars = new char[str.length()];
		
		str.getChars(1, 7,chars,3); //1번지에서 6번지까지 chars배열의 3번지서부터
		System.out.println(Arrays.toString(chars));
		
		str.getChars(0, str.length(), chars, 0);   //arrayCopy는 못쓴다. 이것은 배열대 배열이 아니기때문
		System.out.println();
	}
}

class Test {
	
	String str = "ABCDEFGHIJ";
	void getChars(int startIndex, int endIndex, char[] dest, int destIndex) {
		
		for(int i = startIndex; i<endIndex; i++) {
			dest[destIndex++] = str.charAt(i);
		}
	}
}
