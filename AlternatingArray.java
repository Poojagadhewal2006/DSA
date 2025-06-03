public class AlternatingArray
{
       public static void rearrange(int arr[])
    {
        int n =arr.length;
        int result[] = new int[n];
        int posIndex = 0;
        int negIndex = 1;
        for (int i = 0; i < arr.length;i++) {
          if(arr[i] >= 0)
          {
            if(posIndex < n)
            {
                 result[posIndex] = arr[i];
                 posIndex  += 2;

            }
        }
            else
            {
              if(negIndex < n)
              {
                result[negIndex] = arr[i];
                negIndex += 2;
              }
            }  
        }
          for(int i =0 ;i< n ;i++)
          {
            arr[i] = result[i];
          }  
        }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,-4,-1};
        rearrange(arr);
        System.out.println("Rearranged Array : ");
        for(int num : arr)
        { 
            System.out.println(num + " ");
        }
    }

}


