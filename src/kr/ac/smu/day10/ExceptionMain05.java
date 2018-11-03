package kr.ac.smu.day10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;

//예외가 여러개 발생 할 수 있다. 예외 타입이 다를 수도 잇다.
//catch block을 멀티플 하게 쓸 수 있다.

public class ExceptionMain05 {

	public static void main(String[] args) {

		System.out.println("main Start...");
		try {
			
			FileReader fr = new FileReader("a.txt");
			
			String str = "abc";
			System.out.println("3번째 문자 : " + str.charAt(3)); //예외처리 필요
			
			Random r = null;
			System.out.println("추출된 장수 : " + r.nextInt(10)); //예외처리 필요
		
		} catch(Exception e) {  //Exception class에서 모두 상속. //묵시 형변환.
			e.printStackTrace();
		}
		
//		} catch (NullPointerException | StringIndexOutOfBoundsException | FileNotFoundException e) { //bit or방식.
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
