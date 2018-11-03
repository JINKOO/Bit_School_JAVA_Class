package kr.ac.smu.day12;


import java.util.LinkedList;
import java.util.List;

/*
 * 
 * Wrapper Class(기본 자료형 -> 참조 자료형)
 * 
 *  boolean   ---> Boolean
 *  char      ---> Character
 *  byte      ---> Byte
 *  short     ---> Short
 *  int       ---> Integer
 *  long      ---> Long
 *  float     ---> FLoat
 *  double    ---> Double
 * 
 */
public class WrapperMain {

	public static void main(String[] args) {
		
		String str = "123456";
		//숫자 문자를 정수로.
		int num = Integer.parseInt(str);
		Integer num2 = Integer.valueOf(str); // 
		
		int i = 100;  //기본 자료형
		Integer i2 = new Integer(100); //Integer참조변수형(Wrapper class형)
		
		Integer i3 = 12;//원래는 에러이지만 기본 자료형 값을 가질 수 있다.(auto-boxing) new Integer(100)이라고 자동으로 인식한다.
		
		int i4 = new Integer(200);  //이것도 원래는 안된다. 자기 박스에 있는 필요한 자료형을 빼서 기본 자료형에 넣어준다. (auto-unboxing) 
		//형 변환과는 전혀 별개이다. 기본 자료형을 class로 묶는 것 -> 박싱.
		//기본 자료형과 참조자료형이 data를 주고 받는 것: 박싱 언박싱이다.
		
		
		//List<Integer> list = new ArrayList<>();
		List<Integer> list = new LinkedList<>();
		//제넉릭의 타입만 같다면 linkedlist는 arraylist와 호환.
		list.add(new Integer(10));
		list.add(20);   //auto boxing; 값을 대입할때 기본 자료형을 넣어도 된다.
		
		for(Integer n : list) {
			System.out.print(n + " ");
		}
		
		System.out.println();
		for(int u : list) {          //오토 언박싱
			System.out.print(u + " ");
		}
		
		Integer i5 = list.get(0);
		int i6 = list.get(0);
	}
}
