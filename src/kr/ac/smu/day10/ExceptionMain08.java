package kr.ac.smu.day10;

import java.util.Scanner;

public class ExceptionMain08 {

	public static void registerID() throws Exception {
		
		System.out.println("����� ID�� �Է� �ϼ���");
		
		Scanner sc = new Scanner(System.in);
		String id = sc.nextLine();
		
		if(id.length() > 8) {//id���̰� 8�̻��̸� ���ܸ� ���������� �ο��ϰ� �ʹ�.(����� ����)
//			throw new Exception("ID�� �ִ� 8���ڸ� �����մϴ�."); //���� ó���ϴ� try catch�� ���� ó��
			throw new CheckIDException(); //���� ���ϴ� �̸��� exception���� �� �ִ�.
		}
		
		System.out.println("ID�� ��� �Ͽ����ϴ�.");
	}
	
	public static void main(String[] args) {
		
		try {
			registerID();
		} catch (Exception e) {
			System.out.println("���� ���� : " + e.getMessage());
			e.printStackTrace();
		}
	}
}
