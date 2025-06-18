public class Palindrome {
    public static void main(String[] args) {
        int a=121;
        int original = a;
        int res = 0;
        while(a > 0)
        {
            int digit = a % 10;
            res = res * 10 + digit;
            a = a/10;
        }
        if(original == res)
        {
            System.out.println("Yes, it is a Palindrome");
        }
        else
        {
            System.out.println("No, it is not Palindrome");
        }

    }
}
