public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {3,6,9,4,8};
         for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println(" ");
         for(int i=arr.length-1;i>=0;i--)
        {
           System.out.println(arr[i]);
        }
    }
}
