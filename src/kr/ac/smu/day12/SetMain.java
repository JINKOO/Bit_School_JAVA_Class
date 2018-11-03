package kr.ac.smu.day12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * Set : �ߺ�(X), ����(X)
 *  �������� ���� �ӵ� ����
 *  
 *  ���� class
 *  -hashSet
 *  -treeSet
 *  
 */
public class SetMain {

	public static void main(String[] args) {
		
//		Set<String> set = new HashSet<>(); //�ؽ��ڵ��(���ĵ� ���°� �ƴ�.)
		Set<String> set = new TreeSet<>(); //������ ����(���ĵ� ���·� ����ϰ� ������ ���� ����.)
		
		System.out.println("�Է��� date�� ���� : " + set.size() + "��");
		
		boolean bool = set.add("one");
		System.out.println("\'one\' �Է� : " + (bool? "����" : "����"));
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		bool = set.add("one");
		System.out.println("\'one\' �Է� : " + (bool? "����" : "����"));
		//�̹� �ߺ��� data�� ������ ƨ���. ��ó�� �� data�� �����Ѵ�. 
		
		System.out.println("�Է��� date�� ���� : " + set.size() + "��");
		
		/*
		 * Set ��ü ������ ���.
		 * (Set�� index�� �����Ƿ� idex�� �̿��� ����� �ȵȴ�.)
		 * 1. 1.5������ for��
		 * 2. Iterator ���.
		 * 3. toArray() ���
		 */
		
		System.out.println("< 1.5���� for������ ��� > ");
		for(String str : set) { //�츮�� �Է� �ߴ� �Ͱ� �ٸ��� ���. ������ ������ ���� �ʱ� ������
			System.out.println(str);
		}
		System.out.println();
		
		System.out.println("<Iterator() ����� ���>");
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		System.out.println(" < toArray()�� �̿��� ��� > ");
		
		Object[] array = set.toArray();
		//System.out.println(Arrays.toString(array));
		
		for(Object obj : array) {
			String data = (String)obj; //����ȯ �����
			System.out.println(obj + ", " + data.length());
		}
	}
}
