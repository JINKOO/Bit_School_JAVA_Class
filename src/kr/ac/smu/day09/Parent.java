package kr.ac.smu.day09;

public class Parent {

	private String name = "�θ�";
	
	
	static Parent getInstance() { //Parent��. ��ü�ϳ� ����.
		
		return new Child01();  //���� �Լ� ���� ���⸸ �ٲٸ� �ȴ�. ���� Ÿ���� ������ ����ȯ
	}
	
	
	public void info() {
		System.out.println("name : " + name);
	}
}
