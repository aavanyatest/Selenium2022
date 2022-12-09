package daily.programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class charoccurrence {
	public static int charCount(String str) {
		// Write your code here		
		 
		 int val=0;
         char[] ch=str.toCharArray();
         Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
 		for(char ch1 : ch)
         {  
            map.put(ch1, map.getOrDefault(ch1,0)+1) ;   
             }
         System.out.println(map);
         if(map.containsKey('e')) {
        	 val=map.get('e');
        	 System.out.println(val);
         }
         return val;
 
		
	}
	
	public static void main(String[] args) {
		charoccurrence occr=new charoccurrence();
		occr.charCount("Welcome to Chennai");
		
	}

}
