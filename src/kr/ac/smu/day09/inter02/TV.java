package kr.ac.smu.day09.inter02;

public interface TV { //TV�� �⺻���� ��ɵ�.

    /* public static final */ 
	int MAX_VOLUMN = 50; //�ִ� ����.
	int MIN_VOLUMN = 0; //�ּ� ����.
	
	void powerOn();
	void powerOff();
	void channelUp();
	void channerDown();
	void volumnUp();
	void volumnDown();
	void mute();
	
	
	//�������̽��� default�Ἥ ������ �޼ҵ� �� �� �ִ�. but ���� ����� �ƴϴ�.
//	default public void copyRight() {
//		System.out.println("��� ���۱��� �����ǿ��� �ֽ��ϴ�.");
//	}
}
