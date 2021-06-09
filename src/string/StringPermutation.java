package string;

public class StringPermutation {
    public static void permute(String str, int l, int r)
    {
        if(l == r){
            System.out.print(str + " ");
        }
        for(int i=l; i<=r; i++)
        {
            str = swap( str, l, i);
            permute(str, l+1, r);
            str = swap(str, l, i);

        }
    }
    public static String  swap(String str, int a, int b)
    {
        char[] temp_arr =str.toCharArray();
        char temp = temp_arr[a];
        temp_arr[a] = temp_arr[b];
        temp_arr[b] = temp ;
        return String.valueOf(temp_arr);

    }
    public static void main(String[] args) {
        String str = "ABCD";
        int l = 0;
        int r = str.length() - 1;
        permute(str, l, r);
    }
}

