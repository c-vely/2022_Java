package kr.ac.kopo.day08.inter02;

public class UserMain {
	
	public static void main(String[] args) {
		
		TV tv = new SamsungTV();
		TV tv2 = new LGTV();
		
		
		tv.powerOn();
		tv.channelUp();
		tv.volumeDown();
		tv.mute();
		tv.powerOff();
		
		
		tv2.powerOn();
		tv2.channelUp();
		tv2.volumeDown();
		tv2.mute();
		tv2.powerOff();
		
		
		
		
		
	}

}
