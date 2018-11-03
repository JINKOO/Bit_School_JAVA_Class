package kr.ac.smu.day10;

import java.util.Random;

/*
 * 
 * throw
 * ����� ���� ����ó�� 
 * ������ ����ó�� class�� ���� �� �ִ�.
 * ��, Exception class�� ��� �޾ƾ��Ѵ�.
 * 
 */

public class ExceptionMain07 {

	public static void main(String[] args) {

		Random r = new Random();

		try {
			int random = r.nextInt(10);
			// 5�̻��� ������ ���� �߻�. JVM�� 5�̻��̸� ���ܰ� �ƴϴ�. but ����ڰ� �����ϰ� ���� => ���������� ���ܸ� �߻���Ų��.
			System.out.println("����� ���� : " + random);
			if (random >= 5) {
				//throw new Exception();
				throw new Exception("5�̻��� �����Դϴ�."); //��Ȯ�� ���� �������� �𸥴�. => ����ڰ� ������ ����ó�� class�� ���� �� �ִ�. Exception class�� ���.
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
