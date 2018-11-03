package kr.ac.smu.day14;

/*
 * Thread객체를 생성하는 2가지 방법.
 * 
 * 1.Thread class를 상속 받는다.
 * 2.Runnable interface를 상속 받는다.
 * 
 */

class ExtendThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i = 1; i <= 100 ; i++) {
			System.out.println(i + "번쨰 인형 눈 붙임...");
		}
	}
}

class ImpleThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 100 ; i++) {
			System.out.println(i + "번쨰 인형 코 붙임...");
		}
	}
}

public class ThreadMain02 {

	public static void main(String[] args) { //main도 thread이다.
		
		ExtendThread et = new ExtendThread();
		ImpleThread it = new ImpleThread();
		Thread t = new Thread(it); //Runnalbe 쓰면 이렇게 해줘야한다. 
		///여기까지는 main thread하나만 .
		
		System.out.println("감독 시작");
		et.start();
		t.start();
		
		try {
			et.join();
			t.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("감독 종료");
		
		
		
//		et.start(); //thread타입의 객체만 start를 쓸 수 있다.
//		t.start();
//		
//		//이제 3개의 thread가 경쟁에 빠진다.
//		
//		for(int i = 1; i<=100; i++) {
//			System.out.println(i + "번째 감독중");
//		}
		
		//수행 순서는 모른다.
	}
}
