package daily.programs;

import java.util.Arrays;
import java.util.Scanner;

public class LastWordFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.println("Input: ");
		
		String s= input.nextLine();
		
		String[] spl=s.split(" ");
	
		System.out.println(spl[spl.length-1]);
          String lastWord=spl[spl.length-1];
          int len=lastWord.length();
          System.out.println("The last word is \"" +lastWord+ "\" with length " +len+ ".");
          input.close();
	}

}
