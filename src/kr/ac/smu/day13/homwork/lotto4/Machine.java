package kr.ac.smu.day13.homwork.lotto4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//�ζ� �� ������ ���
//��ȣ�� ��� �ִ� ���� 45�� ������ �־���Ѵ�.

public class Machine {

	private List<Ball> balls;
	
	public Machine() {
		balls = new ArrayList<>();
		for(int i = 1; i<=45; i++) {
			balls.add(new Ball(i));
		}
	}
	
	public void start() {
		Collections.shuffle(balls);
	}
	
	public Ball getBall() {
		return balls.remove(0);
	}
}
