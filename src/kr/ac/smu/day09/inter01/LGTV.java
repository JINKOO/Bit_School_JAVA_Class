package kr.ac.smu.day09.inter01;

public class LGTV {

	private boolean power;
	
	public LGTV() {
		System.out.println("LGTV를 구매하였습니다.");
	}
	
	public void powerOn() {
		System.out.println("TV 전원 ON");
	}
	
	public void powerOff() {
		System.out.println("TV전원 OFF");
	}
	
	public void channelUp() {
		System.out.println("TV전원 UP");
	}
	
	public void channelDown() {
		System.out.println("TV전원 Down");
	}
	
	public void soundUp() {
		System.out.println("TV음량 UP");
	}
	
	public void soundDown() {
		System.out.println("TV음량 DOWN");
	}
}
