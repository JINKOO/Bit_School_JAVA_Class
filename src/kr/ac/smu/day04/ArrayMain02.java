package kr.ac.smu.day04;

import java.util.Arrays;

public class ArrayMain02 {
/*
 * ������ ���� �迭
 */
	public static void main(String[] args) {
		
	//"����" "�ڹ�" "����" ���ڿ� �����ϴ� strArr�迭 ����
		
		//String[] strArr = {"����", "�ڹ�", "����"};
		//String[] strArr = new String[] {"����", "�ڹ�", "����"};
		
		//���ڿ��� ���̸� �𸥴�.
		//���� �ڷ� �迭�� ���������� 2���� �迭 ���¸� ���Ѵ�.
		//������ ���� �����迭�� �ǹ��Ѵ�.(�⺻�ڷ��� �迭���� �ٸ���.)
		//"����"�� ���� ������ �����ϰ� ���������� �̸� ����Ų��.(2�����迭 ����)
		
		String[] strArr = new String[5];
		/*
		 * 1.strArr �������� ����
		 * 2.new�� ���� heap������ ���� �����迭 ���� (�ʱ�ȭ ���ϸ� ���� null���� ����.)
		 * 3.�� ������ �迭�� ���ڿ��� ����Ű���� �ؾ��Ѵ�.(null���� �ƴ϶� �ش� ���ڿ��� ����Ų��.)
		 * 
		 */
		
//		strArr[0] = "����";
//		strArr[1] = "�ڹ�";
//		strArr[2] = "����";

		/*
		 * data �߰��� ���� 
		 * index���� ������ �����ؾ��Ѵ�.(index�� ���� ������ �߻��Ѵ�.)
		 * index�� ��Ÿ���� ������ �̿��ϴ� ���� ����.
		 * ���԰� ������ �����Ӱ� �ȴ�.
		 * 
		 */
		
//		int loc = 0;
//		strArr[loc++] = "����";
//		strArr[loc++] = "�ܿ����";
//		strArr[loc++] = "�ڹ�";
//		strArr[loc++] = "����";
		
		//���� ������ �׻� newŰ���� ���. String�� Ư���ϰ� �⺻ �ڷ����� ���� ���� ��Ÿ���� �ִ�.
		//but ��ü ������ ������ newŰ���� ����Ͽ� ��Ÿ���� ���� �Ϲ����̴�.
		
		strArr[0] = new String("����");
		strArr[1] = new String("�ڹ�");
		strArr[2] = new String("����");
		System.out.println("<��� 1 - index�̿� >");
		for(int i = 0; i<strArr.length; i++) {
			System.out.print(strArr[i] + "\t");
		}
		System.out.println();
		
		System.out.println("<��� 2 - 1.5������ for��>");
		for(String str : strArr) {
			System.out.print(str + "\t");
		}
		System.out.println();
		
		System.out.println("<��� 3 - Arrays.toString()>");
		System.out.println(Arrays.toString(strArr));
		
		
		Hotdog hot; //���� ���� ������ ����(heap������ ���� ���� �ȸ���).
		hot = new Hotdog(); //heap������ ���� ����� hot�� �� ������ ����Ų��.
		
		Hotdog hot2 = new Hotdog();
		
		//����ڰ� ���� class�ڷ����� �ּ� ��½� package + �ּҰ� ���´�.
		System.out.println("hot : " + hot);
		System.out.println("hot : " + hot2);
		
		Hotdog[] hotArr = new Hotdog[2]; //�������� 2���� ����. ���� null�� �ʱ�ȭ ���ִ�.
		hotArr[0] = new Hotdog();
		hotArr[1] = new Hotdog();
		
		for(int i = 0; i<hotArr.length; i++) {
			
		}
		
		System.out.println(Arrays.toString(hotArr)); //�ʱ�ȭ ������ �����Ƿ� null�� ���
	}
}

class Hotdog { //�� �̸��� �ڷ����� �� �� �ִ�. =>Hotdog�̿��Ͽ� �迭�� ���� �� �ִ�.
	
}
