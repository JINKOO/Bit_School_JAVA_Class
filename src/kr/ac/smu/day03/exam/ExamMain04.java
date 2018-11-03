package kr.ac.smu.day03.exam;

/*
 * 
 *  *****
 *   ****
 *    ***
 *     **
 *      *
 *      
 *      
 * for문 3개
 * for문 2개 와 if문
 */
public class ExamMain04 {

	public static void main(String[] args) {

		for(int i = 1; i<=5; i++) {
			
			for(int j = 1; j<=5; j++) {
				if(j<i) { //*의 시작 위치는 i와 j가 같을때이다.
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
//		for(int i = 0; i<5; i++) {
//			
//			for(int j = 0; j<5; j++) {
//				if(i>j) {
//					System.out.print("-");
//				}
//				else
//					System.out.print("*");
//				
//			}
//			System.out.println();
//		}
		
//		for(int i = 1; i<=5; i++) {
//			
//			for(int j = 1; j <= i-1; j++) {
//				System.out.print("-");
//			}
//			
//			for (int j = 1; j <= 6-i; j++) {
//
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
	}
}
