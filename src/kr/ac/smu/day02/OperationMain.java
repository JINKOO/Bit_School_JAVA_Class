package kr.ac.smu.day02;

//�� ������ ��ȯ��Ģ ���� ���Ѵ�.

public class OperationMain {

	public static void main(String[] args) {

		int num = 12;
		int num2 = 4; //num2��  num�� ������� num2�� 0�̸� ������ �߻� �Ѵ�.
		
		System.out.println("��� ���� �Ǵ�" + (num2 != 0 && num % num2 == 0));
		int a = 1;
		int b = 0;
		int c = -1;
		
		//System.out.println(++a > 0 && --b < 0 && ++c > 0);
		//System.out.println(++a > 0 && ++c > 0 && --b < 0); //b�� ������ �ƿ� ���� �ʴ´�. �տ��� false�̹Ƿ� b�� ��ȭ ����.
		System.out.println(a-- <= 0 && ++b >= 0 || ++c >= 0); //and�켱���� > or //b�� ���Ĵ� ����
		//System.out.println(--a >= 0 || ++b >= 0 && ++c >= 0); //�տ��� ���̹Ƿ� �ڿ� b c�ƿ� �Ĵٺ��� �ʴ´�.
		System.out.println("a = " + a + ", b = " + b + ", c = " + c);
	}
}
