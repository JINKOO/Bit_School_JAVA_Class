package kr.ac.smu.day13File;

import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

//class A implements AutoCloseable{
//	
//}

public class FileIOMain08 {

	public static void main(String[] args) {

		// 1.7버전 이후 try문.
		// finally를 이용한 close코드를 줄이기 위해.
		// try (
		// //반드시 close() 수행해하는 변수 설정.(IO, Network, DB할때 try문을 이렇게 쓴다.
		// A a = new A();
		// ) {
		// //예외가 발생 할 만한 코드.
		// } catch(Exception e) {
		// //예외 처리
		// }

		try (
				FileReader fr = new FileReader("iotest/a.txt");
				BufferedReader br = new BufferedReader(fr);
				FileWriter fw = new FileWriter("iotest/bbb.txt");
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(bw);
				
		// String str = new String("hello"); 못쓴다. autoclose를 상속 받지 않기 때문.
		) {
			while (true) {
				String str = br.readLine();
				if (str == null) {
					break;
				}

				// bw.write(str);
				// bw.newLine(); //계행.

				pw.println(str); // 출력도 하고 계행.

			}

			bw.flush();
			System.out.println("완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
