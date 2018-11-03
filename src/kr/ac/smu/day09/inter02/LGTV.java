package kr.ac.smu.day09.inter02;

//public class LGTV implements TV {
  public class LGTV extends AbstractLGTV {
	  
	private boolean power;
	private int channelNo;
	private int volumn;
	private boolean mute;
	
	public LGTV() {
		System.out.println("LGTV를 구매했습니다.");
		channelNo = 3;
		volumn = 10;    //TV켰을때 채널은 3번 음량은 10으로 초기화.
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
		System.out.println("저작권은 나에게 있습니다.");
	}



	
	

}
