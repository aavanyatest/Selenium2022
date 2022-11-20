package week1.day1;

public class Mobile2 {
	String mobileBrandName = "MOTOROLA G 40";
	char mobileLogo = 'M';
	short noOfMobilePiece = 10 ;
	int modelNumber = 40099000 ;
	long mobileImeiNumber = 4000000346666L;
	float mobilePrice = 15000f;
	boolean isDamaged = false ;
	
	public static void main(String[] args) {
		Mobile2 mobFeature= new Mobile2();
		System.out.println(mobFeature.mobileBrandName);
		System.out.println(mobFeature.mobileLogo);
		System.out.println(mobFeature.noOfMobilePiece);
		System.out.println(mobFeature.modelNumber);
		System.out.println(mobFeature.mobileImeiNumber);
		System.out.println(mobFeature.mobilePrice);
		System.out.println(mobFeature.isDamaged);
	}
}
