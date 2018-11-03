package kr.ac.smu.day14;

class Sync {
	
	//a()�� ����ɶ� b(),c()�� ���� �ȵǰ�
	public /*synchronized*/ void a() {
		
		//�ɷ��ִ� �ٸ� ����ȭ.
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
	//�߰��� ��ٰ� runnable�� �� �� �ִ�.
	public synchronized void c() {
		for(int i = 1; i <= 10; i++) {
			System.out.print("c");
		}
	}
}

class SyncThread extends Thread {
	
	private Sync sync;   //�����ڿ�
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
		//3���� thread�� �ϳ��� sync��ü�� ���� �����ϴ� ���� ����.
		//�ڹٿ��� �����ڿ��� �Ű����� ���·� �����. 
		
		SyncThread st = new SyncThread(sync, 1);
		SyncThread st2 = new SyncThread(sync, 2);
		SyncThread st3 = new SyncThread(sync, 3); 
	
		
		st.start();
		st2.start();
		st3.start();
		
		
		
	}
}
