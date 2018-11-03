package kr.ac.smu.day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*
 * Map: key, value ������ �̷���� ����, ����(X) key�ߺ�(X) value�ߺ�(O)
 * 
 * ���� class
 *   -HashMap
 *   -TreeMap
 *   
 *   
 * �ֿ� �޼ҵ�
 * put(k,v)    : data�Է�
 * putAll(Map) : Map�� �����͸� ��ü �Է�
 * get(k)      : key�� �ش��ϴ� Value ��ȸ
 * remove(k)   : key�� �ش� �ϴ� ������ ����
 * containsKey(k) :data�ֳ� ����.
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

		// List Class�ʹ� ���� �����̴�. �ݷ����̶� �ٸ� Ÿ���̴�.
		Map<String, String> map = new HashMap<>();

		map.put("aaa", "1111");
		map.put("bbb", "2222");
		map.put("ccc", "3333");
		map.put("ddd", "4444");
		//map.put("aaa", "5555"); // key�� ���� �ߺ��� ������� �ʴ´�. aaa�� ��� �ν��ұ�? => �ߺ���
								// key�� ����� �غ��� ����� ����� �Ѵ�. Set�� �ߺ��� �� ������ �׳�
								// �����.

		// System.out.println("��ü �������� ���� : " + map.size() + "��");

		// �ش� ID�� ��й�ȣ�� �ٲٰ� �ʹ�. ���̵� : "aaa" �� ���� value(��й�ȣ) -> "1234"�� �����ϰ�
		// �ʹ�.

		Scanner sc = new Scanner(System.in);

		System.out.println("�н����� ���� ���� �Դϴ�.");
		System.out.print("���̵� �Է� �ϼ��� : ");
		String id = sc.nextLine();
		// ���̵� Map�� �ֳ� ���� ���� Ȯ�� �ؾ� �Ѵ�.

		if (!map.containsKey(id)) {
			System.out.println("�Է��Ͻ� ID[" + id + "] �� ���� ���� �ʽ��ϴ�.");
			System.out.println("���񽺸� �����մϴ�.");
			System.exit(0);
		}
		
		System.out.println("���� �н����� �Է� : ");
		String password = sc.nextLine();
		
		if(!map.get(id).equals(password)) { //password�� ���� ���� �ʴٸ�
			System.out.println("�Է� �Ͻ� �н����尡 Ʋ���ϴ�.");
			System.out.println("���񽺸� �����մϴ�.");
			System.exit(0);
		}
		
		
		System.out.print("������ �н����带 �Է� �ϼ��� : ");
		String newPassward = sc.nextLine();   //���� Ű�� ������ value ���� ����.=>put���.
		
		
		map.put(id, newPassward);
		System.out.println("�н����尡 ����Ǿ����ϴ�.");
		

		// ��ü �����͸� ��� �ϱ� ���ؼ��� �̴�δ� �ָ��ϴ�. -> entrySet() �̿��Ѵ�.
		// Map��ü���� ���� �� �� ����.
		System.out.println("<��ü ������ ��� >");
		Set<String> keys = map.keySet(); //map�� ������ key�� ��Ƽ� �ϳ��� Set�� �����.
		
		for(String key : keys) {
			System.out.println("key : " + key);
		}
		//key�� �˸� �׿� �ش��ϴ� value�� �� �� �ִ�.
		System.out.println("===============================");
		for(String key : keys) {
			System.out.println("key : " + key + ", value : " + map.get(key));
		}
		
		
		//��� 2
		/*
		Set<Entry<String, String>> entry = map.entrySet(); // ���� key value�� �̾�
															// ���� ���� Entry�̴�.

		for (Entry<String, String> e : entry) { // ���� �������.
			System.out.println("key : " + e.getKey() + ", Value : "
					+ e.getValue());
		}
		*/
		
		
		
		
		//////////////////////////////////////////////////////////////////
		//������ class�� �߻�ȭ ��Ű�� ������ ó���ϴ� ���� ����. <Map>���ٴ� list�� ���� �ְ� 
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

