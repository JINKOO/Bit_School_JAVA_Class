package kr.ac.smu.day04;
import java.util.Arrays;
public class ArrayMain {

	/*
	 * 
	 * �迭�� ����ϴ� 3����
	 * 1. index �̿�
	 * 2. 1.5���� for�� �̿�
	 * 3. Arrays.toString() �޼ҵ� �̿�
	 * 
	 * 2,3�� �Ϻκ��� data�� ��� �Ұ���. ������ ó������ ������
	 */
	
	public static void main(String[] args) {
		
		//int���� ����ϴ� iArr�迭 ����
		int[] iArr;
		
		//System.out.println("iArr : " + iArr); iArr�� �ʱ�ȭ�Ǿ������ʾ� �����߻�(Stack����)
		
		//������ 5�� �����ϴ� �迭 ����
		iArr = new int[5]; 
		//�ʱ�ȭ �Ǿ����� �ʾ� ���� 0�� ����ִ�.
		
		System.out.println("iArr : " + iArr); //heap������ ����
		System.out.println("iArr�� ���Ұ��� : " + iArr.length);
		System.out.println("ù��° ���� : " + iArr[0]); //���⼭�� �ʱ�ȭ �Ǿ����������� ����Ʈ������ 0�� ���
		
		
		//iArr�� ������ ������� 10,20,30,40,50����
		iArr[0] = 10;
		iArr[1] = 20;
		iArr[2] = 30;
		iArr[3] = 40;
		iArr[4] = 50;
		
		System.out.println("<PRINT>");
		System.out.print(iArr[0] + "\t");
		System.out.print(iArr[1] + "\t");
		System.out.print(iArr[2] + "\t");
		System.out.print(iArr[3] + "\t");
		System.out.print(iArr[4] + "\t");
		System.out.println();
		System.out.println("<index�� �̿��� ���>");  //index������ ���� �Ϻ� ���Ҹ� ��� ����.
		
		iArr = new int[] {10,20,30,40,50};
		for(int i = 0; i < iArr.length; i++) {   //length Ű���带 �̿��Ѵ�.
			System.out.print(iArr[i] + "\t");
		}
		System.out.println();
		
//		iArr = new int[3];
//		System.out.println("iArr : " + iArr); //�ּҰ� �ٲ�� �ִ�. 
		
		
		System.out.println("<1.5������ for�� �̿� ���>"); //������ �迭 ���� ���� ��ŭ ���. //��� or �˻��ϴ� �뵵�θ� ���. �Է� �뵵 �ȵ�
		for(int temp : iArr) { //for(�ӽú��� : �迭��), iArrlength��ŭ ����. ó�� �ѹ����� int temp = iArr[0]���� ������. 
			System.out.print(temp + "\t");
		}
		System.out.println();
		
		System.out.println("< Arrays.toString() �޼ҵ� �̿� ���>"); // ���ϰ��� String. ���ҵ��� ���ڿ����·� ���
		String str = Arrays.toString(iArr); //[] ��,�� �̿��ؼ� ���ڿ� ���·� ������ش�.
		System.out.println(str);
	}
}
