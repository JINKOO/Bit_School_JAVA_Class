package kr.ac.smu.day02;

//논리 연산은 교환법칙 성립 안한다.

public class OperationMain {

	public static void main(String[] args) {

		int num = 12;
		int num2 = 4; //num2가  num의 약수인지 num2가 0이면 문제가 발생 한다.
		
		System.out.println("약수 여부 판단" + (num2 != 0 && num % num2 == 0));
		int a = 1;
		int b = 0;
		int c = -1;
		
		//System.out.println(++a > 0 && --b < 0 && ++c > 0);
		//System.out.println(++a > 0 && ++c > 0 && --b < 0); //b의 연산을 아예 보지 않는다. 앞에가 false이므로 b값 변화 없다.
		System.out.println(a-- <= 0 && ++b >= 0 || ++c >= 0); //and우선순위 > or //b값 안쳐다 본다
		//System.out.println(--a >= 0 || ++b >= 0 && ++c >= 0); //앞에가 참이므로 뒤에 b c아예 쳐다보지 않는다.
		System.out.println("a = " + a + ", b = " + b + ", c = " + c);
	}
}
