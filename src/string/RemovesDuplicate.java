package string;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemovesDuplicate {
    public static void RemoveDup(String s)
    {
        Set<Character> st = new LinkedHashSet<>();
        for(int i=0;i<s.length();i++)
        {
            if(!st.contains(s.charAt(i)))
            {
                st.add(s.charAt(i));
            }
        }
        System.out.println(st);
    }
    public static void main(String[] args) {
        String s = "zvvo";
        RemoveDup(s);

    }
}
