
import java.util.Arrays;

public class MargeWithoutExtraSpace {
    /*public static void merge(int arr1[], int arr2[]){
        int n = arr1.length;
        int m = arr2.length;
        int k;
        for(int i=0;i<n;i++){
            if(arr1[i] > arr2[0]) {
                int temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;

                int first = arr2[0];
                //int k;
                for(k=1;k<m && arr2[k]<first;k++)
                {
                  arr2[k-1] = arr2[k];
                }
                arr2[k-1] = first; } }}
    public static void main(String[] args) 
    {
        int arr1[] ={1,4,7,8,10};
        int arr2[] = {2,3,9};
        merge(arr1, arr2);
        
        System.out.println("Mergerd arr1 : " + Arrays.toString(arr1));
        System.out.println("Mergerd arr1 : " + Arrays.toString(arr2));

    }*/
    public static void main(String[] args) 
    {
        int arr1[] = {1,4,7,8,10};
        int arr2[] = {2,3,9};
        int n = arr1.length;
        int m = arr2.length;
        int merged[] = new int [n+m];
        for(int i=0;i<n;i++)
        {
            merged[i] = arr1[i];
        }
        for(int i=0;i<m;i++)
        {
            merged[n+i] = arr2[i]; 
        }
        Arrays.sort(merged);
        System.out.println("Merged Array : " + Arrays.toString(merged));
    }
}
