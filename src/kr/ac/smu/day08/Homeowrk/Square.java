package kr.ac.smu.day08.Homeowrk;

public class Square extends Rectangle { //�� ���� ���̸� �˸� �ȴ�.

	public Square(int x) {
		super(x,x); //rec���� �Ű������� 2���� �����ڹۿ� ����. ȣ���ϸ� �� �����ڿ� ���� ���ϴ� ���� �ֱ� ������ ���⼭ �ȱ��ص� �ȴ�.
	}

	@Override
	public void printArea() {
		System.out.println("���� ���̰� : " + getX() + "�� �� ���簢���� ���� : " + getArea() + "�Դϴ�.");
	}
	
	
}
