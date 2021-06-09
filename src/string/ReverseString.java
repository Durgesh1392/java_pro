package string;

public class ReverseString {
    private static void reverse(String str)
    {
        String rev = "";
        String[] arr =str.split(" ");
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i] +" ");
        }

    }
    public static void main(String[] args) {
        String str = "Discovery abc";
        reverse(str);
    }
}
