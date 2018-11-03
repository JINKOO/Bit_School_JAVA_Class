package kr.ac.smu.day14;

class PriorityThread extends Thread {

	public PriorityThread() {

	}

	public PriorityThread(String name) {
		super(name);
	}
	
	public void run() {
		System.out.println("우선순위 : " + getPriority());
		for (int i = 1; i <= 100; i++) {
			System.out.println(getName() + " " + i + "번째 호출");	
		}
	}
}

public class PriorityMain {

	public static void main(String[] args) {

		PriorityThread pt = new PriorityThread("우선순위가 1인 Thread");
		PriorityThread pt2 = new PriorityThread("우선순위가 5인 Thread");
		PriorityThread pt3 = new PriorityThread("우선순위가 10인 Thread");

		pt.setPriority(Thread.MIN_PRIORITY);
		pt2.setPriority(Thread.NORM_PRIORITY); // 별다른 말 없으면 5.
		pt3.setPriority(Thread.MAX_PRIORITY);
		
		pt.start();
		pt2.start();
		pt3.start();
	}
}
