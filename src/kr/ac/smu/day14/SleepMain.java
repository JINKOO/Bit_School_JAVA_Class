package kr.ac.smu.day14;

import java.util.Date;

/*
 * block���·�
 */

class SleepThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("���� �ð� : " + new Date().toLocaleString());
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
		
//		�ڹٴ� �⺻���� 1���μ����� 1thread(main) ��, thread��ü ������ �ʴ� �̻�.
		System.out.println(Thread.activeCount()); //���� �������� thread���� �˷���
		
		System.out.println("main Thread 2�ʵ��� ������...");
		try {
		Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main Thread ���...");
		
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
		//go�� ������ ���߿� 1�ʿ� �ѹ��� ����ð� ���.
	}
}
