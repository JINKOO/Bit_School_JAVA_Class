package kr.ac.smu.day05;

/*
 *  
 *  ***********
 *  Hello
 *  ***********
 *  Hi
 *  ***********
 *  Good-by
 *  ***********
 *  
 */

//������� ��Ƴ��� ���� : �޼ҵ�
public class MethodMain01 {

	static void printStar(char c, int star) { // ��ȣ���� �޼ҵ�(ȣ����ϴ� �޼ҵ�)

		for (int i = 0; i < star; i++) {
			System.out.print(c);
			
		}
		System.out.println();
	}

	static int add(int a, int b) {
		int sum = a + b;
		return sum; //return -> ���� ȣ���ߴ� �޼ҵ�� ���� �����ϴ� ���. ȣ���ڿ��� ����� �Ѱ��ٰ����� ���ش�.
		//return;
	}
	
	public static void main(String[] args) { // main : ȣ���� �޼ҵ� (ȣ���ϴ� �޼ҵ�)

		// �ݺ����� �ݺ��Ǵ� ������ ���������� ���ö��� ��밡��.
		
		int sum = add(3,5); //��ȣ���ڰ� ȣ���ڿ��� ������ �� �ִ� ��쿡�� 0-1��. but �迭�� ����ϸ� �������� ���� �� �� �ִ�.
		System.out.println("�μ��� ���� : " + sum);
		
		printStar('*', 10);
		System.out.println("Hello");
		printStar('#', 5);
		System.out.println("Hi");
		printStar('!', 20);
		System.out.println("Good-By");
		printStar('-', 15);

	}
}
