package kr.ac.smu.day01;

import java.util.Random;

/*
 * ��� ��Ģ�� �ǰ��Ͽ�
 * Ŭ����, ����, �޼ҵ尳�� ������ �� �� ���� �м�
 * 
 * Ŭ���� : 4��(NamingMain, String, Random, system) �빮���ΰ�
 * ��  �� : 4��(args, num, r, out)
 * �޼ҵ� : 4�� (main(), nextInt(), println()) �ҹ����ΰ�
 */

public class NamingMain {

	public static void main(String[] args) {

		Random r = new Random();
		int num = r.nextInt();
		
		System.out.println("num = " + num);
	}
}

/*syso�� out�� �����̴�. 
class System {
	static java.io.PrintWriter out;
}
*/
