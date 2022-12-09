package daily.programs;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SentenceArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String val;
String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
Map<String, Integer> sentMap = new HashMap<String, Integer>();
for (String sent : sentences) {
	System.out.println(sent);
	int count=0;
	for (int i=0;i<=sent.length()-1;i++) {
		if(sent.charAt(i) == ' ') {
			count++;
		}
		
	}
	count=count+1;
	System.out.println(count);
	sentMap.put(sent, count);
}

int maxVal= Collections.max(sentMap.values());

System.out.println("Max number of words from the given array of sentence is: " +maxVal);


	}

}
