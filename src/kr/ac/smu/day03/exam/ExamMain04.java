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
 * for�� 3��
 * for�� 2�� �� if��
 */
public class ExamMain04 {

	public static void main(String[] args) {

		for(int i = 1; i<=5; i++) {
			
			for(int j = 1; j<=5; j++) {
				if(j<i) { //*�� ���� ��ġ�� i�� j�� �������̴�.
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
