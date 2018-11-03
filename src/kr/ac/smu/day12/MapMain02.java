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
	//�߿��� �޼ҵ�
	//�츮�� ����� class���� equals���Ÿ� �������̵� ������ �ؿ��ȴ�.String�� �̹� �ִ�  class�̹Ƿ� �׳� equals�� ���� �ȴ�.
	public boolean equals(Object obj) {
		Member m = (Member)obj; //����� ����ȯ
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
		map.put(new Member("ȫ�浿", "010-3187-5668"), new Car("�ҳ�Ÿ", "12��5678"));
		map.put(new Member("�ֱ浿", "010-1234-5678"), new Car("���", "42�� 4567"));
		//������ �ٲٰ� �ʹ�.Member�� ���ٶ�� �ϰ� ������..
		map.put(new Member("ȫ�浿", "010-3187-5668"), new Car("�ڶ���C", "56�� 9393"));
		
		
		System.out.println("��ϵ� ������� : " + map.size());
		
		String str = "Hello";
		String str2 = new String("Hello");
		
		System.out.println("str hashcode : " + str.hashCode());
		System.out.println("str2 hashcode : " + str2.hashCode());
		
		Member m = new Member("ȫ�浿", "010-1111-2222");
		Member m2 = new Member("ȫ�浿", "010-1111-2222");
		
//		if(m == m2) { //����Ű�� �ν��Ͻ� ��ü�� �ٸ���. //��ü�� ������ ������ ���ϰ� �ʹ�.
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
		
		//Object Ŭ�󽺿��� �ν��Ͻ� ��ü�� ������ ���� ������ ���ϴ� �޼ҵ尡 �ִ�. => equals()
		//��ü���� ����θ� �� �Ҷ� equals();
		//String ���� ���� ���� ���ڿ����� ���Ҷ� equals()���µ� �̰��� ��ü�� ����θ� �� �ϰ� �; �ִ�.
		
		
		Set<Member> set = new HashSet<>();
		set.add(m);
		set.add(m2);
		
		System.out.println("�� ���� : " + set.size());
		
		//��ü�� ���� = equals�������̵�(����� ����) + hashcode(��ü��)�� ���� ���ؾ��Ѵ�.
	}
}
