package kr.ac.smu.day02;

import java.util.Random;
import java.lang.String;  //lang package�� �ڵ� import�ȴ�. ���� �Ƚᵵ ��.

/*
 * ���� ���� ����
 * 2���� ���. Math.random() // Random()
*/

public class RandomMain {

	public static void main(String[] args) {

		int num = (int)(Math.random() * 10); 
		//Math.random() => 0~9.xxx 
		// 0�̻� 1�̸�
		
		Random r = new Random();
		int random = r.nextInt(10); 
		//0~9������ ��
		//������ ����� ����. ���� ������ 10���� ���������� ���������߿��� ��������.
		
		System.out.println("num : " + num);
		System.out.println(random);
		
	}
}
