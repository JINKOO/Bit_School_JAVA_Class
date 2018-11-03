package kr.ac.smu.day06;
import java.util.Arrays;

public class StringMain02 {

	public static void main(String[] args) {
		String str = new String("ABCDEFGHIJ");
		int len = str.length();   //���ڿ��� ���� ��ȯ.
		
		System.out.println("[" + str + "] ���� : " + len);
		System.out.println("0������ ��ġ�� ���� : " + str.charAt(0));
		System.out.println("--------------------------------");
		
		for(int i = 0; i< str.length(); i++) {
			System.out.println(i + "���� ���� : " + str.charAt(i));  //charAt() ���� ����.
		}
		
		System.out.println("--------------------------------");
		
		//���ڿ� => ���ڹ迭
		char[] chars = new char[str.length()];
		
		str.getChars(1, 7,chars,3); //1�������� 6�������� chars�迭�� 3����������
		System.out.println(Arrays.toString(chars));
		
		str.getChars(0, str.length(), chars, 0);   //arrayCopy�� ������. �̰��� �迭�� �迭�� �ƴϱ⶧��
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
