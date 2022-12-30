package kr.ac.kopo.day08.inter02;

// 인터페이스
public interface TV {
	
	// 상수 변수 (public static final 생략 가능)
	/*public static final*/ int MAX_VOLUME_SIZE = 70;
	int MIN_VOLUME_SIZE = 0;
	
	
	// 추상 메소드 (public abstract 생략 가능)
	/*public abstract*/ void powerOn();
	void powerOff();
	void channelUp();
	void channelDown();
	void volumeUp();
	void volumeDown();
	void mute();
	
	
	

}
