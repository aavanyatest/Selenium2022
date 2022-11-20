package week1.day2;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num=num1;
		int sum = 0;

		while (num > 0 || sum >9) {
			
			if(num==0) {
				num=sum;
				sum=0;
			}
			int rem = num % 10;
			sum = sum + rem*rem;
			num = num / 10;
		}
			
		if(sum==1)	{
			System.out.println("\""+ num1 + "\" is happy number");
		} else {
			System.out.println("\""+ num1 + "\" is not happy number");
		}
																																																																																																																																																									
		sc.close();
		
		
		
	}
}
