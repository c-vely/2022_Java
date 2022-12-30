package kr.ac.kopo.day08.inter01;

public class LGTV {
	
	private boolean power;
	
	public LGTV() {
		System.out.println("LGTV를 구매하였습니다.");
	}
	
	
	
    public void turnOn() {
    	System.out.println("전원 ON");    	
    }   
    public void turnOff() {
    	System.out.println("전원 OFF");    	
    }
    
    
    
    public void channelUp() {
    	System.out.println("채널 UP");
    }
    public void channelDown() {
    	System.out.println("채널 DOWN");
    }    
    
    
    
    public void soundUp() {
    	System.out.println("음량 UP");
    }
    public void soundDown() {
    	System.out.println("음량 DOWN");
    }
    
    
    
    
    
}
