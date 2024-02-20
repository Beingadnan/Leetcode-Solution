import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int windowSize=0;
        HashMap<Character,Integer>freq=new HashMap<>();
        for(int end=0;end<s.length();end++){
            while(freq.getOrDefault(s.charAt(end),0)==1){
                freq.put(s.charAt(start),0);
                start++;
            }
            freq.put(s.charAt(end),1);
            windowSize=Math.max(windowSize,end-start+1);
        }
        return windowSize;
    }
}

