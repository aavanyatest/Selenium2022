package week1.day1;

public class Mobile {
	
	public void makeCall() {
		System.out.println("make call");
		
	}

	public void sendMsg() {
		System.out.println("send Message");
	}
	
	public static void main(String[] args) {
		Mobile mob = new Mobile();
		mob.makeCall();
		mob.sendMsg();
	}
}
