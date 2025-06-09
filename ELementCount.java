
import java.util.Scanner;

public class ELementCount {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter number of Element : ");
       int n = scanner.nextInt();
       int arr[] = new int [n];
       System.out.println("Enter " + n + "numbers :");
       for(int i=0;i<n;i++)
       {
        arr[i] = scanner.nextInt();
       } 
       System.out.println("Enter number to count :");
       int target = scanner.nextInt();
       int count = 0;
       for(int num : arr)
       {
        if(num == target)
        {
            count++;
        }
       }
       System.out.println(target + " occurs " + count + "times.");
    }
}
