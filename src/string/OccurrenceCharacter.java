package string;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceCharacter {
    public static void charCount(String str)
    {
        Map<Character,Integer> charMap = new HashMap<>();
        for(Character c : str.toCharArray())
        {
            if(charMap.containsKey(c))
            {
                charMap.put(c,charMap.get(c)+1);
            }
            else
            {
                charMap.put(c,1);
            }
        }
        System.out.println(charMap);

    }
    public static void main(String[] args) {
        String str = "Encyclopedia";
        charCount(str);

    }
}
