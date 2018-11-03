package kr.ac.smu.day14;

class Sync {
	
	//a()가 실행될때 b(),c()는 실행 안되게
	public /*synchronized*/ void a() {
		
		//걸려있는 줄만 동기화.
		synchronized (this) {
			for(int i = 1; i<=10; i++) {
				System.out.print("a");
			}
		}
	}	
	public synchronized void b() {
		for(int i = 1; i<=10; i++) {
			System.out.print("b");
		}
	}
	//중간에 찍다가 runnable로 갈 수 있다.
	public synchronized void c() {
		for(int i = 1; i <= 10; i++) {
			System.out.print("c");
		}
	}
}

class SyncThread extends Thread {
	
	private Sync sync;   //공유자원
	private int type;
	
	public SyncThread(Sync sync, int type) {
		this.sync = sync;
		this.type = type;
	}

	@Override
	public void run() {
		
		switch(type) {
		case 1:
			sync.a();
			break;
		case 2:
			sync.b();
			break;
		case 3:
			sync.c();
			break;
		}
	}
}

public class SyncMain01 {

	public static void main(String[] args) {
		
		Sync sync = new Sync();
		//3개의 thread가 하나의 sync객체를 같이 공유하는 것이 목적.
		//자바에서 공유자원은 매개변수 형태로 만든다. 
		
		SyncThread st = new SyncThread(sync, 1);
		SyncThread st2 = new SyncThread(sync, 2);
		SyncThread st3 = new SyncThread(sync, 3); 
	
		
		st.start();
		st2.start();
		st3.start();
		
		
		
	}
}
