package kr.ac.smu.day14;


class BoyThread extends Thread {
	
	public void run() {
		System.out.println("(���� ģ��) : ���� ����ģ�� Thread�Դϴ�.");
		System.out.println("(���� ģ��) : ���� ����ģ���� ��ȭ�� ����� �Ͽ����ϴ�.");
		System.out.println("(���� ģ��) : ������ ��ȭ�ð��� �� ���� �ʾҽ��ϴ�.");
//		System.out.println("(���� ģ��) : ����ģ���� �ö� ���� ��ٸ��ڽ��ϴ�.");
		System.out.println("(���� ģ��) : ���� �γ����� 5�ʱ�����.");
		
		//����ģ���� Thread�� �ٳ����� ���ा���Ѵ�.
		GirlThread gt = new GirlThread();
		gt.start();
		
		
		//����ģ��thread�� ���������� run���� ������ block���� ����. ������ ������ ��� ��ٸ���
		//���� ����ģ���� ���ѹݺ� �ڵ尡 ������ boy�°�� block
		try {
//			gt.join();
			gt.join(5000); //5�ʰ� ������ ������ runnalble��
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
//		System.out.println("(���� ģ��) : ����ģ���� �Խ��ϴ�.");
//		System.out.println("(���� ģ��) : ����ģ���� ��ȭ�� �������ϴ�.");
		System.out.println("(���� ģ��) : 5��������. ��������.");
	}
}

class GirlThread extends Thread {
	
	public void run() {
		
		System.out.println("(����ģ��) : ���� ����ģ�� Thread�Դϴ�.");
		System.out.println("(����ģ��) : ���� ����ģ���� �������� üũ�ϰڽ��ϴ�.");
		System.out.println("(����ģ��) : 10�ʵ� ����ٸ��� ����ģ���� �ƴϰ���???");
	
		for(int i = 1; i<=10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("(����ģ��) : " + i + "�ʰ� �������ϴ�. ����ģ���� ��ٸ����??");
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("(����ģ��) : ����ģ���� �����ϴ�.");
	}
}

public class JoinMain {

	public static void main(String[] args) {
		
		BoyThread bt = new BoyThread();
		bt.start();
		
//		GirlThread gt = new GirlThread();
//		gt.start();
		
	}
}
