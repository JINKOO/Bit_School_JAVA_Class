package kr.ac.smu.day01;

import java.io.*;

public class PrintMain {

	public static void main(String[] args) {

		System.out.printf("%d + %d = %d\n", 3, 4, 3 + 4);

		System.out.println(3 + "+" + 4 + "=" + (3 + 4));

		System.out.println('A' + 'B');

		// ���� + ���� -> ������ ��� �ȴ�. ��ǻ�ʹ� ���� ���ڸ� �ƽ�Ű �ڵ�� �ν��ϱ� ������.
		// ��ǻ�ʹ� �������� 2���� �����Ѵ�.

		System.out.printf("5>4 ������ �Ǵ�%b\n", 4 + 5 > 4);
		System.out.printf("[%d]\n", 123);
		System.out.printf("[%5d]\n", 123);
		System.out.printf("[%+5d]\n", 123);
		System.out.printf("[%-5d]\n", 123);
		System.out.printf("[%05d]\n", 123);
		System.out.printf("[%5d]\n", 123456);

	}
}
