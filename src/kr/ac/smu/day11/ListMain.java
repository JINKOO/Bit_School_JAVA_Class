package kr.ac.smu.day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/*
 * List Ư¡ : ����(o) �ߺ�(o);
 * 
 *   ���� class : 1. ArrayList  2. LinkedList
 *   
 *�޼ҵ�
 *  add(E e)                 :data �Է�
 *  addAll(List l)           :����Ʈ�� ��ü�����͸� �߰� �Է�(�Է�)
 *  get(int i)               :����Ʈ�� ������ ������ ����
 *  E remove(int i)          :�ش��ϴ� �ε����� ������ ����. ���ϰ�: ������ ��(data)
 *  boolean remove (E e)     :�ش� ������ ����(���� ���� ����) 
 *  clear()                  :��ü data�� ����.
 *  size()                   :����Ʈ�� ��ü ������ ����.
 *  boolean contains(E  e)   :�ش� data�� ���� ���� �Ǵ�.
 *  boolean isEmpty()        :����Ʈ�� ����ִ��� �Ǵ�
 *  iterator                 :Iterator ��ü�� ��ȯ.(�迭�� ������ �ִ� ��� ��ҿ� ����)
 *  
 */
public class ListMain {

	public static void main(String[] args) {
		
//		ArrayList<String> list = new ArrayList<String>();
		
		//List<String> list = new ArrayList<String>(); //1.7���� ����
		List<String> list = new ArrayList<>();         //1.7.���� ����. Ÿ�� ��������
		
		System.out.println("�Է� �� ��ü �������� ���� : " + list.size() + "��");
		
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
//		list.add(new StringBuilder());
		
		System.out.println("�Է� �� ��ü �������� ���� : " + list.size() + "��");
		
		
		list.add("one"); //�ߺ� ���
		System.out.println("�Է� �� ��ü �������� ���� : " + list.size() + "��");
		
		/*
		 * List ��ü ������ ��� ���.
		 * 1. index�� Ȱ���� get() �̿�
		 * 2. 1.5������ for�� �̿�.
		 * 3. toArray() �޼ҵ带 �̿��ؼ� ���.
		 * 4. iterator() �޼ҵ� �̿�.
		 */

		System.out.println("1.index�� �̿��� get() �̿�");
		for(int index = 0; index < list.size(); index++) {
			System.out.println(list.get(index));
		}
		
		
		System.out.println("<1.5������ for���� �̿��� ���>");
		for(String str : list) {
			System.out.println(str);
		}
		
		System.out.println("<toArray()�� �̿��� ���");
		
		//set�϶� toArray�� ���� ����. list������ ����Ҷ��� �� �Ⱦ���.
		Object[] array = list.toArray();  //���� �迭�� �ٲ��ְ� Object��
		System.out.println(Arrays.toString(array));
		
		
		/*
		 * Iterator(��ȯ�� : ó������ ���������� ����) �ֿ� �޼ҵ�
		 *  -hasNext() : ���� ��ġ���� ���� ���� �������� ���� ���� �Ǵ�.
		 *  -next() : ���� �����Ͱ� �ִٸ� �� data�� ����.
		 */
		
		
		System.out.println("<iterator �޼ҵ带 �̿��� ��� ���>");
		Iterator<String> ite = list.iterator(); //iterator: ��ü�� �������Ѵ�.
		
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		System.out.println("������ 0���� ������ : " + list.get(0));
		
		//"one"����
		
		boolean bool = list.remove("one");
		System.out.println("\"one\" ���� ���� : " + bool);
		
		System.out.println("������ 0���� ������ : " + list.get(0));
		
		bool = list.remove("one"); //�ߺ���� 
		System.out.println("\"one\" ���� ���� : " + bool);
		
		bool = list.remove("one");
		System.out.println("\"one\" ���� ���� : " + bool);
		
		System.out.println("0������ ��ġ�� ���ڿ� : " + list.get(0));
		System.out.println("0������ ��ġ�� ���ڿ� ���� : " + list.remove(0)); //�����ϰ� ������ ���ڿ� ����.
		
		if(list.contains("two")) {
			System.out.println("\"two\" ���ڿ��� �����մϴ�.");
		} else {
			System.out.println("\"two\" ���ڿ��� �������� �ʽ��ϴ�..");
		}
		
		
		System.out.println("��ü �������� ���� : " + list.size());
		
		List<String> sub = new ArrayList<>();
		sub.add("1");
		sub.add("2");
		sub.add("3");
		sub.add("4");
		
		
		list.addAll(sub);
		
		System.out.println("addAll()�� �������� ���� : " + list.size() + "��");
		System.out.println(Arrays.toString(list.toArray()));
		
		list.add(3, "5"); //������ �ε����� data�� ������� �� �� �ִ�. 
		System.out.println(Arrays.toString(list.toArray()));
		
		//list.clear();
		
		if(list.isEmpty()) {
			System.out.println("�迭�� data�� �����ϴ�.");
		} else {
			System.out.println("�迭�� data�� �ֽ��ϴ�.");
		}
		
//		List<int> list2 = new ArrayList<int>();
		//�ݷ����� ������ ���� �ڷ����� �����ϴ�.
		//�ڹٿ����� �⺻ �ڷ����� ���� �ڷ������� �ν��ϱ����� Wrapper Class�� �����Ѵ�.
	}
}
