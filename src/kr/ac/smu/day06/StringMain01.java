package kr.ac.smu.day06;

/*
 * String 클래스의 생성자
 * -String()
 * -String(char[])
 * -String(char[], int, int)
 * -String(byte[])
 * -String(byte[], int, int)
 * -String(String)
 */
public class StringMain01 {

	public static void main(String[] args) {
		
		String a = null;         //a가 가리키는 문자열이 없다.
		String s = new String(); //String s = ""; 가리키는 것은 있으나 빈공간.
		System.out.println("s : [" + a + "]");
		
		char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
		String s2 = new String(chars);
		System.out.println("s2 : [" + s2 + "]");
		
		String s3 = new String(chars, 1, 4);
		System.out.println("s3 : [" + s3 + "]");
		
		byte[] bytes = {65, 66, 67, 68, 69, 70, 71};
		String s4 = new String(bytes);
		System.out.println("s4 : [" + s4 + "]");
		
		String s5 = new String(bytes, 3,3);
		System.out.println("s5 : [" + s5 + "]");
		
		String s6 = "Hello";
		System.out.println("s6 : [" + s6 + "]");
		
		
	}
}
