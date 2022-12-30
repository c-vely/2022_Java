package kr.ac.kopo.day08.inter01;

public class UserMain {
	
	public static void main(String[] args) {		
		
		// 1) 노가다
		SamsungTV sam = new SamsungTV();
		sam.powerOn();
		sam.channelUp();
		sam.volumeUp();
		sam.volumeUp();
		sam.volumeUp();
		sam.volumeDown();
		sam.powerOff();		
		
		LGTV lg = new LGTV();
		lg.turnOn();
		lg.channelUp();
		lg.soundUp();
		lg.soundUp();
		lg.soundUp();
		lg.soundDown();
		lg.turnOff();
		
		
		// 2) 공통 기능 묶어 표준화하기(추상메소드를 가지겠다는 뜻 --> 인터페이스를 사용하면 좋음, 기본의 설계도를 많이 바꾸지 않을 수 있음. 클래스를 사용하면 많이 훼손하게 될 수 있음)
		
		
	
	}
	
	

}
