package kr.ac.smu.day03.exam;

public class ExamMain06 {

	public static void main(String[] args) {
		for(int i = 0; i<10; i++) {
			for(int j = 0; j<10; j++) {
				if(i<5 && i>=j)
					System.out.print("*");
				else if(i<5 && i<= j)
					System.out.print("-");
			}
			System.out.println();
		}
	}
}
