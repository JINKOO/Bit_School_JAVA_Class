package kr.ac.smu.day09.inter02;

public class UserMain {

	public static void main(String[] args) {
		
		//LGTV tv = new LGTV();
		TV tv = new LGTV(); //묵시적 형변환.
		//lgtv자체 기능은 사용못한다.
		LGTV tv1 = (LGTV)tv;
		tv.powerOn();
		tv.volumnDown();
		tv.channelUp();
		tv.channerDown();
		tv.mute();
		tv.powerOff();
		tv1.copyRight();
		
	
		tv = new SamsungTV();   //tv를 바꾸어도 실행하는 명령어자체가 바뀌지 않도록한다.
		tv.powerOn();
		tv.volumnDown();
		tv.channelUp();
		tv.channerDown();
		tv.mute();
		tv.powerOff();
	}
}
