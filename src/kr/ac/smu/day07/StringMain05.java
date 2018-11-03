package kr.ac.smu.day07;

public class StringMain05 {

	public static void main(String[] args) {
		
		String str = new String();
		
		long start = System.currentTimeMillis(); //현재시간을 뽑아준다. 리턴 타입은 long
		for(int i = 0; i< 100000; i++) {
			str = str + i;
		}
		long end = System.currentTimeMillis();
		
		System.out.println("소요시간 : " + (end - start) / 1000. + "초");
		
		
		System.out.println();
		
		//-----------------------------------------------------------------------------------------
		
		StringBuffer sb = new StringBuffer(); //비어있는 문자열을 만드는 방식
		
		start= System.currentTimeMillis();
		for(int i = 1; i<100000; i++) {
			sb.append(i);  //기본 자료형 + String class만 +로 문자열 표현가능
		}
		
		end = System.currentTimeMillis();
		System.out.println("소요시간 : " + (end - start) / 1000. + "초");
	}
}
