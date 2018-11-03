package kr.ac.smu.day09.inter01;

public class UserMain {
//리모컨 하나가 회사별로 호환된다.
	public static void main(String[] args) {
		//lg리모컨
		LGTV lgtv = new LGTV();
		
		lgtv.powerOn();
		lgtv.soundUp();
		lgtv.soundDown();
		lgtv.channelUp();
		lgtv.channelDown();
		lgtv.powerOff();
		
		//samsung리머컨
		SamsungTV samTV = new SamsungTV();
		
		samTV.turnOn();
		samTV.channeUp();
		samTV.channeDown();
		samTV.volumnUp();
		samTV.volumnDown();
		samTV.turnOff();
	}
}
