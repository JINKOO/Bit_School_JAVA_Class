package kr.ac.smu.day01;

public class HelloMain {

	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.printf("나는 %d살입니다.\n", 12); //문자열과 정수를 결합 시켜 출력 하고자 할때 printf
		System.out.println("나는 " + 12 + "살입니다.");  //출력형식에서는 +기호를 쓸 수 있다.(문자열 + 정수 + 문자열) 문자열 + 정수 = 문자열
		
	}
	
	/*
	static public void main(String[] args) {
	
		System.out.println("static과 public 위치 바꿔도 된다.");
	}
	*/
}

