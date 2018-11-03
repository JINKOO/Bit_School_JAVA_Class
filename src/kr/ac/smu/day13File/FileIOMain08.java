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

		// 1.7���� ���� try��.
		// finally�� �̿��� close�ڵ带 ���̱� ����.
		// try (
		// //�ݵ�� close() �������ϴ� ���� ����.(IO, Network, DB�Ҷ� try���� �̷��� ����.
		// A a = new A();
		// ) {
		// //���ܰ� �߻� �� ���� �ڵ�.
		// } catch(Exception e) {
		// //���� ó��
		// }

		try (
				FileReader fr = new FileReader("iotest/a.txt");
				BufferedReader br = new BufferedReader(fr);
				FileWriter fw = new FileWriter("iotest/bbb.txt");
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(bw);
				
		// String str = new String("hello"); ������. autoclose�� ��� ���� �ʱ� ����.
		) {
			while (true) {
				String str = br.readLine();
				if (str == null) {
					break;
				}

				// bw.write(str);
				// bw.newLine(); //����.

				pw.println(str); // ��µ� �ϰ� ����.

			}

			bw.flush();
			System.out.println("�Ϸ�");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
