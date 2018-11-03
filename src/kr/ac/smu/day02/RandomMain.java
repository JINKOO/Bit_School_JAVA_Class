package kr.ac.smu.day02;

import java.util.Random;
import java.lang.String;  //lang package는 자동 import된다. 굳이 안써도 됨.

/*
 * 임의 정수 추출
 * 2가지 방법. Math.random() // Random()
*/

public class RandomMain {

	public static void main(String[] args) {

		int num = (int)(Math.random() * 10); 
		//Math.random() => 0~9.xxx 
		// 0이상 1미만
		
		Random r = new Random();
		int random = r.nextInt(10); 
		//0~9까지의 수
		//임의의 양수만 추출. 양의 정수를 10으로 나누었을때 나머지들중에서 나오도록.
		
		System.out.println("num : " + num);
		System.out.println(random);
		
	}
}
