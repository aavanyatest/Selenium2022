package week3.day1;

public class SmartPhone extends AndroidPhone {

	public void connectWhatsApp() {
		System.out.println("Connect whatsapp");
	}
	
	public void takeVideo() {
		System.out.println("video from smartphone");
	}
	
	public static void main(String[] args) {
		SmartPhone phone= new SmartPhone();
		phone.connectWhatsApp();
		phone.makeCall();
		phone.saveContact();
		phone.sendMsg();
		phone.takeVideo();
		
	}
}
