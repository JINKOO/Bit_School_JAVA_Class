package kr.ac.smu.day12;


import java.util.LinkedList;
import java.util.List;

/*
 * 
 * Wrapper Class(�⺻ �ڷ��� -> ���� �ڷ���)
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
		//���� ���ڸ� ������.
		int num = Integer.parseInt(str);
		Integer num2 = Integer.valueOf(str); // 
		
		int i = 100;  //�⺻ �ڷ���
		Integer i2 = new Integer(100); //Integer����������(Wrapper class��)
		
		Integer i3 = 12;//������ ���������� �⺻ �ڷ��� ���� ���� �� �ִ�.(auto-boxing) new Integer(100)�̶�� �ڵ����� �ν��Ѵ�.
		
		int i4 = new Integer(200);  //�̰͵� ������ �ȵȴ�. �ڱ� �ڽ��� �ִ� �ʿ��� �ڷ����� ���� �⺻ �ڷ����� �־��ش�. (auto-unboxing) 
		//�� ��ȯ���� ���� �����̴�. �⺻ �ڷ����� class�� ���� �� -> �ڽ�.
		//�⺻ �ڷ����� �����ڷ����� data�� �ְ� �޴� ��: �ڽ� ��ڽ��̴�.
		
		
		//List<Integer> list = new ArrayList<>();
		List<Integer> list = new LinkedList<>();
		//���˸��� Ÿ�Ը� ���ٸ� linkedlist�� arraylist�� ȣȯ.
		list.add(new Integer(10));
		list.add(20);   //auto boxing; ���� �����Ҷ� �⺻ �ڷ����� �־ �ȴ�.
		
		for(Integer n : list) {
			System.out.print(n + " ");
		}
		
		System.out.println();
		for(int u : list) {          //���� ��ڽ�
			System.out.print(u + " ");
		}
		
		Integer i5 = list.get(0);
		int i6 = list.get(0);
	}
}
