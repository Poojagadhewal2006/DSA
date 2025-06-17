import java.util.Arrays;

public class NegativeToFront {
    public static void main(String[] args) {
          int arr[] = { 12,-7,-5,3,9,-1,4,-6};
        moveNegativesToFront(arr);

        System.out.println("Rearranged array : " + Arrays.toString(arr));
    }
    public static void moveNegativesToFront(int arr[])
    {
        int j = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] < 0)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        } 
    }
}
