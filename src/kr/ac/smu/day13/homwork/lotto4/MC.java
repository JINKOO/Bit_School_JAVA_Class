package kr.ac.smu.day13.homwork.lotto4;

public class MC {

	public void ment() {
		
		System.out.println("�� 1ȸ ��� �ζ� ����� ���� �մϴ�.");
		
		Machine machine = new Machine();
		
		for(int i = 0; i<6; i++) {
			Ball ball = machine.getBall();
			System.out.print(i+1 + "���� �ζ� ��ȣ�� ");
			
			try {
				Thread.sleep(1000); //��� 1�ʵ��� ����
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			System.out.println(ball.getNumber() + "�Դϴ�.");
		}
	}
}
