public class Intersection {
    public static void main(String[] args) {
        int arr[] = {1,2,6,8,9};
        int arr1[] = {6,7,8,9};
         
        System.out.print("Intersection : ");
        for(int i=0;i<arr.length;i++)
        {
            for(int j =0 ; j<arr1.length;j++)
            {
                if(arr[i] == arr1[j])
                {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}
