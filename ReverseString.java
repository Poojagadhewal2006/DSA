public class ReverseString {
    public static void main(String[] args) {
        String str = "naman";
        for(int i=str.length()-1;i>=0;i--)
        {
            System.out.println(str.charAt(i));
        }
    }
}
