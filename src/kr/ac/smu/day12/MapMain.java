package kr.ac.smu.day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*
 * Map: key, value 쌍으로 이루어진 집합, 순서(X) key중복(X) value중복(O)
 * 
 * 구현 class
 *   -HashMap
 *   -TreeMap
 *   
 *   
 * 주요 메소드
 * put(k,v)    : data입력
 * putAll(Map) : Map에 데이터를 전체 입력
 * get(k)      : key에 해당하는 Value 조회
 * remove(k)   : key에 해당 하는 데이터 삭제
 * containsKey(k) :data있나 존재.
 * entyrSet()
 * 
 */

class User {
	
	private String id;
	private String password;
	
	User(String id, String password) {
		this.id = id;
		this.password = password;
	}
}

public class MapMain {

	public static void main(String[] args) {

		// List Class와는 완전 별개이다. 콜렉션이랑 다른 타입이다.
		Map<String, String> map = new HashMap<>();

		map.put("aaa", "1111");
		map.put("bbb", "2222");
		map.put("ccc", "3333");
		map.put("ddd", "4444");
		//map.put("aaa", "5555"); // key에 대한 중복은 허용하지 않는다. aaa를 어떻게 인식할까? => 중복된
								// key를 출력을 해보면 닾어쓰기 방식을 한다. Set은 중복된 값 누르면 그냥
								// 퉁긴다.

		// System.out.println("전체 데이터의 개수 : " + map.size() + "개");

		// 해당 ID의 비밀번호를 바꾸고 싶다. 아이디가 : "aaa" 인 것의 value(비밀번호) -> "1234"로 변경하고
		// 싶다.

		Scanner sc = new Scanner(System.in);

		System.out.println("패스워드 변경 서비스 입니다.");
		System.out.print("아이디를 입력 하세요 : ");
		String id = sc.nextLine();
		// 아이디가 Map에 있나 없나 먼저 확인 해야 한다.

		if (!map.containsKey(id)) {
			System.out.println("입력하신 ID[" + id + "] 는 존재 하지 않습니다.");
			System.out.println("서비스를 종료합니다.");
			System.exit(0);
		}
		
		System.out.println("현재 패스워드 입력 : ");
		String password = sc.nextLine();
		
		if(!map.get(id).equals(password)) { //password가 서로 같지 않다면
			System.out.println("입력 하신 패스워드가 틀립니다.");
			System.out.println("서비스를 종료합니다.");
			System.exit(0);
		}
		
		
		System.out.print("변경할 패스워드를 입력 하세요 : ");
		String newPassward = sc.nextLine();   //같은 키가 있으면 value 덮어 쓴다.=>put사용.
		
		
		map.put(id, newPassward);
		System.out.println("패스워드가 변경되었습니다.");
		

		// 전체 데이터를 출력 하기 위해서는 이대로는 애매하다. -> entrySet() 이용한다.
		// Map자체에서 뽑을 수 는 없다.
		System.out.println("<전체 데이터 출력 >");
		Set<String> keys = map.keySet(); //map이 가지는 key만 모아서 하나의 Set을 만든다.
		
		for(String key : keys) {
			System.out.println("key : " + key);
		}
		//key를 알면 그에 해당하는 value를 알 수 있다.
		System.out.println("===============================");
		for(String key : keys) {
			System.out.println("key : " + key + ", value : " + map.get(key));
		}
		
		
		//방법 2
		/*
		Set<Entry<String, String>> entry = map.entrySet(); // 실제 key value를 뽑아
															// 내는 것은 Entry이다.

		for (Entry<String, String> e : entry) { // 순서 상관없다.
			System.out.println("key : " + e.getKey() + ", Value : "
					+ e.getValue());
		}
		*/
		
		
		
		
		//////////////////////////////////////////////////////////////////
		//실제는 class로 추상화 시키고 정보를 처리하는 것이 좋다. <Map>보다는 list로 쓸수 있고 
		List<User> list = new ArrayList<>();
		list.add(new User("aaa", "1111"));
		list.add(new User("bbb", "2222"));
		list.add(new User("ccc", "3333"));
		list.add(new User("ddd", "4444"));
		
	}
}

// interface Map<K,V> {
// interface Entry<K, V> {
// K getKey();
// V getValue();
// }
// }

