package kr.ac.smu.day01;

import java.util.Random;

/*
 * 명명 규칙에 의거하여
 * 클래스, 변수, 메소드개의 개수가 몇 개 인지 분석
 * 
 * 클래스 : 4개(NamingMain, String, Random, system) 대문자인것
 * 변  수 : 4개(args, num, r, out)
 * 메소드 : 4개 (main(), nextInt(), println()) 소문자인것
 */

public class NamingMain {

	public static void main(String[] args) {

		Random r = new Random();
		int num = r.nextInt();
		
		System.out.println("num = " + num);
	}
}

/*syso의 out은 변수이다. 
class System {
	static java.io.PrintWriter out;
}
*/
