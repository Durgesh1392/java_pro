package string;



public class LongestPalindrome {
    public static int longestPalindrome(String str)
    {
        String rev = reverseString(str);
        char[] a = str.toCharArray();
        char[] b = rev.toCharArray();
        //System.out.println(rev);
        int n = a.length;
        int m = b.length;
        int[][] dp = new int[n+1][m+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=m;j++)
            {
                if(i == 0 || j == 0)
                    dp[i][j]=0;
                else if(a[i-1] == b[j-1])
                {
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else
                {
                    dp[i][j] = max(dp[i-1][j] , dp[i][j-1]);

                }
            }
        }
        return dp[m][n];

    }

    static int max(int a, int b)
    {
        if(a>b)
            return a;
        else
            return b;
    }
    public static String reverseString(String str )
    {
        int n = str.length()-1;
        char[] arr = str.toCharArray();
        for(int i=0,j=n;i<=j;i++,j--)
        {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp ;

        }
        str = String.valueOf(arr);
        return str;
    }

    public static void main(String[] args) {
        String s ="aabaaaabb";
        int lent = longestPalindrome(s);
        System.out.println("length is : "+ lent);

    }
}
