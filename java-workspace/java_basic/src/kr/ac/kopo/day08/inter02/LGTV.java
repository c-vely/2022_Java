package kr.ac.kopo.day08.inter02;

public class LGTV implements TV {
	
	public LGTV() {
		System.out.println("LGTV 구매완료");
	}
	
	
	@Override
	public void powerOn() {
		System.out.println("TV ON");
	}

	@Override
	public void powerOff() {
		System.out.println("TV OFF");
	}

	@Override
	public void channelUp() {
		System.out.println("채널 UP");
	}

	@Override
	public void channelDown() {
		System.out.println("채널 DOWN");
	}

	@Override
	public void volumeUp() {
		System.out.println("음량 UP");
	}

	@Override
	public void volumeDown() {
		System.out.println("음량 DOWN");
	}

	@Override
	public void mute() {
		System.out.println("음소거");
	}

}
