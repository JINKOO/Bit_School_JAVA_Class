package kr.ac.smu.day09.inter01;

public class UserMain {
//������ �ϳ��� ȸ�纰�� ȣȯ�ȴ�.
	public static void main(String[] args) {
		//lg������
		LGTV lgtv = new LGTV();
		
		lgtv.powerOn();
		lgtv.soundUp();
		lgtv.soundDown();
		lgtv.channelUp();
		lgtv.channelDown();
		lgtv.powerOff();
		
		//samsung������
		SamsungTV samTV = new SamsungTV();
		
		samTV.turnOn();
		samTV.channeUp();
		samTV.channeDown();
		samTV.volumnUp();
		samTV.volumnDown();
		samTV.turnOff();
	}
}
