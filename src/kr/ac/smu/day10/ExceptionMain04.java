package kr.ac.smu.day10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionMain04 {

	public static void main(String[] args) {
		
		
		try {
			FileReader fr = new FileReader("a.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			try {  //try catch를 중첩되게 쓸 수 있다.
				FileWriter fw = new FileWriter("error.log");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} //파일이 없으면 만들어 준다. 하지만 입력할때 에러가 발생 할 수 있으므로
			//e.printStackTrace();
		} //a.txt장치가 없을 수 있다. 컴파일 시점의 예외 처리. 무조건 반드시 예외처리 하도록 유도 Checked Exception.
		
	}
}
