package kr.ac.smu.day14;

class AAA extends Thread { //go만 찍는 thread

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
		BBB tb = new BBB();  //현재 ready
		
//		ta.run();
//		tb.run();    //수행 시작(이건 그냥 사용자가 직접 수행하는 경우이다.)
		
		ta.start();
		tb.start();  //현재 A,B thread가 큐에 들어감. 이제는 JVM이 한다. 사용자는run을 수행한적이 없다.
		
	}
}
