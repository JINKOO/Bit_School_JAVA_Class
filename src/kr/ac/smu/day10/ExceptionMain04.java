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
			try {  //try catch�� ��ø�ǰ� �� �� �ִ�.
				FileWriter fw = new FileWriter("error.log");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} //������ ������ ����� �ش�. ������ �Է��Ҷ� ������ �߻� �� �� �����Ƿ�
			//e.printStackTrace();
		} //a.txt��ġ�� ���� �� �ִ�. ������ ������ ���� ó��. ������ �ݵ�� ����ó�� �ϵ��� ���� Checked Exception.
		
	}
}
