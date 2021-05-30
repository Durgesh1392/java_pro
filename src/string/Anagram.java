package string;

public class Anagram {
    public static void main(String[] args) {
        String a = "geeksforgbeks", b = "forgeeksgeeks";
        char[] ch1= new char[256];
        char[] ch2= new char[256];
        int n=a.length();
        int m=b.length();
        if(n != m )
        {
            System.out.println("not anagram");
            return;
        }
        for(int i=0;i<n;i++)
        {
            ch1[a.charAt(i)]++;
            ch2[b.charAt(i)]++;
        }
        for(int i=0;i<256;i++)
        {
            if(ch1[i] != ch2[i])
            {
                System.out.println("not anagram");
                return;
            }
        }
        System.out.println("anagram");
    }
}
