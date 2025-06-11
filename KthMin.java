public class KthMin {
   public static void main(String[] args) {
        int arr[] = {10,3,4,8,9,5,3};
        int max = arr[1];
        int min = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] > max)
            {
                max =arr[i];

            }
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        System.out.println("max is : " + max);
        System.out.println("min is : " + min);
    }
}
