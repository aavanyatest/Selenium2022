package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int input =9;
		int count=0;
		for(int i=1 ; i<=input;i++) {
			if(input%i==0) {
				count++;
			}
			
			
		}
		
		if(count==2) {
			System.out.println("Prime number");
		}else {
			System.out.println("Not Prime NUmber");
		}

	}

}
