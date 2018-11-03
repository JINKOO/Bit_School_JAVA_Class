package kr.ac.smu.day12;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Member {
	
	private String name;
	private String phone;
	
	public Member(String name, String phone) {
		
		this.name = name;
		this.phone = phone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		return result;
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Member other = (Member) obj;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		if (phone == null) {
//			if (other.phone != null)
//				return false;
//		} else if (!phone.equals(other.phone))
//			return false;
//		return true;
//	}
//	
	
	@Override
	//중요한 메소드
	//우리가 만드는 class에서 equals쓸거면 오버라이드 무조건 해여된다.String은 이미 있는  class이므로 그냥 equals를 쓰면 된다.
	public boolean equals(Object obj) {
		Member m = (Member)obj; //명시적 형변환
//		if(this.name.equals(((Member)obj).name))
		if(this.name.equals(m.name) && phone.equals(m.phone)) {  
			return true;
		} else {
			return false;
		}
	}
}

class Car {
	
	private String model;
	private String id;
	
	public Car(String model, String id) {
		this.model = model;
		this.id = id;
	}
}

public class MapMain02 {

	public static void main(String[] args) {
		
		Map<Member, Car> map = new HashMap<>();
		map.put(new Member("홍길동", "010-3187-5668"), new Car("소나타", "12고5678"));
		map.put(new Member("최길동", "010-1234-5678"), new Car("모닝", "42나 4567"));
		//차량만 바꾸고 싶다.Member는 같다라고 하고 싶은데..
		map.put(new Member("홍길동", "010-3187-5668"), new Car("코란도C", "56허 9393"));
		
		
		System.out.println("등록된 차량대수 : " + map.size());
		
		String str = "Hello";
		String str2 = new String("Hello");
		
		System.out.println("str hashcode : " + str.hashCode());
		System.out.println("str2 hashcode : " + str2.hashCode());
		
		Member m = new Member("홍길동", "010-1111-2222");
		Member m2 = new Member("홍길동", "010-1111-2222");
		
//		if(m == m2) { //가리키는 인스턴스 객체가 다르다. //객체의 내용이 같은지 비교하고 싶다.
//			System.out.println("m == m2");
//		} else {
//			System.out.println("m != m2");
//		}
		
		if(m.equals(m2)) {
			System.out.println("m == m2");
		}else {
			System.out.println("m != m2");
		}
//		
		
		//Object 클라스에는 인스턴스 객체의 내용이 서로 같은지 비교하는 메소드가 있다. => equals()
		//객체끼리 내용부를 비교 할때 equals();
		//String 에서 서로 같은 문자열인지 비교할때 equals()쓰는데 이것은 객체의 내용부를 비교 하고 싶어서 있다.
		
		
		Set<Member> set = new HashSet<>();
		set.add(m);
		set.add(m2);
		
		System.out.println("총 개수 : " + set.size());
		
		//객체가 같다 = equals오버라이딩(내용부 동일) + hashcode(객체비교)를 같이 비교해야한다.
	}
}
