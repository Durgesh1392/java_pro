package string;

public class PalindromeString {
    public static void checkPalindrome(String str)
    {
        int n = str.length() - 1;
        for(int i =0, j=n; i<=j;i++,j--)
        {
            if(str.charAt(i) != str.charAt(j))
            {
                System.out.println("not palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
        return;

    }
    public static void main(String[] args) {
        String str = "nitin";
        checkPalindrome(str);
    }

}
