package kr.ac.smu.day12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * Set : 중복(X), 순서(X)
 *  데이터의 접근 속도 빠름
 *  
 *  구현 class
 *  -hashSet
 *  -treeSet
 *  
 */
public class SetMain {

	public static void main(String[] args) {
		
//		Set<String> set = new HashSet<>(); //해쉬코드로(정렬된 형태가 아님.)
		Set<String> set = new TreeSet<>(); //사전순 정렬(정렬된 형태로 출력하고 싶을때 많이 쓴다.)
		
		System.out.println("입력전 date의 개수 : " + set.size() + "개");
		
		boolean bool = set.add("one");
		System.out.println("\'one\' 입력 : " + (bool? "성공" : "실패"));
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		bool = set.add("one");
		System.out.println("\'one\' 입력 : " + (bool? "성공" : "실패"));
		//이미 중복된 data가 있으면 튕긴다. 맨처음 들어가 data를 유지한다. 
		
		System.out.println("입력전 date의 개수 : " + set.size() + "개");
		
		/*
		 * Set 전체 데이터 출력.
		 * (Set은 index가 없으므로 idex를 이용한 출력은 안된다.)
		 * 1. 1.5버전의 for문
		 * 2. Iterator 사용.
		 * 3. toArray() 사용
		 */
		
		System.out.println("< 1.5버전 for문으로 출력 > ");
		for(String str : set) { //우리가 입력 했던 것과 다르게 출력. 순서를 가지고 있지 않기 때문에
			System.out.println(str);
		}
		System.out.println();
		
		System.out.println("<Iterator() 사용한 출력>");
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		System.out.println(" < toArray()를 이용한 출력 > ");
		
		Object[] array = set.toArray();
		//System.out.println(Arrays.toString(array));
		
		for(Object obj : array) {
			String data = (String)obj; //형변환 해줘야
			System.out.println(obj + ", " + data.length());
		}
	}
}
