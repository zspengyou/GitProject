package lintCode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutDup {

    public static void main(String[] args) {
        LongestSubStringWithoutDup test = new LongestSubStringWithoutDup();
        String s = "abcabcbb";
        int result = test.lengthOfLongestSubstring(s);
        System.out.println(result);

    }
    
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0)
            return 0;
        int low = 0;
        int high = 0;
        Set<Character> set = new HashSet<>();
        int result = 0;
        int length = s.length();
        while(high < length){
            while(high < length && !set.contains(s.charAt(high))){
                set.add(s.charAt(high));
                high ++;
            }
            if(high - low > result){
                result = high - low;
            }
            if(high == length){
                return result;
            }
            while(s.charAt(low)!= s.charAt(high)){
                set.remove(s.charAt(low));
                low ++;
            }
            set.remove(s.charAt(low));
            low ++;
        }
        return result;
        
    }
    

}
