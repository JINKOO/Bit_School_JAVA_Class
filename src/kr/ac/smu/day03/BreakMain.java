package kr.ac.smu.day03;

public class BreakMain {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++) {
			System.out.print("�ݺ��� ����...");
			System.out.print(i + " ");
			
			if(i >= 3)  // if(i>=3) ���� ���δ�.
				//break;//���⼭ ���尡��� �ݺ������� �������´�.�ݺ��� ���� ����
				continue; //�ݺ����� �ϴ� ������ Ƚ����ŭ ���ƾ��Ѵ�. continue������ �����������Ͼ� ������, ���������� �Űܰ���.
			System.out.println("...�ݺ��� ����");
		}
		
		System.out.println();
	}
}
