package kr.ac.smu.day13.homwork.lotto4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//로또 공 가지는 기계
//번호가 들어 있는 공을 45개 가지고 있어야한다.

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
