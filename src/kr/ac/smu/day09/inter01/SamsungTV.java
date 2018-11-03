package kr.ac.smu.day09.inter01;

public class SamsungTV {

	public SamsungTV() {
		System.out.println("SamsungTV를 구매하였습니다.");
	}
	
	public void turnOn() {
		System.out.println("TV 전원을 켰습니다.");
	}
	
	public void turnOff() {
		System.out.println("TV 전원을 껐습니다.");
	}
	
	public void channeUp() {
		System.out.println("TV 채널을 올립니다.");
	}
	
	public void channeDown() {
		System.out.println("TV 채널을 내립니다.");
	}
	
	public void volumnUp() {
		System.out.println("TV 음량을 올립니다.");
	}
	
	public void volumnDown() {
		System.out.println("TV 음량을 내립니다.");
	}
}
