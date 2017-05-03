package interview;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

	public static int lengthOfLongestSubstring(String s){
		int length = 0;
		int startIndex = 0;
		Set<Character> set = new HashSet<Character>();
		for (int i = 0; i < s.length();i++){
			if (set.contains(s.charAt(i))){
				if (length < set.size()){
					length = set.size();
				}
				startIndex++;
				i = startIndex-1;
				set = new HashSet<>();
			}
			else{
				set.add(s.charAt(i));
				if (i == s.length()-1 && length < set.size()){
					length = set.size();
				}
				//endIndex = i;
			}
		}
		return length;
	}
	
	public static void main (String args[]){
		String s = "bbbbb";
		System.out.println(lengthOfLongestSubstring(s));
	}
	
}
