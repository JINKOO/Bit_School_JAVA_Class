package kr.ac.smu.day04;

import java.util.Arrays;

public class ArrayMain02 {
/*
 * 참조형 변수 배열
 */
	public static void main(String[] args) {
		
	//"상명대" "자바" "교육" 문자열 저장하는 strArr배열 생성
		
		//String[] strArr = {"상명대", "자바", "교육"};
		//String[] strArr = new String[] {"상명대", "자바", "교육"};
		
		//문자열의 길이를 모른다.
		//참조 자료 배열은 내부적으로 2차원 배열 형태를 취한다.
		//각각은 참조 변수배열을 의미한다.(기본자료형 배열과는 다르다.)
		//"상명대"는 따로 공간이 존재하고 참조변수가 이를 가리킨다.(2차원배열 형태)
		
		String[] strArr = new String[5];
		/*
		 * 1.strArr 참조변수 생성
		 * 2.new에 의해 heap영역에 참조 변수배열 생성 (초기화 안하면 현재 null값이 들어간다.)
		 * 3.이 각각의 배열이 문자열을 가리키도록 해야한다.(null값이 아니라 해당 문자열이 가리킨다.)
		 * 
		 */
		
//		strArr[0] = "상명대";
//		strArr[1] = "자바";
//		strArr[2] = "교육";

		/*
		 * data 중간에 삽입 
		 * index값을 일일히 변경해야한다.(index에 의한 문제가 발생한다.)
		 * index를 나타내는 변수를 이용하는 것이 좋다.
		 * 삽입과 삭제가 자유롭게 된다.
		 * 
		 */
		
//		int loc = 0;
//		strArr[loc++] = "상명대";
//		strArr[loc++] = "겨울방학";
//		strArr[loc++] = "자바";
//		strArr[loc++] = "교육";
		
		//참조 변수는 항상 new키워드 사용. String은 특이하게 기본 자료형과 같이 변수 나타낼수 있다.
		//but 객체 참조형 변수는 new키워드 사용하여 나타내는 것이 일반적이다.
		
		strArr[0] = new String("상명대");
		strArr[1] = new String("자바");
		strArr[2] = new String("교육");
		System.out.println("<방법 1 - index이용 >");
		for(int i = 0; i<strArr.length; i++) {
			System.out.print(strArr[i] + "\t");
		}
		System.out.println();
		
		System.out.println("<방법 2 - 1.5버전의 for문>");
		for(String str : strArr) {
			System.out.print(str + "\t");
		}
		System.out.println();
		
		System.out.println("<방법 3 - Arrays.toString()>");
		System.out.println(Arrays.toString(strArr));
		
		
		Hotdog hot; //현재 참조 변수만 만듬(heap영역에 아직 공간 안만듬).
		hot = new Hotdog(); //heap영역에 공간 만들고 hot가 이 공간을 가리킨다.
		
		Hotdog hot2 = new Hotdog();
		
		//사용자가 만든 class자료형은 주소 출력시 package + 주소가 나온다.
		System.out.println("hot : " + hot);
		System.out.println("hot : " + hot2);
		
		Hotdog[] hotArr = new Hotdog[2]; //참조변수 2개를 만듬. 현재 null로 초기화 되있다.
		hotArr[0] = new Hotdog();
		hotArr[1] = new Hotdog();
		
		for(int i = 0; i<hotArr.length; i++) {
			
		}
		
		System.out.println(Arrays.toString(hotArr)); //초기화 되있지 않으므로 null이 출력
	}
}

class Hotdog { //이 이름이 자료형이 될 수 있다. =>Hotdog이용하여 배열을 만들 수 있다.
	
}
