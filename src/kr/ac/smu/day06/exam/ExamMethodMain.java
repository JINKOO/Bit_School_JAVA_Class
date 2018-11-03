package kr.ac.smu.day06.exam;

public class ExamMethodMain {

	public static void main(String[] args) {
		//어떤 클래스를 동작하기 위해서는 인스턴스 객체를 먼저 생성해야 한다.
		ExamMethod exam = new ExamMethod();
		
		int sum = exam.sum(1, 10);
		System.out.println(sum);
		
		/*
		 * 정수를 입력 : 1
		 * 정수를 입력 : 10
		 * 
		 * 1~10총합 : 55
		 */
		
		int num1 = exam.getInt();
		int num2 = exam.getInt();
		int total = exam.getSum(num1, num2);
		exam.displayTotalSum(num1,num2,total);
		System.out.println();
		
		int[] arr = exam.getNums(); //1~100난수를 10개 발생.
		exam.displayArr(arr);
		
		int size = exam.getInt();
		arr = exam.getNums(size);  //1~100 난수를 size개 추출
		exam.displayArr(arr);
		
		int max = exam.getInt();
		arr = exam.getNums(size, max); //1~max난수를 size개 출력.
		exam.displayArr(arr);
	}
}
