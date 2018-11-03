package kr.ac.smu.day14;

/*
 * Thread��ü�� �����ϴ� 2���� ���.
 * 
 * 1.Thread class�� ��� �޴´�.
 * 2.Runnable interface�� ��� �޴´�.
 * 
 */

class ExtendThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i = 1; i <= 100 ; i++) {
			System.out.println(i + "���� ���� �� ����...");
		}
	}
}

class ImpleThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 100 ; i++) {
			System.out.println(i + "���� ���� �� ����...");
		}
	}
}

public class ThreadMain02 {

	public static void main(String[] args) { //main�� thread�̴�.
		
		ExtendThread et = new ExtendThread();
		ImpleThread it = new ImpleThread();
		Thread t = new Thread(it); //Runnalbe ���� �̷��� ������Ѵ�. 
		///��������� main thread�ϳ��� .
		
		System.out.println("���� ����");
		et.start();
		t.start();
		
		try {
			et.join();
			t.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("���� ����");
		
		
		
//		et.start(); //threadŸ���� ��ü�� start�� �� �� �ִ�.
//		t.start();
//		
//		//���� 3���� thread�� ���￡ ������.
//		
//		for(int i = 1; i<=100; i++) {
//			System.out.println(i + "��° ������");
//		}
		
		//���� ������ �𸥴�.
	}
}
