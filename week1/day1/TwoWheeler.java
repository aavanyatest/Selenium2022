package week1.day1;

public class TwoWheeler {
	
	int noOfWheels=4;
	short noOfMirrors=2;
	long chassisNumber=5009989900L;
	boolean isPunctured = true;
	String bikeName = "HeroHonda";
	double runningKM= 45.67;
	
	
	
	public static void main(String[] args) {
		TwoWheeler whel= new TwoWheeler();
		System.out.println(whel.noOfWheels);
		System.out.println(whel.noOfMirrors);
		System.out.println(whel.chassisNumber);
		System.out.println(whel.isPunctured);
		System.out.println(whel.bikeName);
		System.out.println(whel.runningKM);
		
	}
}
