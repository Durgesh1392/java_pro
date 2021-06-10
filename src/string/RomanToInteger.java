package string;

public class RomanToInteger {
    public static void romaninteger(String str){
        char[] arr = str.toCharArray();
        int n = str.length();
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            int c1 = value(arr[i]);
            if(i+1 < n)
            {
                int c2 = value(arr[i+1]);
                if(c2 > c1)
                {
                    sum = c2-c1;
                    i++;
                    continue;
                }
                else
                {
                    sum += c1;
                    continue;
                }
            }
            sum += c1;
        }
        System.out.println(sum);


    }
    public static int value(char r)
    {
      if( r == 'I') return 1;
      if( r == 'V') return 5;
      if( r == 'X') return 10;
      if( r == 'L') return 50;
      if( r == 'C') return 100;
      if( r == 'D') return 500;
      if( r == 'M') return 1000;

      return -1;

    }

    public static void main(String[] args) {
        String s = "VIII";
        romaninteger(s);
    }
}
