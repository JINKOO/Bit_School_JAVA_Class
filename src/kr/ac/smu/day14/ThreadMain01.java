package kr.ac.smu.day14;

class AAA extends Thread { //go�� ��� thread

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("go !!!");
		}
	}
}


class BBB extends Thread {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("\tstop !!!");
		}
	}
	
}

public class ThreadMain01 {

	public static void main(String[] args) {
		
		AAA ta = new AAA();
		BBB tb = new BBB();  //���� ready
		
//		ta.run();
//		tb.run();    //���� ����(�̰� �׳� ����ڰ� ���� �����ϴ� ����̴�.)
		
		ta.start();
		tb.start();  //���� A,B thread�� ť�� ��. ������ JVM�� �Ѵ�. ����ڴ�run�� ���������� ����.
		
	}
}
