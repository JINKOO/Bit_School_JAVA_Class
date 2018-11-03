package kr.ac.smu.day10;

import java.util.Random;

/*
 * ���� ���� ó�� if else ���. but ����ڰ� �������� ���� ���ܰ� �߻��� �� �ִ�. �̷��� �Ϳ� �����ϰ� ��ó�ϰ� �ʹ�.
 * ���� ó�� (������ �߻� �޴��ϴ��� �׺κж����� ���������ϴ� ���� �������ؼ�, ���� �͵��� ���� �����ϰ�)
 * �����ڰ� �ڵ带 �� �� �ǵ���� ����
 * ���� �߻� (����, ����)
 * 
 * (���� ���� ó��)
 * try
 * catch //catch�� ���ٸ� ���α׷� ���� ����ȴ�. 
 * finally /���� ������� ������ ���� �Ǵ� �κ�.
 * 
 * (���� ���� ó��)
 * throws
 * (����� ���� ����ó��)
 * throw
 */

public class ExceptionMain02 {

	public static void main(String[] args) {

		System.out.println("main start...");
		Random r = new Random();

		int num = r.nextInt(2);// 0-2;
		System.out.println("����� ���� : " + num);
		
		try {
			System.out.println(10 / num); 
		} catch(ArithmeticException ae) { //ae�� ��� ���������� ���� ������ �����ϴ� ArithmeticExceptionŸ���� ����
			//System.out.println("���� �߻�!!!");
			//System.out.println(ae.getMessage());
			ae.printStackTrace();//��� ���忡�� ������ ������ ����. ���� �̰��� ���� ����.
		}
		
		System.out.println("main end...");
	}
}
