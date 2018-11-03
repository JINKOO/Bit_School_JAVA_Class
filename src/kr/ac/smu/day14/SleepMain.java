package kr.ac.smu.day14;

import java.util.Date;

/*
 * block상태로
 */

class SleepThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("현재 시간 : " + new Date().toLocaleString());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class SleepMain {

	public static void main(String[] args) {
		
//		자바는 기본으로 1프로세스에 1thread(main) 단, thread객체 만들지 않는 이상.
		System.out.println(Thread.activeCount()); //현재 실행중인 thread개수 알려줌
		
		System.out.println("main Thread 2초동안 잠재우기...");
		try {
		Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main Thread 깨어남...");
		
		///////////////////////////////////////////
		
		SleepThread st = new SleepThread();
		st.start();
		System.out.println(Thread.activeCount());
		
		while(true) {
			System.out.println("Go!!!");
			
			try {
				Thread.sleep(10000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		//go가 나오는 와중에 1초에 한번씩 현재시간 찍기.
	}
}
