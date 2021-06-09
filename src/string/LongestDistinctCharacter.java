package string;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class LongestDistinctCharacter {
    public static void longestdistinct(String str)
    {
        int n = str.length();
        Map<Character, Integer> mp = new HashMap<Character, Integer>();
        for(int i=0;i<n;i++) {
            mp.put(str.charAt(i), i);
        }
        int len=0, prevlen=0;
        int start=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(mp.get(str.charAt(i)) > start)
            {
                len++;
            }
            else
            {   prevlen = len;
                start = i;
                len=0;
            }
        }
        System.out.println(str.substring(start,start+prevlen));




    }
    public static void main(String[] args) {
        String s = "abc";
        longestdistinct(s);
    }
}
