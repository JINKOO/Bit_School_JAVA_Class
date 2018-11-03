package kr.ac.smu.day10;

import java.util.Random;

public class ExceptionMain03 {

	public static void main(String[] args) {

		System.out.println("main start...");

		for (int i = -2; i < 4; i++) {
			try {
				System.out.println(1 / i);
			} catch (ArithmeticException ae) {
				//ae.printStackTrace();
				System.out.println("���ܹ߻�!!!");
				break;
			}finally { //break������ ���������� ���� �ƴ϶� finally���� �� break�� ����. finally�� ������ ����ȴ�. �޼ҵ�(return) ȣ��or �ݺ���(break) ���� finally.���� ����.
				System.out.println("�ݺ��� ������");
			}
		}
		System.out.println("main end...");
	}
}
