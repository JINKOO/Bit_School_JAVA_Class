package kr.ac.smu.day09.inter02;

//public class LGTV implements TV {
  public class LGTV extends AbstractLGTV {
	  
	private boolean power;
	private int channelNo;
	private int volumn;
	private boolean mute;
	
	public LGTV() {
		System.out.println("LGTV�� �����߽��ϴ�.");
		channelNo = 3;
		volumn = 10;    //TV������ ä���� 3�� ������ 10���� �ʱ�ȭ.
	}
	
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		
		power = false;
	}

	@Override
	public void channelUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void channerDown() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void volumnUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void volumnDown() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mute() {
		// TODO Auto-generated method stub
		mute = !mute;
		if(mute) {
			volumn = TV.MIN_VOLUMN;
		} else {
			volumn++;
		}
		
	}

	@Override
	public void copyRight() {
		System.out.println("���۱��� ������ �ֽ��ϴ�.");
	}



	
	

}
