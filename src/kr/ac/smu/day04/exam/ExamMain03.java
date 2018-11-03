package kr.ac.smu.day04.exam;

/*
 * 합을 구하는 메카니즘.
 */
public class ExamMain03 {

	public static void main(String[] args) {

		//int sum = 1; //sum을 얼마로 초기화에 따라 for문의 시작이 달라지긴 한다.
		int sum = 0; //but보통은 for문에서 어디서부터 어디까지 더할건지 눈에 잘 보이게 하기위해 sum = 0;
		for(int i = 1; i<=5; i++) {
			sum = sum + i;
		}
		System.out.printf("1-5까지의 합은 : %d\n", sum);
	}
}
