package kr.ac.smu.day10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;

//���ܰ� ������ �߻� �� �� �ִ�. ���� Ÿ���� �ٸ� ���� �մ�.
//catch block�� ��Ƽ�� �ϰ� �� �� �ִ�.

public class ExceptionMain05 {

	public static void main(String[] args) {

		System.out.println("main Start...");
		try {
			
			FileReader fr = new FileReader("a.txt");
			
			String str = "abc";
			System.out.println("3��° ���� : " + str.charAt(3)); //����ó�� �ʿ�
			
			Random r = null;
			System.out.println("����� ��� : " + r.nextInt(10)); //����ó�� �ʿ�
		
		} catch(Exception e) {  //Exception class���� ��� ���. //���� ����ȯ.
			e.printStackTrace();
		}
		
//		} catch (NullPointerException | StringIndexOutOfBoundsException | FileNotFoundException e) { //bit or���.
//			e.printStackTrace();
//		}
		
//		} catch (NullPointerException ne) {
//			ne.printStackTrace();
//		} catch (StringIndexOutOfBoundsException sioe) {
//			sioe.printStackTrace();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
		System.out.println("main end...");
	}
}
