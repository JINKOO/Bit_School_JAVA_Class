package kr.ac.smu.day01;

import java.io.*;

public class PrintMain {

	public static void main(String[] args) {

		System.out.printf("%d + %d = %d\n", 3, 4, 3 + 4);

		System.out.println(3 + "+" + 4 + "=" + (3 + 4));

		System.out.println('A' + 'B');

		// 문자 + 문자 -> 정수로 출력 된다. 컴퓨터는 모은 문자를 아스키 코드로 인식하기 때문에.
		// 컴퓨터눈 왼족에서 2개씩 연산한다.

		System.out.printf("5>4 참거짓 판단%b\n", 4 + 5 > 4);
		System.out.printf("[%d]\n", 123);
		System.out.printf("[%5d]\n", 123);
		System.out.printf("[%+5d]\n", 123);
		System.out.printf("[%-5d]\n", 123);
		System.out.printf("[%05d]\n", 123);
		System.out.printf("[%5d]\n", 123456);

	}
}
