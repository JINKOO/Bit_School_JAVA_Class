package kr.ac.smu.day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/*
 * List 특징 : 순서(o) 중복(o);
 * 
 *   구현 class : 1. ArrayList  2. LinkedList
 *   
 *메소드
 *  add(E e)                 :data 입력
 *  addAll(List l)           :리스트의 전체데이터를 추가 입력(입력)
 *  get(int i)               :리스트의 임의의 데이토 추출
 *  E remove(int i)          :해당하는 인덱스의 데이토 삭제. 리턴값: 삭제한 값(data)
 *  boolean remove (E e)     :해당 데이터 삭제(삭제 여부 리턴) 
 *  clear()                  :전체 data를 삭제.
 *  size()                   :리스트의 전체 데이토 개수.
 *  boolean contains(E  e)   :해당 data의 존재 여부 판단.
 *  boolean isEmpty()        :리스트가 비어있는지 판단
 *  iterator                 :Iterator 객체를 반환.(배열이 가지고 있는 모든 요소에 접근)
 *  
 */
public class ListMain {

	public static void main(String[] args) {
		
//		ArrayList<String> list = new ArrayList<String>();
		
		//List<String> list = new ArrayList<String>(); //1.7버전 이전
		List<String> list = new ArrayList<>();         //1.7.버전 이후. 타입 생략가능
		
		System.out.println("입력 전 전체 데이터의 개수 : " + list.size() + "개");
		
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
//		list.add(new StringBuilder());
		
		System.out.println("입력 전 전체 데이터의 개수 : " + list.size() + "개");
		
		
		list.add("one"); //중복 허용
		System.out.println("입력 전 전체 데이터의 개수 : " + list.size() + "개");
		
		/*
		 * List 전체 데이터 출력 방법.
		 * 1. index를 활용한 get() 이용
		 * 2. 1.5버전의 for문 이용.
		 * 3. toArray() 메소드를 이용해서 출력.
		 * 4. iterator() 메소드 이용.
		 */

		System.out.println("1.index를 이용한 get() 이용");
		for(int index = 0; index < list.size(); index++) {
			System.out.println(list.get(index));
		}
		
		
		System.out.println("<1.5버전의 for문을 이용한 출력>");
		for(String str : list) {
			System.out.println(str);
		}
		
		System.out.println("<toArray()를 이용한 출력");
		
		//set일때 toArray를 많이 쓴다. list데이터 출력할때는 잘 안쓴다.
		Object[] array = list.toArray();  //고정 배열로 바꿔주고 Object형
		System.out.println(Arrays.toString(array));
		
		
		/*
		 * Iterator(순환자 : 처음부터 마지막까지 접근) 주요 메소드
		 *  -hasNext() : 현재 위치에서 부터 다음 데이터의 존재 여부 판단.
		 *  -next() : 다음 데이터가 있다면 그 data를 추출.
		 */
		
		
		System.out.println("<iterator 메소드를 이용한 출력 방식>");
		Iterator<String> ite = list.iterator(); //iterator: 객체를 만들어야한다.
		
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		System.out.println("삭제전 0번지 데이터 : " + list.get(0));
		
		//"one"삭제
		
		boolean bool = list.remove("one");
		System.out.println("\"one\" 삭제 여부 : " + bool);
		
		System.out.println("삭제후 0번지 데이터 : " + list.get(0));
		
		bool = list.remove("one"); //중복허용 
		System.out.println("\"one\" 삭제 여부 : " + bool);
		
		bool = list.remove("one");
		System.out.println("\"one\" 삭제 여부 : " + bool);
		
		System.out.println("0번지에 위치한 문자열 : " + list.get(0));
		System.out.println("0번지에 위치한 문자열 삭제 : " + list.remove(0)); //삭제하고 삭제한 문자열 찍음.
		
		if(list.contains("two")) {
			System.out.println("\"two\" 문자열이 존재합니다.");
		} else {
			System.out.println("\"two\" 문자열이 존재하지 않습니다..");
		}
		
		
		System.out.println("전체 데이터의 개수 : " + list.size());
		
		List<String> sub = new ArrayList<>();
		sub.add("1");
		sub.add("2");
		sub.add("3");
		sub.add("4");
		
		
		list.addAll(sub);
		
		System.out.println("addAll()후 데이터의 개수 : " + list.size() + "개");
		System.out.println(Arrays.toString(list.toArray()));
		
		list.add(3, "5"); //임의의 인덱스에 data를 집어넣을 수 도 있다. 
		System.out.println(Arrays.toString(list.toArray()));
		
		//list.clear();
		
		if(list.isEmpty()) {
			System.out.println("배열에 data가 없습니다.");
		} else {
			System.out.println("배열에 data가 있습니다.");
		}
		
//		List<int> list2 = new ArrayList<int>();
		//콜렉션은 무조건 참조 자료형만 가능하다.
		//자바에서는 기본 자료형을 참조 자료형으로 인식하기위한 Wrapper Class가 존재한다.
	}
}
