package kr.ac.smu.day09.inter02;

public class UserMain {

	public static void main(String[] args) {
		
		//LGTV tv = new LGTV();
		TV tv = new LGTV(); //������ ����ȯ.
		//lgtv��ü ����� �����Ѵ�.
		LGTV tv1 = (LGTV)tv;
		tv.powerOn();
		tv.volumnDown();
		tv.channelUp();
		tv.channerDown();
		tv.mute();
		tv.powerOff();
		tv1.copyRight();
		
	
		tv = new SamsungTV();   //tv�� �ٲپ �����ϴ� ��ɾ���ü�� �ٲ��� �ʵ����Ѵ�.
		tv.powerOn();
		tv.volumnDown();
		tv.channelUp();
		tv.channerDown();
		tv.mute();
		tv.powerOff();
	}
}
