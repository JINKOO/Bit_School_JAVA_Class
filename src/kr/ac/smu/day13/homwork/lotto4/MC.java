package kr.ac.smu.day13.homwork.lotto4;

public class MC {

	public void ment() {
		
		System.out.println("제 1회 상명 로또 방송을 시작 합니다.");
		
		Machine machine = new Machine();
		
		for(int i = 0; i<6; i++) {
			Ball ball = machine.getBall();
			System.out.print(i+1 + "번쨰 로또 번호는 ");
			
			try {
				Thread.sleep(1000); //잠깐 1초동안 멈춤
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			System.out.println(ball.getNumber() + "입니다.");
		}
	}
}
