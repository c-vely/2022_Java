package kr.ac.kopo.day09.inter01;

public class SamsungTV {
	
	private boolean power;
	
	public SamsungTV() {
		System.out.println("삼성TV를 구매하였습니다.");
	}
	
	
	
    public void powerOn() {
    	System.out.println("전원을 켭니다");    	
    }   
    public void powerOff() {
    	System.out.println("전원을 끕니다");    	
    }
    
    
    
    public void channelUp() {
    	System.out.println("채널번호를 올립니다.");
    }
    public void channelDown() {
    	System.out.println("채널번호를 내립니다.");
    }    
    
    
    
    public void volumeUp() {
    	System.out.println("볼륨을 올립니다.");
    }
    public void volumeDown() {
    	System.out.println("볼륨을 내립니다.");
    }
    
    
    
    
    
}
