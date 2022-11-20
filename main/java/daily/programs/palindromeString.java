package daily.programs;

import java.util.Scanner;

public class palindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.println("Input : ");
		String s=input.nextLine();
		String lcase=s.toLowerCase();
		String val =lcase.replaceAll("[^A-Za-z]","");
		
		String rev="";
		System.out.println(val);
		for(int i=0; i<val.length();i++) {
			rev=val.charAt(i)+rev;
			
		}
		System.out.println(rev); 
	if(val.equals(rev)) {
		System.out.println("\"" +val +  "\" is a palindrome");
	} else {
		System.out.println("\"" +val +  "\" is not a palindrome");

	}
	
	input.close();

	}

}
