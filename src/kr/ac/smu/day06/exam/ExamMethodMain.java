package kr.ac.smu.day06.exam;

public class ExamMethodMain {

	public static void main(String[] args) {
		//� Ŭ������ �����ϱ� ���ؼ��� �ν��Ͻ� ��ü�� ���� �����ؾ� �Ѵ�.
		ExamMethod exam = new ExamMethod();
		
		int sum = exam.sum(1, 10);
		System.out.println(sum);
		
		/*
		 * ������ �Է� : 1
		 * ������ �Է� : 10
		 * 
		 * 1~10���� : 55
		 */
		
		int num1 = exam.getInt();
		int num2 = exam.getInt();
		int total = exam.getSum(num1, num2);
		exam.displayTotalSum(num1,num2,total);
		System.out.println();
		
		int[] arr = exam.getNums(); //1~100������ 10�� �߻�.
		exam.displayArr(arr);
		
		int size = exam.getInt();
		arr = exam.getNums(size);  //1~100 ������ size�� ����
		exam.displayArr(arr);
		
		int max = exam.getInt();
		arr = exam.getNums(size, max); //1~max������ size�� ���.
		exam.displayArr(arr);
	}
}
