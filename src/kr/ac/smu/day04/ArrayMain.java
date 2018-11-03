package kr.ac.smu.day04;
import java.util.Arrays;
public class ArrayMain {

	/*
	 * 
	 * 배열을 출력하는 3가지
	 * 1. index 이용
	 * 2. 1.5버전 for문 이용
	 * 3. Arrays.toString() 메소드 이용
	 * 
	 * 2,3은 일부분의 data만 출력 불가능. 무조건 처음부터 끝까지
	 */
	
	public static void main(String[] args) {
		
		//int값을 기억하는 iArr배열 선언
		int[] iArr;
		
		//System.out.println("iArr : " + iArr); iArr가 초기화되어있지않아 에러발생(Stack영역)
		
		//정수를 5개 저장하는 배열 생성
		iArr = new int[5]; 
		//초기화 되어있지 않아 현재 0만 들어있다.
		
		System.out.println("iArr : " + iArr); //heap영역의 공간
		System.out.println("iArr의 원소개수 : " + iArr.length);
		System.out.println("첫번째 변수 : " + iArr[0]); //여기서는 초기화 되어있지않지만 디폴트값으로 0이 출력
		
		
		//iArr의 변수에 순서대로 10,20,30,40,50대입
		iArr[0] = 10;
		iArr[1] = 20;
		iArr[2] = 30;
		iArr[3] = 40;
		iArr[4] = 50;
		
		System.out.println("<PRINT>");
		System.out.print(iArr[0] + "\t");
		System.out.print(iArr[1] + "\t");
		System.out.print(iArr[2] + "\t");
		System.out.print(iArr[3] + "\t");
		System.out.print(iArr[4] + "\t");
		System.out.println();
		System.out.println("<index를 이용한 출력>");  //index조작을 통해 일부 원소만 출력 가능.
		
		iArr = new int[] {10,20,30,40,50};
		for(int i = 0; i < iArr.length; i++) {   //length 키워드를 이용한다.
			System.out.print(iArr[i] + "\t");
		}
		System.out.println();
		
//		iArr = new int[3];
//		System.out.println("iArr : " + iArr); //주소가 바뀌어 있다. 
		
		
		System.out.println("<1.5버전의 for문 이용 출력>"); //무조건 배열 원소 개수 만큼 출력. //출력 or 검색하는 용도로만 사용. 입력 용도 안됨
		for(int temp : iArr) { //for(임시변수 : 배열명), iArrlength만큼 돈다. 처음 한번돌때 int temp = iArr[0]값을 가진다. 
			System.out.print(temp + "\t");
		}
		System.out.println();
		
		System.out.println("< Arrays.toString() 메소드 이용 출력>"); // 리턴값이 String. 원소들을 문자열형태로 출력
		String str = Arrays.toString(iArr); //[] 와,를 이용해서 문자열 형태로 만들어준다.
		System.out.println(str);
	}
}
