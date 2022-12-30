package kr.ac.kopo.day08.inter02;

// 인터페이스 -> 클래스 상속
public class SamsungTV implements TV{
	
	
	private boolean power;
	private int channelNo;
	private int volumeSize;
	
	public SamsungTV() {
		System.out.println("삼성 tv를 구매했습니다");
		power = false;
		channelNo = 7;
		volumeSize = 10;
	}
	
	private void info() {
		System.out.println("채널번호 : " + channelNo + ", 음량크기 : " + volumeSize);
	}
	
	
	

	@Override
	public void powerOn() {
		power = true;
		System.out.println("전원이 켜졌습니다");
		info();
		
	}

	@Override
	public void powerOff() {
		power = false;
		System.out.println("전원이 꺼집니다");
		
	}

	@Override
	public void channelUp() {
		channelNo++;
		System.out.println("채널을 올립니다.");
		info();
	}

	@Override
	public void channelDown() {
		channelNo--;
		System.out.println("채널을 내립니다.");
		info();
	}

	@Override
	public void volumeUp() {
		volumeSize++;
		System.out.println("음량을 올립니다.");
		info();
	}

	@Override
	public void volumeDown() {
		volumeSize--;
		System.out.println("음량을 내립니다.");
		info();		
	}

	@Override
	public void mute() {
		volumeSize = TV.MIN_VOLUME_SIZE;
		System.out.println("음소거 되었습니다");
		info();			
	}

}
