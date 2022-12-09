package daily.programs;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingChar {

	public static void main(String[] args) {
		String s = "abccbaacz";
		Set<Character> val= new HashSet<Character>();
		for(int i=0;i<=s.length()-1;i++) {
			char c=s.charAt(i);
		if(val.contains(c)) {
			System.out.println("First repeating character: " +c);
			break;
		}else {
			val.add(c);
		}
		}
	}

}
