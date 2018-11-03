package kr.ac.smu.day14;

class NameThread extends Thread {

	public NameThread() {
		super();
	}

	public NameThread(String name) {
		super(name);
	}

	@Override
	public void run() {		
		System.out.println("�������� Thread�̸� : " + getName());
		
		int index = getName().lastIndexOf('-');
		String str = getName().substring(index);
		
		setName("changeThread" + str);
		
		System.out.println("����� THread�̸��� : " + getName());
		
		//�� ��ü �ڵ带 �� ���� �����ؾߵȴٴ� ������ ����.
	}
}

public class NameThreadMain {

	public static void main(String[] args) {
		
		NameThread nt = new NameThread(); //�̸� ���� ���ϸ� 0���� �����.
		NameThread nt2 = new NameThread("nameThread-1"); //�̸��� ������ thread���� �� �ִ�.
		
		nt.start();
		nt2.start();
		//���� ���� ���׹���.
	}
}
