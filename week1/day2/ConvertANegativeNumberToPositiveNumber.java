package week1.day2;

public class ConvertANegativeNumberToPositiveNumber {

	public static void main(String[] args) {
		int num= -40 ;
		if(num<0) {
			System.out.println("The given number is negative number");
			num= -(num);
			System.out.println("Converted negative number to positive number: " +num);
		}

	}

}
