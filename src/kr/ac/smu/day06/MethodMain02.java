package kr.ac.smu.day06;

public class MethodMain02 {

	//�ٸ� Ŭ������ ����ִ� �޼ҵ带 ����Ϸ��� �� �ش� �޼ҵ尡 �ִ� Ŭ������ �ν��Ͻ� ��ü�� �����ؾ��Ѵ�.
	public static void main(String[] args) {
		
		Method m = new Method();  //m�� ����Ű�� ��ü�� �۵��ϰ� �Ѵ�.
		m.call();
		m.call(10);
		m.call(12.34);
		m.call('A'); //char���� ������ ��������ȯ���� �갡 ���� �� �ִ� �޼ҵ带 ã��(int�� �ִ�.)
	}
}
