package kr.ac.smu.day03.exam;

/*
 *    *
 *    **
 *    ***
 *    ****
 *    *****
 *    ****
 *    ***
 *    **
 *    *
 *    
 *    for문 3개 + if1개
 *    for문 2개 + if1개
 */

public class ExamMain05 {

	public static void main(String[] args) {

		int star = 1; //처음에 '*'하나이므로
		
		for(int i = 1; i<=9; i++) {
			
			for(int j=1; j<=star; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
			if(i<5) {
				star++;
			}
			
			else {
				star--;
			}
		}
//		for(int i = 1; i<=9; i++) {
//			
//			if(i<=5) {
//				for(int j = 1; j<=i; j++) {
//					System.out.print("*");
//				}
//			} else {
//				
//				for(int j = 1; j<= 10 - i; j++) {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
		
		//내가 짠것
//		for(int i =0; i<10; i++) {
//			
//			for(int j = 0; j<10; j++) {
//				
//				if(i<5 && i>=j)
//					System.out.print("*");
//				
//				else if(i>=5 && i<j)
//					System.out.print("*");
//				}
//			System.out.println();
//		}
	}
}
