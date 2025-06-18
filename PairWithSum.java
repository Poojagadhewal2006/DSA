
import java.util.Scanner;

public class PairWithSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ELEMENTS : ");
        int n = scanner.nextInt();
        int arr[] = new int [n];
        System.out.println("ENTER " + n + "NUMBERS :");
        for (int i= 0; i< n;i++) {
          arr[i] = scanner.nextInt();
        }
        System.out.println("ENTER THE SUM TO FIND : ");
        int target = scanner.nextInt();
        System.out.println("PAIRS WITH SUM : " + target + " : ");
        for (int i = 0;i < n; i++) 
        {
         for(int j=i+1;j<n;j++)
         {
            if(arr[i] + arr[j] == target)
            {
                System.out.println(arr[i] + " + " + arr[j]);
            }
         }
        }
    }
}
