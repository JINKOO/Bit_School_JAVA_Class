package kr.ac.smu.day03;

/*
 * for문 중첩 => 코딩은 행우선 방식임을 유의하자.
 * 웬만하면 2중 루푸까지만 쓴다. 속도 3중 루프는 n3
 * 
 */

public class BreakMain02 {

	public static void main(String[] args) {
		
		first:for(int i = 1; i <= 5; i++) {
			
			for(int j = 1; j<=5; j++) {
				System.out.print(i);
				if(i==1) {
					break first; //필요한 루프를 빠져나갈수 있는 키워드 만들수 있다.
					//continue first;
				}
			}
			System.out.println();
		}
	}
}
