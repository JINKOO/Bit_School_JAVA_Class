package kr.ac.smu.day09.inter02;

public interface TV { //TV의 기본적인 기능들.

    /* public static final */ 
	int MAX_VOLUMN = 50; //최대 음량.
	int MIN_VOLUMN = 0; //최소 음량.
	
	void powerOn();
	void powerOff();
	void channelUp();
	void channerDown();
	void volumnUp();
	void volumnDown();
	void mute();
	
	
	//인터페이스는 default써서 구현된 메소드 쓸 수 있다. but 좋은 방식은 아니다.
//	default public void copyRight() {
//		System.out.println("모든 저작권은 고진권에게 있습니다.");
//	}
}
