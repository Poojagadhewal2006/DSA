import java.util.HashSet;
import java.util.Set;
public class Union {
    public static void main(String[] args) {
        int arr[] = {1,2,6,8,9};
        int arr1[] = {6,7,8,9};
         
        //Unoin
        Set<Integer> union = new HashSet<>();
        for(int num : arr)
        union.add(num);
        for(int num : arr1)
        union.add(num);

        System.out.println("Union : " + union);
       

    }
}
