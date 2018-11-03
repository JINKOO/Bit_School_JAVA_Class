package kr.ac.smu.day03;

public class BreakMain {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++) {
			System.out.print("반복문 시작...");
			System.out.print(i + " ");
			
			if(i >= 3)  // if(i>=3) 많이 쓰인다.
				//break;//여기서 가장가까운 반복문에서 빠져나온다.반복문 강제 종료
				continue; //반복문은 일단 지정된 횟수만큼 돌아야한다. continue만나면 종료조건으니아 증감심, 증가식으로 옮겨간다.
			System.out.println("...반복문 종료");
		}
		
		System.out.println();
	}
}
