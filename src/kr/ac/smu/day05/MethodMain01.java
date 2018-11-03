package kr.ac.smu.day05;

/*
 *  
 *  ***********
 *  Hello
 *  ***********
 *  Hi
 *  ***********
 *  Good-by
 *  ***********
 *  
 */

//문장들을 모아놓은 집합 : 메소드
public class MethodMain01 {

	static void printStar(char c, int star) { // 피호출자 메소드(호출당하는 메소드)

		for (int i = 0; i < star; i++) {
			System.out.print(c);
			
		}
		System.out.println();
	}

	static int add(int a, int b) {
		int sum = a + b;
		return sum; //return -> 나를 호출했던 메소드로 강제 복귀하는 기능. 호출자에게 어떤값을 넘겨줄것인지 써준다.
		//return;
	}
	
	public static void main(String[] args) { // main : 호출자 메소드 (호출하는 메소드)

		// 반복문은 반복되는 문장이 연속적으로 나올때만 사용가능.
		
		int sum = add(3,5); //피호출자가 호출자에게 전달할 수 있는 경우에는 0-1개. but 배열을 사용하면 여러개의 값을 쓸 수 있다.
		System.out.println("두수의 합은 : " + sum);
		
		printStar('*', 10);
		System.out.println("Hello");
		printStar('#', 5);
		System.out.println("Hi");
		printStar('!', 20);
		System.out.println("Good-By");
		printStar('-', 15);

	}
}
