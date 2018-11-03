package kr.ac.smu.day14;

class PriorityThread extends Thread {

	public PriorityThread() {

	}

	public PriorityThread(String name) {
		super(name);
	}
	
	public void run() {
		System.out.println("�켱���� : " + getPriority());
		for (int i = 1; i <= 100; i++) {
			System.out.println(getName() + " " + i + "��° ȣ��");	
		}
	}
}

public class PriorityMain {

	public static void main(String[] args) {

		PriorityThread pt = new PriorityThread("�켱������ 1�� Thread");
		PriorityThread pt2 = new PriorityThread("�켱������ 5�� Thread");
		PriorityThread pt3 = new PriorityThread("�켱������ 10�� Thread");

		pt.setPriority(Thread.MIN_PRIORITY);
		pt2.setPriority(Thread.NORM_PRIORITY); // ���ٸ� �� ������ 5.
		pt3.setPriority(Thread.MAX_PRIORITY);
		
		pt.start();
		pt2.start();
		pt3.start();
	}
}
